# Elasticsearch Connector Configuration Reference

> The configuration information here applies to the latest available (bundled or through Marketplace) version of the Elasticsearch 6 and Elasticsearch 7 connectors for Liferay Portal 7.3 & 7.4 CE and for Liferay DXP 7.2 & 7.3. Appropriate information about the exact GA/Service Pack/Fix Pack and Marketplace versions are provided where needed.

The connection to Elasticsearch is primarily defined in the _Elasticsearch 6/7_ configuration entry in System Settings (or via [corresponding configuration file](#configuration-files-and-system-settings-entries)). Liferay 7.3 introduced the possibility to define multiple connections to Elasticsearch, through the [factory configuration](../../../system-administration/configuring-liferay/configuration-files-and-factories/using-factory-configuration.md) _Elasticsearch Connections_. Both configuration entries are configurable through [System Settings](../../../system-administration/configuring-liferay/system-settings.md) or an [OSGi configuration file](../../../system-administration/configuring-liferay/configuration-files-and-factories/using-configuration-files.md). Configuration files are the recommended approach for production environments.

## Configuration Files and System Settings Entries

| Connecting Servers | <div style="width:380px">System Settings Entry/Configuration File</div> |
| --------------- | -------------------------------------- | 
| Liferay 7.2.x<br />Elasticsearch 6.x  | Elasticsearch 6<br />`com.liferay.portal.search.elasticsearch6.configuration.ElasticsearchConfiguration.config` |
| Liferay 7.2.x<br />Elasticsearch 7.x  | Elasticsearch 7<br />`com.liferay.portal.search.elasticsearch7.configuration.ElasticsearchConfiguration.config` |
| Liferay 7.3.x<br />Elasticsearch 7.x  | Elasticsearch 7<br />`com.liferay.portal.search.elasticsearch7.configuration.ElasticsearchConfiguration.config`<br /><br />Elasticsearch Connections (factory)<br />`com.liferay.portal.search.elasticsearch7.configuration.ElasticsearchConnectionConfiguration-[connectionId].config` |

In Liferay 7.3 and beyond, there's an additional connection configuration entry, Elasticsearch Connections. You can use this to define any connection to Elasticsearch, but if you are only configuring one connection you can still use the main Elasticsearch 7 configuration entry. If using multiple connections in 7.3+, define connections with files named accordingly:

```
com.liferay.portal.search.elasticsearch7.configuration.ElasticsearchConnectionConfiguration-[connectionId].config
```

If configuring security on Elasticsearch 6, a separate Liferay configuration (as well as a LES subscription) is required. See [Securing Elasticsearch](securing-elasticsearch.md) for more information.

Deploy configuration files to `[Liferay_Home]/osgi/configs` and a listener auto-detects the configurations and writes them to the database.

## Configuration Properties

| System Settings Field Name | <div style="width:290px">Configuration File Syntax and Default Value<br />Description (Click to Expand) | Availability |
| ----------------------------- | ------------------------------------------------------------------------------ | ------------ | 
| | <a href="#general-connection-settings" id="general-connection-settings">GENERAL CONNECTION SETTINGS</a> |
| Track Total Hits | <details><summary>`trackTotalHits=B"true"`</summary>If enabled, hits are accurately counted when there are more than 10,000 results for a search. Leaving this enabled may have an impact on performance when there is a large number of hits for a search.</details> | Liferay 7.2+<br />(Connector to Elasticsearch 7) |
| Production Mode Enabled | <details><summary>`productionModeEnabled=B"false"`</summary>Enable production mode. In Liferay 7.3, <code>productionModeEnabled</code> replaces the deprecated setting <code>operationMode</code>. If this is checked, production mode is enabled and the Operation Mode configuration is ignored. Enabling production mode requires connecting to a remote standalone Elasticsearch cluster. If left disabled, the Operation Mode configuration is used.</details> | Liferay 7.3+ |
| Index Name Prefix | <details><summary>`indexNamePrefix="liferay-"`</summary>Set a String value to use as the prefix for the search index name. The default value should not be changed under normal conditions. If you change it, you must also perform a *re-index all* operation for the portal and then manually delete the old index using the Elasticsearch administration console.</details> | Liferay 7.2+ |
| 7.3.x&rarr;Number of Company and System Index Replicas<br />7.2.x&rarr;Index Number of Replicas | <details><summary>`indexNumberOfReplicas="0-all"`</summary>Set the number of replicas for each Liferay company and system index. If unset, no replicas are used. Changing this value requires a full re-index. The default value is defined in a file called "index-settings-defaults.json" shipped with the connector.</details> | Liferay 7.2+ |
| 7.3.x&rarr;Number of Company and System Index Shards<br />7.2.x&rarr;Index Number of Shards | <details><summary>`indexNumberOfShards="1"`</summary>Set the number of shards to use when a Liferay company and system index is created. If unset, a single shard is used. Changing this value requires a full re-index. The default value is defined in a file called "index-settings-defaults.json" shipped with the connector.</details> | Liferay 7.2+ |
| Log Exceptions Only | <details><summary>`logExceptionsOnly=B"true"`</summary>A boolean setting that, when true, only logs exceptions from Elasticsearch, and does not re-throw them.</details> | Liferay 7.2+ |
| Retry On Conflict | <details><summary>`retryOnConflict="5"`</summary>Set an integer value for the number of retries to attempt if a version conflict occurs because the document was updated between getting it and updating it (see [here](https://www.elastic.co/guide/en/elasticsearch/reference/7.x/docs-update.html#docs-update-api-query-params) for more information.</details> | Liferay 7.2- |
| | <a href="#security-settings" id="security-settings">SECURITY SETTINGS</a> |
| Authentication Enabled | <details><summary>`authenticationEnabled=B"false"`</summary>Enable or disable authentication to Elasticsearch with a user name and password.</details> | Liferay 7.3+ |
| Username | <details><summary>`username="elastic"`</summary>Set the user name for authenticating to Elasticsearch if Authentication Enabled is checked.</details> | Liferay 7.3+ |
| Password | <details><summary>`password=""`</summary>Set the password for authenticating to Elasticsearch if Authentication Enabled is checked.</details> | Liferay 7.3+ |
| Http SSL Enabled | <details><summary>`httpSSLEnabled="false"`</summary>Enable or disable TLS/SSL.</details> | Liferay 7.3+ |
| Truststore Type | <details><summary>`truststoreType="pkcs12"`</summary>Set the truststore type if HTTP SSL Enabled is checked.</details> | Liferay 7.3+ |
| Truststore Path | <details><summary>`truststorePath="/path/to/localhost.p12"`</summary>Set the path to the truststore file if HTTP SSL Enabled is checked.</details> | Liferay 7.3+ |
| Truststore Password | <details><summary>`truststorePassword=""`</summary>Set the password to the truststore if HTTP SSL Enabled is checked.</details> | Liferay 7.3+ |
| | <a href="#elasticsearch-connections-settings" id="elasticsearch-connections-settings">ELASTICSEARCH CONNECTIONS SETTINGS</a> |
| Active | <details><summary>`active=B"false"`</summary>Activate or deactivate the connection as needed. Do not deactivate a connection if it's selected in the Elasticsearch 7 configuration's Remote Cluster Connection ID setting.</details> | Liferay 7.3+ |
| Connection ID | <details><summary>`connectionId=""`</summary>Set a unique ID for the connection. If active, this connection becomes available to select in the Elasticsearch 7 configuration's Remote Cluster Connection ID property.</details> | Liferay 7.3+ |
| | <a href="#rest-client-settings" id="rest-client-settings">REST CLIENT SETTINGS</a> |
| Network Host Addresses | <details><summary>`networkHostAddresses="[http://localhost:9200]"`</summary>Set the remote HTTP hosts to connect to. This is required in Liferay 7.3 as it configures the REST client connection.</details> | Liferay 7.3+ |
| REST Client Logger Level | <details><summary>`RESTClientLoggerLevel="ERROR"`</summary>Set the logging level for the Elasticsearch REST client.</details> | Liferay 7.3+ |
| | <a href="#transport-client-settings" id="transport-client-settings">TRANSPORT CLIENT SETTINGS</a> |
| Cluster Name | <details><summary>`clusterName="LiferayElasticsearchCluster"`</summary>The cluster name is only needed for the Transport Client in Liferay 7.2. Set a String value to declare the cluster to integrate with. In Liferay 7.3+, where the connection is managed through the REST client, this property is only used for naming the embedded cluster when in development mode.</details> | Liferay 7.2-<br />On 7.3+, applies to development mode |
| Transport Addresses | <details><summary>`transportAddresses=["localhost:9300"]`</summary>Set the String values for the addresses of the remote Elasticsearch nodes to connect to. This value is required when Operation Mode is set to remote (see [here](https://www.elastic.co/guide/en/elasticsearch/client/java-api/7.x/transport-client.html) for more information). Specify as many or few nodes as you see fit.</details> | Liferay 7.2- |
| Client Transport Sniff | <details><summary>`clientTransportSniff=B"true"`</summary>Set this boolean to true to enable cluster sniffing and dynamically discover available data nodes in the cluster (see [here](https://www.elastic.co/guide/en/elasticsearch/client/java-api/7.x/transport-client.html) for more information).</details> | Liferay 7.2- |
| Client Transport Ignore Cluster Name | <details><summary>`clientTransportIgnoreClusterName=B"false"`</summary>Set this boolean to true to ignore cluster name validation of connected nodes (see [here](https://www.elastic.co/guide/en/elasticsearch/client/java-api/7.x/transport-client.html) for more information).</details> | Liferay 7.2- |
| Client Transport Ping Timeout | <details><summary>`clientTransportPingTimeout=""`</summary>Set the time (in seconds) the client node waits for a ping response from a node. If unset, the default Elasticsearch `client.transport.ping_timeout` is used.</details> | Liferay 7.2- |
| Client Transport Nodes Sampler Interval | <details><summary>`clientTransportNodesSamplerInterval=""`</summary>Set this String value to instruct the client node on how often to sample / ping the nodes listed and connected (see [here](https://www.elastic.co/guide/en/elasticsearch/client/java-api/7.x/transport-client.html) for more information).</details> | Liferay 7.2- |
| | <a href="#other-settings" id="other-settings">OTHER SETTINGS</a> |
| Remote Cluster Connection ID | <details><summary>`remoteClusterConnectionId=`</summary>Choose the connection ID for a connection to the remote Elasticsearch cluster. The available connections are defined in the Elasticsearch Connections System Settings entry. If this value is not set then the connection configurations in the Elasticsearch 7 entry are used for the remote cluster connection.</details> | Liferay 7.3+ when using [LES Cross-Cluster Replication](../../liferay-enterprise-search/cross-cluster-replication/cross-cluster-replication.md) |
| | <a href="#development-mode-settings" id="development-mode-settings">DEVELOPMENT MODE SETTINGS</a> | 
| Bootstrap Mlock All | <details><summary>`bootstrapMlockAll="false"`</summary>A boolean setting that, when set to `true`, tries to lock the process address space into RAM, preventing any Elasticsearch memory from being swapped out (see [here](https://www.elastic.co/guide/en/elasticsearch/reference/7.x/setup-configuration-memory.html#bootstrap-memory_lock)) for more information).</details> | Liferay 7.2+ |
| Http CORS Allow Origin | <details><summary>`httpCORSAllowOrigin="/https?:\\/\\/localhost(:[0-9]+)?/"`</summary>Set the String origins to allow when HTTP CORS is enabled (see [here](https://www.elastic.co/guide/en/elasticsearch/reference/7.x/modules-http.html#_settings) for more information).</details> | Liferay 7.2+ |
| Http CORS Configurations | <details><summary>`httpCORSConfigurations=`</summary>Set the String values for custom settings for HTTP CORS, in YML format (`elasticsearch.yml`) (see [here](https://www.elastic.co/guide/en/elasticsearch/reference/7.x/modules-http.html#_settings) for more information).</details> | Liferay 7.2+ |
| Http CORS Enabled | <details><summary>`httpCORSEnabled=B"true"`</summary>Set this boolean to false to disable cross-origin resource sharing. When set to `false`, a browser on another origin cannot make requests to Elasticsearch. Web front end tools like Elasticsearch Head may be unable to connect (see [here](https://www.elastic.co/guide/en/elasticsearch/reference/7.x/modules-http.html#_settings) for more information).</details> | Liferay 7.2+ |
| Network Host | <details><summary>`networkHost=""`</summary>Set this String value to instruct the node to bind to this hostname or IP address and publish (advertise) this host to other nodes in the cluster. This is a shortcut which sets the bind host and the publish host at the same time (see [here](https://www.elastic.co/guide/en/elasticsearch/reference/7.x/modules-network.html#common-network-settings) for more information).</details> | Liferay 7.2+  |
| Network Bind Host | <details><summary>`networkBindHost=""`</summary>Set the String value of the network interface(s) a node should bind to in order to listen for incoming requests (see [here](https://www.elastic.co/guide/en/elasticsearch/reference/7.x/modules-network.html#advanced-network-settings) for more information).</details> | Liferay 7.2+ |
| Network Publish Host | <details><summary>`networkPublishHost=""`</summary>Set the String value of a single interface that the node advertises to other nodes in the cluster, so that those nodes can connect to it (see [here](https://www.elastic.co/guide/en/elasticsearch/reference/7.x/modules-network.html#advanced-network-settings) for more information).</details> | Liferay 7.2+ |
| | <a href="#sidecar-settings" id="sidecar-settings">SIDECAR SETTINGS</a> | 
| Node Name | <details><summary>`nodeName=`</summary>Name the embedded Elasticsearch server's node. A remote Elasticsearch server's node name is configured in its `elasticsearch.yml`.</details> | Liferay 7.3+ |
| Sidecar Debug | <details><summary>`sidecarDebug=B"false"`</summary>Set this to true to enable debug mode for the sidecar process.</details> | Liferay 7.3+ |
| Sidecar Debug Settings | <details><summary>`sidecarDebugSettings="-agentlib:jdwp=transport=dt_socket,address=8001,server=y,suspend=y,quiet=y"`</summary>Set the JVM options used to debug the sidecar process.</details> | Liferay 7.3+ |
| Sidecar Heartbeat Interval | <details><summary>`sidecarHeartbeatInterval="10000"`</summary>Set the heartbeat interval in milliseconds used to detect the health of the sidecar process.</details> | Liferay 7.3+ |
| Sidecar Home | <details><summary>`sidecarHome="elasticsearch7"`</summary>Set the path of the sidecar base folder used to start the sidecar process.</details> | Liferay 7.3+ |
| Sidecar HTTP Port | <details><summary>`sidecarHttpPort="9200"`</summary>This configuration only applies to Liferay 7.3 with the sidecar Elasticsearch. Set the HTTP port range of the sidecar Elasticsearch node. Set to AUTO to automatically find a port in the 9201-9300 range. If unset, the value of Embedded HTTP port (`9201` by default) is used.</details> | Liferay 7.3+ |
| Sidecar JVM Options | <details><summary>`sidecarJVMOptions="-Xms1g\|-Xmx1g\|-XX:+AlwaysPreTouch"`</summary>Set the JVM options used by the sidecar process.</details> | Liferay 7.3+ |
| Sidecar Shutdown Timeout | <details><summary>`sidecarShutdownTimeout="10000"`</summary>Set the time in milliseconds to wait before the sidecar process is forcibly shut down.</details> | Liferay 7.3+ |
| Transport Tcp Port | <details><summary>`transportTcpPort=""`</summary>Set the String value for the port to bind for communication between nodes.  Accepts a single value or a range (see [here](https://www.elastic.co/guide/en/elasticsearch/reference/7.x/modules-transport.html#_tcp_transport) for more information).</details> | Liferay 7.2+ |
| Zen Discovery Unicast Hosts Port | <details><summary>`discoveryZenPingUnicastHostsPort="9300-9400"`</summary>Set a String value for the range of ports to use when building the value for `discovery.zen.ping.unicast.hosts`. Multiple Elasticsearch nodes on a range of ports can act as gossip routers at the same computer (see [here](https://www.elastic.co/guide/en/elasticsearch/reference/7.x/modules-discovery-hosts-providers.html) for more information).</details> | Liferay 7.2+ |
| | <a href="#advanced-settings" id="advanced-settings">ADVANCED SETTINGS</a> |
| Additional Configurations | <details><summary>`additionalConfigurations=""`</summary>Set the String values for custom settings for embedded Elasticsearch, in YML format. See: Adding Settings to the Liferay Elasticsearch Connector.</details> | Liferay 7.2+ |
| Additional Index Configurations | <details><summary>`additionalIndexConfigurations=""`</summary>Set the String values for custom settings for the Liferay index, in JSON or YML format (refer to the Elasticsearch Create Index API for more information).  See: Adding Settings to the Liferay Elasticsearch Connector.</details> | Liferay 7.2+ |
| Additional Type Mappings | <details><summary>`additionalTypeMappings=""`</summary>Set the String values for custom mappings for the `LiferayDocumentType`, in JSON format (refer to the Elasticsearch Put Mapping API for more information) See: Adding Settings to the Liferay Elasticsearch Connector.</details> | Liferay 7.2+ |
| Override Type Mappings | <details><summary>`overrideTypeMappings=""`</summary>Settings here override Liferay's default type mappings. This is an advanced feature that should be used only if strictly necessary. If you set this value, the default mappings used to define the Liferay Document Type in Liferay source code (for example, `liferay-type-mappings.json`) are ignored entirely, so include the whole mappings definition in this property, not just the segment you're modifying.</details> | Liferay 7.2+ |
| Proxy Host | <details><summary>`proxyHost=""`</summary>Set the proxy host for the client connection.</details> | Liferay DXP 7.3 FP1+/SP1+ and Liferay Portal GA7+ |
| Proxy Port | <details><summary>`proxyPort="0"`</summary>Set the proxy port for the client connection.</details> | Liferay DXP 7.3 FP1+/SP1+ and Liferay Portal GA7+ |
| Proxy Username | <details><summary>`proxyUserName=""`</summary>Set the proxy user name for a proxy connection.</details> | Liferay DXP 7.3 FP1+/SP1+ and Liferay Portal GA7+ |
| Proxy Password | <details><summary>`proxyPassword=""`</summary>Set the password for connecting to the proxy.</details> | Liferay DXP 7.3 FP1+/SP1+ and Liferay Portal GA7+ |
| | <a href="#deprecated-settings" id="deprecated-settings">DEPRECATED</a> |
| Operation Mode | <details><summary>`operationMode="EMBEDDED"`</summary>There are two operation modes you can choose from: EMBEDDED or REMOTE. Set to REMOTE to connect to a remote standalone Elasticsearch cluster. Set to EMBEDDED to start Liferay with an internal Elasticsearch instance. EMBEDDED operation mode is unsupported for production environments and can be considered a "development mode" feature.</details> | Deprecated as of Liferay 7.3, replaced with _Production Mode Enabled_  |
| Embedded HTTP Port | <details><summary>`embeddedHttpPort="9201"`</summary>This configuration only applies to EMBEDDED mode. Set the HTTP port of the embedded Elasticsearch node that is created when Operation Mode is set to EMBEDDED.</details> | Deprecated as of Liferay 7.3.x |
| Http Enabled | <details><summary>`httpEnabled=B"true"`</summary>If this is checked, the HTTP layer is enabled. If unchecked, the HTTP layer is disabled on nodes which are not meant to serve REST requests directly.</details> | Deprecated as of Liferay 7.1.x<br />Deprecated Elasticsearch 6.3.x |

## Related Topics
- [What's New in Search for 7.3?](../../getting-started/whats-new-in-search-for-73.md)
- [Securing Elasticsearch](securing-elasticsearch.md)
- [Connecting to Elasticsearch](connecting-to-elasticsearch.md)
- [Liferay DXP Elasticsearch Connectors: Technical Data Sheet (KB Reference)](https://help.liferay.com/hc/en-us/articles/360046478452)
- [Understanding Liferay DXP's compatibility with Elasticsearch (KB Reference)](https://help.liferay.com/hc/en-us/articles/360051492032)