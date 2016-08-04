# Inventory-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>Inventory-client</groupId>
    <artifactId>Inventory-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "Inventory-client:Inventory-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/Inventory-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import InventoryClient.*;
import InventoryClient.auth.*;
import InventoryClient.model.*;
import InventoryClient.Api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: APIKey
        ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
        APIKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //APIKey.setApiKeyPrefix("Token");

        // Configure API key authorization: AccountID
        ApiKeyAuth AccountID = (ApiKeyAuth) defaultClient.getAuthentication("AccountID");
        AccountID.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //AccountID.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi();
        try {
            List<InventoryGroup> result = apiInstance.allGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#allGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://www.orkiv.com/i/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**allGet**](docs/DefaultApi.md#allGet) | **GET** /all/ | 
*DefaultApi* | [**categoriesDelete**](docs/DefaultApi.md#categoriesDelete) | **DELETE** /categories/ | 
*DefaultApi* | [**categoriesPost**](docs/DefaultApi.md#categoriesPost) | **POST** /categories/ | 
*DefaultApi* | [**categoriesPut**](docs/DefaultApi.md#categoriesPut) | **PUT** /categories/ | 
*DefaultApi* | [**itemAddPost**](docs/DefaultApi.md#itemAddPost) | **POST** /item/add/ | 
*DefaultApi* | [**itemAddbulkPost**](docs/DefaultApi.md#itemAddbulkPost) | **POST** /item/addbulk/ | 
*DefaultApi* | [**itemDelete**](docs/DefaultApi.md#itemDelete) | **DELETE** /item/ | 
*DefaultApi* | [**itemPut**](docs/DefaultApi.md#itemPut) | **PUT** /item/ | 
*DefaultApi* | [**itemsCountPost**](docs/DefaultApi.md#itemsCountPost) | **POST** /items/count/ | 
*DefaultApi* | [**itemsPost**](docs/DefaultApi.md#itemsPost) | **POST** /items/ | 
*DefaultApi* | [**itemsallfieldsPost**](docs/DefaultApi.md#itemsallfieldsPost) | **POST** /items/?allfields | 
*DefaultApi* | [**ordersPost**](docs/DefaultApi.md#ordersPost) | **POST** /orders/ | 
*DefaultApi* | [**queryPost**](docs/DefaultApi.md#queryPost) | **POST** /query/ | 
*DefaultApi* | [**queryallfieldsPost**](docs/DefaultApi.md#queryallfieldsPost) | **POST** /query/?allfields | 
*DefaultApi* | [**servicesDelete**](docs/DefaultApi.md#servicesDelete) | **DELETE** /services/ | 
*DefaultApi* | [**servicesGet**](docs/DefaultApi.md#servicesGet) | **GET** /services/ | 
*DefaultApi* | [**servicesPost**](docs/DefaultApi.md#servicesPost) | **POST** /services/ | 
*DefaultApi* | [**servicesPut**](docs/DefaultApi.md#servicesPut) | **PUT** /services/ | 
*DefaultApi* | [**writeDelete**](docs/DefaultApi.md#writeDelete) | **DELETE** /write/ | 
*DefaultApi* | [**writePost**](docs/DefaultApi.md#writePost) | **POST** /write/ | 


## Documentation for Models

 - [Category](docs/Category.md)
 - [Dictionary](docs/Dictionary.md)
 - [Error](docs/Error.md)
 - [EventRequest](docs/EventRequest.md)
 - [InventoryGroup](docs/InventoryGroup.md)
 - [Item](docs/Item.md)
 - [Order](docs/Order.md)
 - [Response](docs/Response.md)
 - [Service](docs/Service.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### APIKey

- **Type**: API key
- **API key parameter name**: APIKey
- **Location**: HTTP header

### AccountID

- **Type**: API key
- **API key parameter name**: accountid
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



