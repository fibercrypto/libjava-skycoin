# openapi-java-client

Skycoin REST API.

- API version: 0.27.0

- Build date: 2019-08-06T00:13:07.983-04:00[America/Havana]

Skycoin is a next-generation cryptocurrency.

  For more information, please visit [https://skycoin.net](https://skycoin.net)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>0.27.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:0.27.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/openapi-java-client-0.27.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.*;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.DefaultApi;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://127.0.0.1:6420");
        
        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            InlineResponse200 result = apiInstance.addressCount();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#addressCount");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://127.0.0.1:6420*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**addressCount**](docs/DefaultApi.md#addressCount) | **GET** /api/v1/addresscount | Returns the total number of unique address that have coins.
*DefaultApi* | [**addressUxouts**](docs/DefaultApi.md#addressUxouts) | **GET** /api/v1/address_uxouts | 
*DefaultApi* | [**apiV1RawtxGet**](docs/DefaultApi.md#apiV1RawtxGet) | **GET** /api/v1/rawtx | 
*DefaultApi* | [**apiV2MetricsGet**](docs/DefaultApi.md#apiV2MetricsGet) | **GET** /api/v2/metrics | 
*DefaultApi* | [**balanceGet**](docs/DefaultApi.md#balanceGet) | **GET** /api/v1/balance | Returns the balance of one or more addresses, both confirmed and predicted. The predicted balance is the confirmed balance minus the pending spends.
*DefaultApi* | [**balancePost**](docs/DefaultApi.md#balancePost) | **POST** /api/v1/balance | Returns the balance of one or more addresses, both confirmed and predicted. The predicted balance is the confirmed balance minus the pending spends.
*DefaultApi* | [**block**](docs/DefaultApi.md#block) | **GET** /api/v1/block | Returns the balance of one or more addresses, both confirmed and predicted. The predicted balance is the confirmed balance minus the pending spends.
*DefaultApi* | [**blockchainMetadata**](docs/DefaultApi.md#blockchainMetadata) | **GET** /api/v1/blockchain/metadata | Returns the blockchain metadata.
*DefaultApi* | [**blockchainProgress**](docs/DefaultApi.md#blockchainProgress) | **GET** /api/v1/blockchain/progress | Returns the blockchain sync progress.
*DefaultApi* | [**blocks**](docs/DefaultApi.md#blocks) | **GET** /api/v1/blocks | Returns the balance of one or more addresses, both confirmed and predicted. The predicted balance is the confirmed balance minus the pending spends.
*DefaultApi* | [**coinSupply**](docs/DefaultApi.md#coinSupply) | **GET** /api/v1/coinSupply | 
*DefaultApi* | [**csrf**](docs/DefaultApi.md#csrf) | **GET** /api/v1/csrf | Creates a new CSRF token. Previous CSRF tokens are invalidated by this call.
*DefaultApi* | [**dataDELETE**](docs/DefaultApi.md#dataDELETE) | **DELETE** /api/v2/data | 
*DefaultApi* | [**dataGET**](docs/DefaultApi.md#dataGET) | **GET** /api/v2/data | 
*DefaultApi* | [**dataPOST**](docs/DefaultApi.md#dataPOST) | **POST** /api/v2/data | 
*DefaultApi* | [**defaultConnections**](docs/DefaultApi.md#defaultConnections) | **GET** /api/v1/network/defaultConnections | defaultConnectionsHandler returns the list of default hardcoded bootstrap addresses.\\n They are not necessarily connected to.
*DefaultApi* | [**health**](docs/DefaultApi.md#health) | **GET** /api/v1/health | Returns node health data.
*DefaultApi* | [**lastBlocks**](docs/DefaultApi.md#lastBlocks) | **GET** /api/v1/last_blocks | 
*DefaultApi* | [**networkConnection**](docs/DefaultApi.md#networkConnection) | **GET** /api/v1/network/connection | This endpoint returns a specific connection.
*DefaultApi* | [**networkConnections**](docs/DefaultApi.md#networkConnections) | **GET** /api/v1/network/connections | This endpoint returns all outgoings connections.
*DefaultApi* | [**networkConnectionsDisconnect**](docs/DefaultApi.md#networkConnectionsDisconnect) | **POST** /api/v1/network/connection/disconnect | 
*DefaultApi* | [**networkConnectionsExchange**](docs/DefaultApi.md#networkConnectionsExchange) | **GET** /api/v1/network/connections/exchange | 
*DefaultApi* | [**networkConnectionsTrust**](docs/DefaultApi.md#networkConnectionsTrust) | **GET** /api/v1/network/connections/trust | trustConnectionsHandler returns all trusted connections.\\n They are not necessarily connected to. In the default configuration, these will be a subset of the default hardcoded bootstrap addresses.
*DefaultApi* | [**outputsGet**](docs/DefaultApi.md#outputsGet) | **GET** /api/v1/outputs | If neither addrs nor hashes are specificed, return all unspent outputs. If only one filter is specified, then return outputs match the filter. Both filters cannot be specified.
*DefaultApi* | [**outputsPost**](docs/DefaultApi.md#outputsPost) | **POST** /api/v1/outputs | If neither addrs nor hashes are specificed, return all unspent outputs. If only one filter is specified, then return outputs match the filter. Both filters cannot be specified.
*DefaultApi* | [**pendingTxs**](docs/DefaultApi.md#pendingTxs) | **GET** /api/v1/pendingTxs | 
*DefaultApi* | [**resendUnconfirmedTxns**](docs/DefaultApi.md#resendUnconfirmedTxns) | **POST** /api/v1/resendUnconfirmedTxns | 
*DefaultApi* | [**richlist**](docs/DefaultApi.md#richlist) | **GET** /api/v1/richlist | Returns the top skycoin holders.
*DefaultApi* | [**transaction**](docs/DefaultApi.md#transaction) | **GET** /api/v1/transaction | 
*DefaultApi* | [**transactionInject**](docs/DefaultApi.md#transactionInject) | **POST** /api/v1/injectTransaction | Broadcast a hex-encoded, serialized transaction to the network.
*DefaultApi* | [**transactionPost**](docs/DefaultApi.md#transactionPost) | **POST** /api/v2/transaction | 
*DefaultApi* | [**transactionPostUnspent**](docs/DefaultApi.md#transactionPostUnspent) | **POST** /api/v2/transaction/unspent | 
*DefaultApi* | [**transactionRaw**](docs/DefaultApi.md#transactionRaw) | **GET** /api/v2/transaction/raw | Returns the hex-encoded byte serialization of a transaction. The transaction may be confirmed or unconfirmed.
*DefaultApi* | [**transactionVerify**](docs/DefaultApi.md#transactionVerify) | **POST** /api/v2/transaction/verify | 
*DefaultApi* | [**transactionsGet**](docs/DefaultApi.md#transactionsGet) | **GET** /api/v1/transactions | Returns transactions that match the filters.
*DefaultApi* | [**transactionsPost**](docs/DefaultApi.md#transactionsPost) | **POST** /api/v1/transactions | Returns transactions that match the filters.
*DefaultApi* | [**uxout**](docs/DefaultApi.md#uxout) | **GET** /api/v1/uxout | Returns an unspent output by ID.
*DefaultApi* | [**verifyAddress**](docs/DefaultApi.md#verifyAddress) | **POST** /api/v2/address/verify | Verifies a Skycoin address.
*DefaultApi* | [**version**](docs/DefaultApi.md#version) | **GET** /api/v1/version | 
*DefaultApi* | [**wallet**](docs/DefaultApi.md#wallet) | **GET** /api/v1/wallet | Returns a wallet by id.
*DefaultApi* | [**walletBalance**](docs/DefaultApi.md#walletBalance) | **GET** /api/v1/wallet/balance | Returns the wallet&#39;s balance, both confirmed and predicted.  The predicted balance is the confirmed balance minus the pending spends.
*DefaultApi* | [**walletCreate**](docs/DefaultApi.md#walletCreate) | **POST** /api/v1/wallet/create | 
*DefaultApi* | [**walletDecrypt**](docs/DefaultApi.md#walletDecrypt) | **POST** /api/v1/wallet/decrypt | Decrypts wallet.
*DefaultApi* | [**walletEncrypt**](docs/DefaultApi.md#walletEncrypt) | **POST** /api/v1/wallet/encrypt | Encrypt wallet.
*DefaultApi* | [**walletFolder**](docs/DefaultApi.md#walletFolder) | **GET** /api/v1/wallets/folderName | 
*DefaultApi* | [**walletNewAddress**](docs/DefaultApi.md#walletNewAddress) | **POST** /api/v1/wallet/newAddress | 
*DefaultApi* | [**walletNewSeed**](docs/DefaultApi.md#walletNewSeed) | **GET** /api/v1/wallet/newSeed | 
*DefaultApi* | [**walletRecover**](docs/DefaultApi.md#walletRecover) | **POST** /api/v2/wallet/recover | Recovers an encrypted wallet by providing the seed. The first address will be generated from seed and compared to the first address of the specified wallet. If they match, the wallet will be regenerated with an optional password. If the wallet is not encrypted, an error is returned.
*DefaultApi* | [**walletSeed**](docs/DefaultApi.md#walletSeed) | **POST** /api/v1/wallet/seed | This endpoint only works for encrypted wallets. If the wallet is unencrypted, The seed will be not returned.
*DefaultApi* | [**walletSeedVerify**](docs/DefaultApi.md#walletSeedVerify) | **POST** /api/v2/wallet/seed/verify | Verifies a wallet seed.
*DefaultApi* | [**walletTransaction**](docs/DefaultApi.md#walletTransaction) | **POST** /api/v1/wallet/transaction | Creates a signed transaction
*DefaultApi* | [**walletTransactionSign**](docs/DefaultApi.md#walletTransactionSign) | **POST** /api/v2/wallet/transaction/sign | Creates a signed transaction
*DefaultApi* | [**walletTransactions**](docs/DefaultApi.md#walletTransactions) | **GET** /api/v1/wallet/transactions | 
*DefaultApi* | [**walletUnload**](docs/DefaultApi.md#walletUnload) | **POST** /api/v1/wallet/unload | Unloads wallet from the wallet service.
*DefaultApi* | [**walletUpdate**](docs/DefaultApi.md#walletUpdate) | **POST** /api/v1/wallet/update | Update the wallet.
*DefaultApi* | [**wallets**](docs/DefaultApi.md#wallets) | **GET** /api/v1/wallets | 


## Documentation for Models

 - [Address](docs/Address.md)
 - [ApiV1PendingTxsTransaction](docs/ApiV1PendingTxsTransaction.md)
 - [ApiV1PendingTxsTransactionOutputs](docs/ApiV1PendingTxsTransactionOutputs.md)
 - [BlockSchema](docs/BlockSchema.md)
 - [BlockSchemaBody](docs/BlockSchemaBody.md)
 - [BlockVerboseSchema](docs/BlockVerboseSchema.md)
 - [BlockVerboseSchemaBody](docs/BlockVerboseSchemaBody.md)
 - [BlockVerboseSchemaHeader](docs/BlockVerboseSchemaHeader.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse20010](docs/InlineResponse20010.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [InlineResponse2007](docs/InlineResponse2007.md)
 - [InlineResponse2008](docs/InlineResponse2008.md)
 - [InlineResponse2008Data](docs/InlineResponse2008Data.md)
 - [InlineResponse2009](docs/InlineResponse2009.md)
 - [InlineResponseDefault](docs/InlineResponseDefault.md)
 - [NetworkConnectionSchema](docs/NetworkConnectionSchema.md)
 - [NetworkConnectionSchemaUnconfirmedVerifyTransaction](docs/NetworkConnectionSchemaUnconfirmedVerifyTransaction.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionEncoded](docs/TransactionEncoded.md)
 - [TransactionEncodedS](docs/TransactionEncodedS.md)
 - [TransactionStatus](docs/TransactionStatus.md)
 - [TransactionTxn](docs/TransactionTxn.md)
 - [TransactionV2ParamsAddress](docs/TransactionV2ParamsAddress.md)
 - [TransactionV2ParamsAddressHoursSelection](docs/TransactionV2ParamsAddressHoursSelection.md)
 - [TransactionV2ParamsUnspent](docs/TransactionV2ParamsUnspent.md)
 - [TransactionV2ParamsUnspentHoursSelection](docs/TransactionV2ParamsUnspentHoursSelection.md)
 - [TransactionV2ParamsUnspentTo](docs/TransactionV2ParamsUnspentTo.md)
 - [TransactionVerbose](docs/TransactionVerbose.md)
 - [TransactionVerboseTxn](docs/TransactionVerboseTxn.md)
 - [TransactionVerboseTxnInputs](docs/TransactionVerboseTxnInputs.md)
 - [TransactionVerifyRequest](docs/TransactionVerifyRequest.md)
 - [WalletTransactionRequest](docs/WalletTransactionRequest.md)
 - [WalletTransactionRequestHoursSelection](docs/WalletTransactionRequestHoursSelection.md)
 - [WalletTransactionRequestWallet](docs/WalletTransactionRequestWallet.md)
 - [WalletTransactionSignRequest](docs/WalletTransactionSignRequest.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### csrfAuth


- **Type**: API key
- **API key parameter name**: X-CSRF-TOKEN
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

contact@skycoin.net
