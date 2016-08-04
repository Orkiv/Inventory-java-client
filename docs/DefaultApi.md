# DefaultApi

All URIs are relative to *https://www.orkiv.com/i/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allGet**](DefaultApi.md#allGet) | **GET** /all/ | 
[**categoriesDelete**](DefaultApi.md#categoriesDelete) | **DELETE** /categories/ | 
[**categoriesPost**](DefaultApi.md#categoriesPost) | **POST** /categories/ | 
[**categoriesPut**](DefaultApi.md#categoriesPut) | **PUT** /categories/ | 
[**itemAddPost**](DefaultApi.md#itemAddPost) | **POST** /item/add/ | 
[**itemAddbulkPost**](DefaultApi.md#itemAddbulkPost) | **POST** /item/addbulk/ | 
[**itemDelete**](DefaultApi.md#itemDelete) | **DELETE** /item/ | 
[**itemPut**](DefaultApi.md#itemPut) | **PUT** /item/ | 
[**itemsCountPost**](DefaultApi.md#itemsCountPost) | **POST** /items/count/ | 
[**itemsPost**](DefaultApi.md#itemsPost) | **POST** /items/ | 
[**itemsallfieldsPost**](DefaultApi.md#itemsallfieldsPost) | **POST** /items/?allfields | 
[**ordersPost**](DefaultApi.md#ordersPost) | **POST** /orders/ | 
[**queryPost**](DefaultApi.md#queryPost) | **POST** /query/ | 
[**queryallfieldsPost**](DefaultApi.md#queryallfieldsPost) | **POST** /query/?allfields | 
[**servicesDelete**](DefaultApi.md#servicesDelete) | **DELETE** /services/ | 
[**servicesGet**](DefaultApi.md#servicesGet) | **GET** /services/ | 
[**servicesPost**](DefaultApi.md#servicesPost) | **POST** /services/ | 
[**servicesPut**](DefaultApi.md#servicesPut) | **PUT** /services/ | 
[**writeDelete**](DefaultApi.md#writeDelete) | **DELETE** /write/ | 
[**writePost**](DefaultApi.md#writePost) | **POST** /write/ | 


<a name="allGet"></a>
# **allGet**
> List&lt;InventoryGroup&gt; allGet()



### Example
```java
// Import classes:
//import InventoryClient.ApiClient;
//import InventoryClient.ApiException;
//import InventoryClient.Configuration;
//import InventoryClient.auth.*;
//import InventoryClient.Api.DefaultApi;

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
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;InventoryGroup&gt;**](InventoryGroup.md)

### Authorization

[APIKey](../README.md#APIKey), [AccountID](../README.md#AccountID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="categoriesDelete"></a>
# **categoriesDelete**
> Response categoriesDelete(id)



### Example
```java
// Import classes:
//import InventoryClient.ApiClient;
//import InventoryClient.ApiException;
//import InventoryClient.Configuration;
//import InventoryClient.auth.*;
//import InventoryClient.Api.DefaultApi;

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
String id = "id_example"; // String | Id of category to remove
try {
    Response result = apiInstance.categoriesDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#categoriesDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of category to remove |

### Return type

[**Response**](Response.md)

### Authorization

[APIKey](../README.md#APIKey), [AccountID](../README.md#AccountID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="categoriesPost"></a>
# **categoriesPost**
> List&lt;Category&gt; categoriesPost(query)



### Example
```java
// Import classes:
//import InventoryClient.ApiClient;
//import InventoryClient.ApiException;
//import InventoryClient.Configuration;
//import InventoryClient.auth.*;
//import InventoryClient.Api.DefaultApi;

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
Dictionary query = new Dictionary(); // Dictionary | Category to query against system
try {
    List<Category> result = apiInstance.categoriesPost(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#categoriesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | [**Dictionary**](Dictionary.md)| Category to query against system | [optional]

### Return type

[**List&lt;Category&gt;**](Category.md)

### Authorization

[APIKey](../README.md#APIKey), [AccountID](../README.md#AccountID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="categoriesPut"></a>
# **categoriesPut**
> Category categoriesPut(id, category)



If no ID is specified a new category will be created!

### Example
```java
// Import classes:
//import InventoryClient.ApiClient;
//import InventoryClient.ApiException;
//import InventoryClient.Configuration;
//import InventoryClient.auth.*;
//import InventoryClient.Api.DefaultApi;

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
String id = "id_example"; // String | category id to update.
Category category = new Category(); // Category | New category information.
try {
    Category result = apiInstance.categoriesPut(id, category);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#categoriesPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| category id to update. |
 **category** | [**Category**](Category.md)| New category information. |

### Return type

[**Category**](Category.md)

### Authorization

[APIKey](../README.md#APIKey), [AccountID](../README.md#AccountID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="itemAddPost"></a>
# **itemAddPost**
> Item itemAddPost(item)



### Example
```java
// Import classes:
//import InventoryClient.ApiClient;
//import InventoryClient.ApiException;
//import InventoryClient.Configuration;
//import InventoryClient.auth.*;
//import InventoryClient.Api.DefaultApi;

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
Item item = new Item(); // Item | Item to create.
try {
    Item result = apiInstance.itemAddPost(item);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#itemAddPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **item** | [**Item**](Item.md)| Item to create. |

### Return type

[**Item**](Item.md)

### Authorization

[APIKey](../README.md#APIKey), [AccountID](../README.md#AccountID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="itemAddbulkPost"></a>
# **itemAddbulkPost**
> Response itemAddbulkPost(items)



### Example
```java
// Import classes:
//import InventoryClient.ApiClient;
//import InventoryClient.ApiException;
//import InventoryClient.Configuration;
//import InventoryClient.auth.*;
//import InventoryClient.Api.DefaultApi;

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
List<Item> items = Arrays.asList(new Item()); // List<Item> | Items to create.
try {
    Response result = apiInstance.itemAddbulkPost(items);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#itemAddbulkPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **items** | [**List&lt;Item&gt;**](Item.md)| Items to create. |

### Return type

[**Response**](Response.md)

### Authorization

[APIKey](../README.md#APIKey), [AccountID](../README.md#AccountID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="itemDelete"></a>
# **itemDelete**
> Response itemDelete(id)



### Example
```java
// Import classes:
//import InventoryClient.ApiClient;
//import InventoryClient.ApiException;
//import InventoryClient.Configuration;
//import InventoryClient.auth.*;
//import InventoryClient.Api.DefaultApi;

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
String id = "id_example"; // String | item id to remove
try {
    Response result = apiInstance.itemDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#itemDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| item id to remove |

### Return type

[**Response**](Response.md)

### Authorization

[APIKey](../README.md#APIKey), [AccountID](../README.md#AccountID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="itemPut"></a>
# **itemPut**
> Response itemPut(id, item)



### Example
```java
// Import classes:
//import InventoryClient.ApiClient;
//import InventoryClient.ApiException;
//import InventoryClient.Configuration;
//import InventoryClient.auth.*;
//import InventoryClient.Api.DefaultApi;

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
String id = "id_example"; // String | item id to update.
Dictionary item = new Dictionary(); // Dictionary | New item information.
try {
    Response result = apiInstance.itemPut(id, item);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#itemPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| item id to update. |
 **item** | [**Dictionary**](Dictionary.md)| New item information. |

### Return type

[**Response**](Response.md)

### Authorization

[APIKey](../README.md#APIKey), [AccountID](../README.md#AccountID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="itemsCountPost"></a>
# **itemsCountPost**
> BigDecimal itemsCountPost(query)



### Example
```java
// Import classes:
//import InventoryClient.ApiClient;
//import InventoryClient.ApiException;
//import InventoryClient.Configuration;
//import InventoryClient.auth.*;
//import InventoryClient.Api.DefaultApi;

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
Dictionary query = new Dictionary(); // Dictionary | Item to query against system.
try {
    BigDecimal result = apiInstance.itemsCountPost(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#itemsCountPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | [**Dictionary**](Dictionary.md)| Item to query against system. | [optional]

### Return type

[**BigDecimal**](BigDecimal.md)

### Authorization

[APIKey](../README.md#APIKey), [AccountID](../README.md#AccountID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="itemsPost"></a>
# **itemsPost**
> List&lt;Item&gt; itemsPost(query)



### Example
```java
// Import classes:
//import InventoryClient.ApiClient;
//import InventoryClient.ApiException;
//import InventoryClient.Configuration;
//import InventoryClient.auth.*;
//import InventoryClient.Api.DefaultApi;

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
Dictionary query = new Dictionary(); // Dictionary | Item to query against system.
try {
    List<Item> result = apiInstance.itemsPost(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#itemsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | [**Dictionary**](Dictionary.md)| Item to query against system. | [optional]

### Return type

[**List&lt;Item&gt;**](Item.md)

### Authorization

[APIKey](../README.md#APIKey), [AccountID](../README.md#AccountID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="itemsallfieldsPost"></a>
# **itemsallfieldsPost**
> List&lt;Dictionary&gt; itemsallfieldsPost(query)



### Example
```java
// Import classes:
//import InventoryClient.ApiClient;
//import InventoryClient.ApiException;
//import InventoryClient.Configuration;
//import InventoryClient.auth.*;
//import InventoryClient.Api.DefaultApi;

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
Dictionary query = new Dictionary(); // Dictionary | Item to query against system.
try {
    List<Dictionary> result = apiInstance.itemsallfieldsPost(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#itemsallfieldsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | [**Dictionary**](Dictionary.md)| Item to query against system. | [optional]

### Return type

[**List&lt;Dictionary&gt;**](Dictionary.md)

### Authorization

[APIKey](../README.md#APIKey), [AccountID](../README.md#AccountID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ordersPost"></a>
# **ordersPost**
> List&lt;Order&gt; ordersPost(query)



### Example
```java
// Import classes:
//import InventoryClient.ApiClient;
//import InventoryClient.ApiException;
//import InventoryClient.Configuration;
//import InventoryClient.auth.*;
//import InventoryClient.Api.DefaultApi;

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
Dictionary query = new Dictionary(); // Dictionary | Order to query against system.
try {
    List<Order> result = apiInstance.ordersPost(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ordersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | [**Dictionary**](Dictionary.md)| Order to query against system. | [optional]

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

[APIKey](../README.md#APIKey), [AccountID](../README.md#AccountID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryPost"></a>
# **queryPost**
> List&lt;Item&gt; queryPost(page, categoryid, sort, search, minprice, maxprice, query)



### Example
```java
// Import classes:
//import InventoryClient.ApiClient;
//import InventoryClient.ApiException;
//import InventoryClient.Configuration;
//import InventoryClient.auth.*;
//import InventoryClient.Api.DefaultApi;

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
BigDecimal page = new BigDecimal(); // BigDecimal | Current page index.
String categoryid = "categoryid_example"; // String | Get items under specified category id.
String sort = "sort_example"; // String | Comma delimited Sort string. ie ; +ordprice. Please use number based fields only
String search = "search_example"; // String | Performs a regex pattern match against the items within your account
BigDecimal minprice = new BigDecimal(); // BigDecimal | Min price in hundreds.
BigDecimal maxprice = new BigDecimal(); // BigDecimal | Max price in hudreds.
Dictionary query = new Dictionary(); // Dictionary | Custom parameters to query against system.
try {
    List<Item> result = apiInstance.queryPost(page, categoryid, sort, search, minprice, maxprice, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#queryPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **BigDecimal**| Current page index. | [optional]
 **categoryid** | **String**| Get items under specified category id. | [optional]
 **sort** | **String**| Comma delimited Sort string. ie ; +ordprice. Please use number based fields only | [optional]
 **search** | **String**| Performs a regex pattern match against the items within your account | [optional]
 **minprice** | **BigDecimal**| Min price in hundreds. | [optional]
 **maxprice** | **BigDecimal**| Max price in hudreds. | [optional]
 **query** | [**Dictionary**](Dictionary.md)| Custom parameters to query against system. | [optional]

### Return type

[**List&lt;Item&gt;**](Item.md)

### Authorization

[APIKey](../README.md#APIKey), [AccountID](../README.md#AccountID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryallfieldsPost"></a>
# **queryallfieldsPost**
> List&lt;Dictionary&gt; queryallfieldsPost(page, categoryid, sort, search, minprice, maxprice, query)



### Example
```java
// Import classes:
//import InventoryClient.ApiClient;
//import InventoryClient.ApiException;
//import InventoryClient.Configuration;
//import InventoryClient.auth.*;
//import InventoryClient.Api.DefaultApi;

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
BigDecimal page = new BigDecimal(); // BigDecimal | Current page index.
String categoryid = "categoryid_example"; // String | Get items under specified category id.
String sort = "sort_example"; // String | Comma delimited Sort string. ie ; +ordprice. Please use number based fields only
String search = "search_example"; // String | Performs a regex pattern match against the items within your account
BigDecimal minprice = new BigDecimal(); // BigDecimal | Min price in hundreds.
BigDecimal maxprice = new BigDecimal(); // BigDecimal | Max price in hudreds.
Dictionary query = new Dictionary(); // Dictionary | Custom parameters to query against system.
try {
    List<Dictionary> result = apiInstance.queryallfieldsPost(page, categoryid, sort, search, minprice, maxprice, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#queryallfieldsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **BigDecimal**| Current page index. | [optional]
 **categoryid** | **String**| Get items under specified category id. | [optional]
 **sort** | **String**| Comma delimited Sort string. ie ; +ordprice. Please use number based fields only | [optional]
 **search** | **String**| Performs a regex pattern match against the items within your account | [optional]
 **minprice** | **BigDecimal**| Min price in hundreds. | [optional]
 **maxprice** | **BigDecimal**| Max price in hudreds. | [optional]
 **query** | [**Dictionary**](Dictionary.md)| Custom parameters to query against system. | [optional]

### Return type

[**List&lt;Dictionary&gt;**](Dictionary.md)

### Authorization

[APIKey](../README.md#APIKey), [AccountID](../README.md#AccountID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="servicesDelete"></a>
# **servicesDelete**
> Response servicesDelete(id)



### Example
```java
// Import classes:
//import InventoryClient.ApiClient;
//import InventoryClient.ApiException;
//import InventoryClient.Configuration;
//import InventoryClient.auth.*;
//import InventoryClient.Api.DefaultApi;

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
String id = "id_example"; // String | ID of the service to update
try {
    Response result = apiInstance.servicesDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#servicesDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the service to update |

### Return type

[**Response**](Response.md)

### Authorization

[APIKey](../README.md#APIKey), [AccountID](../README.md#AccountID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="servicesGet"></a>
# **servicesGet**
> List&lt;Service&gt; servicesGet()



### Example
```java
// Import classes:
//import InventoryClient.ApiClient;
//import InventoryClient.ApiException;
//import InventoryClient.Configuration;
//import InventoryClient.auth.*;
//import InventoryClient.Api.DefaultApi;

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
    List<Service> result = apiInstance.servicesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#servicesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Service&gt;**](Service.md)

### Authorization

[APIKey](../README.md#APIKey), [AccountID](../README.md#AccountID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="servicesPost"></a>
# **servicesPost**
> Service servicesPost(service)



### Example
```java
// Import classes:
//import InventoryClient.ApiClient;
//import InventoryClient.ApiException;
//import InventoryClient.Configuration;
//import InventoryClient.auth.*;
//import InventoryClient.Api.DefaultApi;

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
Service service = new Service(); // Service | Service to create.
try {
    Service result = apiInstance.servicesPost(service);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#servicesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **service** | [**Service**](Service.md)| Service to create. |

### Return type

[**Service**](Service.md)

### Authorization

[APIKey](../README.md#APIKey), [AccountID](../README.md#AccountID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="servicesPut"></a>
# **servicesPut**
> Response servicesPut(id, service)



### Example
```java
// Import classes:
//import InventoryClient.ApiClient;
//import InventoryClient.ApiException;
//import InventoryClient.Configuration;
//import InventoryClient.auth.*;
//import InventoryClient.Api.DefaultApi;

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
String id = "id_example"; // String | ID of the service to update
Service service = new Service(); // Service | New service data to set.
try {
    Response result = apiInstance.servicesPut(id, service);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#servicesPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the service to update |
 **service** | [**Service**](Service.md)| New service data to set. |

### Return type

[**Response**](Response.md)

### Authorization

[APIKey](../README.md#APIKey), [AccountID](../README.md#AccountID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="writeDelete"></a>
# **writeDelete**
> Response writeDelete(id)



### Example
```java
// Import classes:
//import InventoryClient.ApiClient;
//import InventoryClient.ApiException;
//import InventoryClient.Configuration;
//import InventoryClient.auth.*;
//import InventoryClient.Api.DefaultApi;

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
String id = "id_example"; // String | Will delete event attached to this serviceid
try {
    Response result = apiInstance.writeDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#writeDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Will delete event attached to this serviceid | [optional]

### Return type

[**Response**](Response.md)

### Authorization

[APIKey](../README.md#APIKey), [AccountID](../README.md#AccountID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="writePost"></a>
# **writePost**
> Response writePost(eventRequest)



Will ovveride the current event of the specified service.

### Example
```java
// Import classes:
//import InventoryClient.ApiClient;
//import InventoryClient.ApiException;
//import InventoryClient.Configuration;
//import InventoryClient.auth.*;
//import InventoryClient.Api.DefaultApi;

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
EventRequest eventRequest = new EventRequest(); // EventRequest | Event to upload
try {
    Response result = apiInstance.writePost(eventRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#writePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventRequest** | [**EventRequest**](EventRequest.md)| Event to upload |

### Return type

[**Response**](Response.md)

### Authorization

[APIKey](../README.md#APIKey), [AccountID](../README.md#AccountID)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

