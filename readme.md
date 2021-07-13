# Java Scenario Based Exercise - Bank Transfer API
 
 ## User Requirement
 You are working with a team of developers where each of you are working on separate components of a Banking Solution. 
 From design sessions with your PM, fellow develoeprs and architects, you have been given the below requirements for your application.
 As part of the sprint run, you have been assigned the _heroic_ task of creating an API that helps the solution perform 
 bank related transactions.
  
 You have to develop an API for the application to: 
 - Deposit money to an account.
 - Withdraw money from an account.
 - Transfer a specified amount of money from one bank account (the payer) to another (the payee).
 - Keep a record of the transactions above in the account's transaction history file.
 - Query a bank account's transaction history for any bank transfers to or from a specific account.
 
 Please note that since this is the first sprint of the project, you are not required to create a full fledged solution 
 requiring building of entire REST-ful microservices with underlying databases. You are only required to create an API
 with underlying methods/functions/procedures. 
 
 As far as the transaction records are concerned, our client has provided a `SampleTransactionHistory` file containing 
 a transaction history between sample accounts and has been placed in the project's resource folder. 
 
 Each line represents a separate transaction that has happened between accounts, of which there are three kinds of 
 transactions: DEPOSIT, WITHDRAW and TRANSFER. Each transaction has a millisecond-resolution time-stamps (representing the time
 since midnight on 1/1/1970). The first entry is the time-stamp which is the transaction taht has happened in the system.
 The second entry is the PAYER who is sending the amount..
 The third entry is the PAYEE who is receiving the amount. 
 The fourth entry is the Transaction type explained above.
 The last entry is the amount being transferred.
 So, the line looks like:
 ```
 1508405807467,RICK,MORTY,TRANSFER,2000
 ```
 
 Additionally, a `SampleAccounts` file has also been provided to show you the composition of accounts. 
 Any debits and credits to the account(s) should also reflect in the account holder's balance.
 Similar to the `SampleTransactionHistory` file above, this file contains:
 The Account holder name, the sortcode, the account number and the current balance in the account.
  So, the line looks like:
  ```
  MORTY,123451,78954125,6000
  ```
 
 Please also note that the banking solution currently doesn't allow any overdraft or negative account balances.
 
## Instructions
Clone the repository with the following command.

`git clone https://github.com/saboor922/BankTransferSample.git`

If you have problems with SSL, you can try the following.

`git clone -c http.sslVerify=false https://github.com/saboor922/BankTransferSample.git`

If you have problems with a proxy, you can unset http_proxy (or equivalent for your OS).

Open the project from IntelliJ IDEA (community edition is fine). 
The project files are committed and there are no external dependencies. 


## Additional Notes:
  - You may add/edit the Maven dependencies and plugins in the `pom.xml` to help you meet the above requirements.
  - You may not be able to complete all the requirements above for your API within the timeframe. However, I am keen as to how you approach the problem and how you articulate your solution.
