# Migrating from an On-Premises DXP Installation

This article will walk you through the essential steps for migrating your existing Liferay DXP instance to DXP Cloud.

1. [Migrate the Database and Document Library](#migrate-the-database-and-document-library)
1. [Copy Liferay DXP Configurations](#copy-liferay-dxp-configurations)
1. [Add Service Configurations](#add-service-configurations)
1. [Use a VPN to Connect External Services](#use-a-vpn-to-connect-external-services)

## Migrate the Database and Document Library

The most important part of the process in migrating to DXP Cloud is importing the database and document library. Both the database and document library must be imported at the same time to ensure that the data and the records in the database remain synchronized.

This step should be done when the database is not being updated in order to prevent losing data. This will normally require reserving a window to freeze the data for migration. 

### Export a Database Dump

Begin by exporting the data to a database dump. The export from MySQL can be accomplished using the following commands:

```bash
mysqldump -uroot -ppassword --databases --add-drop-database lportal | gzip -c | cat > database.gz
```

```bash
tar zcvf database.tgz database.gz
```

```{important}
The `databases` and `add-drop-database` options are necessary for backup restoration to work correctly.
```

Database dumps imported into DXP Cloud must be in MySQL format for the database service to use it.

### Zip Up the Document Library

The document library must also be zipped into a file to upload to the backup service.

Add the document library to a zip file with this command:

```bash
cd $LIFERAY_HOME/data && tar -czvf volume.tgz document_library
```

```{important}
If you are currently using the [Amazon S3](https://help.liferay.com/hc/en-us/articles/360028810172-Using-Amazon-Simple-Storage-Service), [CMIS](https://help.liferay.com/hc/en-us/articles/360018176171-Using-the-CMIS-Store), or [DBStore](https://help.liferay.com/hc/en-us/articles/360028810192-Using-the-DBStore) storage methods, you must first migrate to a [File System Store](https://help.liferay.com/hc/en-us/articles/360028810132-Using-the-Simple-File-System-Store).
```

### Invoke Backup Service API

Once you have the database dump and document library both zipped and ready, invoke the backup service API to upload both of them to the backup service simultaneously.

Run this command to invoke the API and upload the zipped files:

```bash
curl -X POST \
  https://backup-<PROJECT-NAME>-<ENV>.lfr.cloud/backup/upload \
  -H 'Content-Type: multipart/form-data' \
  -F 'database=@/my-folder/database.tgz' \
  -F 'volume=@/my-folder/volume.tgz' \
  -u user@domain.com:password
```

Substitute `<PROJECT-NAME>` with the appropriate name for your DXP Cloud project. Substitute `<ENV>` with the abbreviation corresponding to your chosen environment (such as `dev` or `prd`). Substitute `/my-folder` with the correct path to the zipped files.

Once these are uploaded, the backup service will initialize a DXP Cloud backup.

```{note}
The backup will appear on the `Backups` page in your chosen environment, but it will not apply to any of your environments until you choose to restore it.
```

## Copy Liferay DXP Configurations

Portal properties and OSGi configurations can be copied over to DXP Cloud by putting them into the appropriate folder per environment (e.g., `dev`, `uat`, or `prd`, or `common` to apply to all) inside of `lcp/liferay/config/`.

```
liferay
  ├── configs
  |   ├── common
  |   ├── dev
  |   ├── local
  |   ├── prd
  |   └── uat
  └── LCP.json
```

Any portal properties of the form `portal-*.properties` placed in one of the appropriate folders will be automatically copied over to the `$LIFERAY_HOME` within the Liferay DXP service for the applicable environment(s). OSGi properties (.cfg or .config files) will be copied over to the `osgi/configs` folder within the Liferay DXP service for the applicable environment(s).

```{note}
If you are using version 3.x services, these configuration files belong in the appropriate `lcp/liferay/config/{ENV}/` folder in your repository. See [Understanding Service Stack Versions](../reference/understanding-service-stack-versions.md)_ for more information on checking the version.
```

## Add Service Configurations

Remaining configurations will primarily be handled through the services provided in DXP Cloud. It may take some planning to determine how to translate the web server and search configurations, since these must now be done through DXP Cloud's services.

Web server configurations must be done through webserver service, using Nginx. See [Web Server Service](../platform-services/web-server-service.md) for more information on adding configurations to this service. See the [official Nginx documentation](https://docs.nginx.com/) for more information on the configurations themselves.

Search configurations must be done through the search service, using Elasticsearch. See [Search Service](../platform-services/search-service.md) for more information on adding configurations to this service. See the [official Elasticsearch documentation](https://www.elastic.co/guide/index.html) for more information on the configurations themselves.

## Restore the Backup

Now that the backup has been uploaded and your service configurations are applied, you can restore your backup to one of your environments. When you are ready, follow these steps to apply the backup to your chosen environment:

1. Log into the DXP Cloud console, if you are not already logged in.

1. Navigate to the environment you [uploaded your backup to](#invoke-backup-service-api), then click _Backups_ from the side menu.

1. Choose the newly uploaded backup on the list, and then click _Restore to_ from the Actions menu for that backup.

    ![Select Restore to... from the Actions menu for the uploaded backup.](./migrating-from-an-on-premises-dxp-installation/images/01.png)

1. Select one of your environments to restore to from the drop-down list (e.g., your `dev` environment):

    ![Select an environment to deploy the backup to.](./migrating-from-an-on-premises-dxp-installation/images/02.png)

1. Click _Restore to environment_.

```{note}
The chosen environment will be unavailable while the backup is being deployed.
```

When the restore process finishes, the chosen environment has your migrated instance of DXP available in it. At this point, most of the migration to DXP Cloud is complete.

## Use a VPN to Connect External Services

External services that do not readily map to existing services in DXP Cloud (like SSO or LDAP integrations) may be connected using a VPN. See [Connecting a VPN to DXP Cloud](../infrastructure-and-operations/networking/connecting-a-vpn-server-to-dxp-cloud.md) for more information on configuring the VPN.
