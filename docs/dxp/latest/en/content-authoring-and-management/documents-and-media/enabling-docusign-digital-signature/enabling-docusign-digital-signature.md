﻿Enabling DocuSign Digital Signatures

You can now integrate [*DocuSign*](https://www.docusign.com/) digital signatures into your Liferay documents. DocuSign is a service that manages documents to be signed electronically. With this integration, you can manage and collect signatures on your documents.

Before you enable digital signatures in Liferay, make sure you've generated and retrieved your User ID key, API Account key, Account Base URI, Integration key, and RSA Private key. Instructions for doing this can be found on [DocuSign's website](https://support.docusign.com/en/guides/ndse-admin-guide-api-and-keys). 

## Enabling Digital Signatures

1. Open the Global menu on the top right corner. ![Global Menu](../../../images/icon-applications-menu.png)

1. Click *Control Panel* &rarr; *Instance Settings* &rarr; *Digital Signature*. 

    ![Digital Signature Button.](./images/01.png)
    
1. Switch the *toggle* to Enable.

    ![Switch the toggle.](./images/02.png)

1. You must choose a *Site Settings Strategy* (see below).

    ![Your Site Settings Strategy defines the scope of your digital signatures.](./images/03.png)

1. Click *Save*. 

You have three options for your Site settings strategy: 

**Always Inherit:** All sites are linked to these settings.

**Always Override:** Every site must provide its own configuration.

**Inherit or Override:** Can be defined in both site settings and instance settings. If defined in both, the site settings will override those of the instance.

You now must add your digital keys from DocuSign at the proper scope in Liferay. 

## Adding Digital Keys

Depending on what you chose for your Site Settings strategy, you must add your digital keys at the proper scope: 

- If you chose Always Inherit, add the keys in Instance Settings. 
- If you chose Always Override, add the keys in Site Settings. 
- If you chose Inherit or Override, add the keys in either place.

1. Navigate to _Control Panel_ &rarr; _Instance Settings_ &rarr; _Digital Signature_ or for Site Settings, the _Site Menu_ &rarr; _Configuration_ &rarr; _Site Settings_ &rarr; _Digital Signature_. 

1. If it's not switched already, switch the toggle to _Enabled_.

1. Enter the User ID, API Account ID, Account's Base URI, Integration Key, and the RSA Private Key you previously retrieved from the DocuSign website. 

1. Click *Save* to enable digital signatures. 

## Collecting Document Signing in Documents and Media

1. Find the document you want to collect the digital signatures and click *Actions* &rarr; *Collect Digital Signature*.

    ![You can see the Actions and Collect Digital Signatures buttons.](./images/04.png) 

1. For multiple documents, select the documents you want to collect the signatures and click on *Collect Digital Signature* ![Collect Digital Signature](../../../images/icon-digital-signature.png). 

    ![You can see multiple selected files and the Collect Digital Signature button.](./images/05.png)

1. Fill the *Envelope*'s information and click on *Send*. 

    ![Fill the envelope's information with its name, recipient's name and email, email's subject and message.](./images/06.png)
    

1. Envelope sent, Recipients must go through [DocuSign's process](https://www.docusign.com/products/electronic-signature) to sign the document. 

## Tracking Envelope's Status

DocuSign uses the term _envelope_ to denote a document or collection of documents to be signed. Once sent, you can track your envelope status from within Liferay. 
>You can check the different labels of status in [DocuSigns' website](https://support.docusign.com/en/guides/ndse-user-guide-document-status). 

1. Open the *Site Menu* (![Site Menu](../../../images/icon-menu.png)) &rarr; _Content & Data_ &rarr; _Digital Signature_ to see a list of created envelopes. 

1. You can also create an envelope directly from this screen using the ![Add Button](../../../images/icon-add.png). You'll be brought to the envelope's screen to enter its information. 

1. Use *Filter and Order* or type keywords in the *Search* bar to organize the documents you visualize.    

    ![Organized documents through Filter and Order, or Search Bar.](./images/07.png)

1. Click on the name of the envelope to see its details and download the document by clicking on the *Download* button. 

    ![You can view the details of your envelopes from inside Liferay.](./images/08.png)


    

    