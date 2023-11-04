# ATM

### Description
Create a basic interface for an ATM:

"Write a program implementing a bank ATM interface. Upon logging in with a username and pin, a user should be able to 
make deposits, withdrawals, and transfers between accounts. The user should also be able to list the transactions for 
each account, so this program can be somewhat of a blend between the functionality of an ATM and that of an online 
banking system."

### Functional Example
An example of session where a user interacts with the ATM is given below.

New user Doe, John with ID 209635 created.

Welcome to Bank of Scotland

Enter user ID: 209635
Enter pin: 1234

John's accounts summary

6087306216 : £.00 : Savings
9186453789 : £0.00 : Checking
What would you like to do?

Show account transaction history
Withdraw
Deposit
Transfer
Quit
Enter choice: 3
Enter the number (1-2) of the account to deposit to: 1
Enter the amount to deposit: £20
Enter a memo: birthday money from grandma

John's accounts summary

6087306216 : £20.00 : Savings
9186453789 : £0.00 : Checking
What would you like to do?

Show account transaction history
Withdraw
Deposit
Transfer
Quit
Enter choice: 4
Enter the number (1-2) of the account to transfer from: 1
Enter the number (1-2) of the account to transfer to: 2
Enter the amount to transfer (max £20.00): £10

John's accounts summary

6087306216 : £10.00 : Savings
9186453789 : £10.00 : Checking
What would you like to do?

Show account transaction history
Withdraw
Deposit
Transfer
Quit
Enter choice: 2
Enter the number (1-2) of the account to withdraw from: 2
Enter the amount to withdraw (max £10.00): £7.25
Enter a memo: money for candy

John's accounts summary

6087306216 : £10.00 : Savings
9186453789 : £2.75 : Checking
What would you like to do?

Show account transaction history
Withdraw
Deposit
Transfer
Quit
Enter choice: 1
Enter the number (1-2) of the account
whose transactions you want to see: 2

Transaction history for account 9186453789
Fri Jul 05 12:15:09 EDT 2013, £(7.25) : money for candy
Fri Jul 05 12:14:52 EDT 2013, £10.00 : Transfer from account 6087306216

John's accounts summary

6087306216 : £10.00 : Savings
9186453789 : £2.75 : Checking
What would you like to do?

Show account transaction history
Withdraw
Deposit
Transfer
Quit
Enter choice: 1
Enter the number (1-2) of the account
whose transactions you want to see: 1

Transaction history for account 6087306216
Fri Jul 05 12:14:52 EDT 2013, £(10.00) : Transfer to account 9186453789
Fri Jul 05 12:14:39 EDT 2013, £20.00 : birthday money from grandma

John's accounts summary

6087306216 : £10.00 : Savings
9186453789 : £2.75 : Checking
What would you like to do?

Show account transaction history
Withdraw
Deposit
Transfer
Quit
Enter choice: 5

Welcome to Bank of Scotland

Enter user ID: 209635
Enter pin: 1234

John's accounts summary

6087306216 : £10.00 : Savings
9186453789 : £2.75 : Checking
What would you like to do?

Show account transaction history
Withdraw
Deposit
Transfer
Quit
Enter choice: 5

### Tech Stack

| Component      | Tech                                                                                                                                                                                                            |
|----------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| App Link       | [atm.lyle.app](https://cookie-contacts.lyle.app)                                                                                                                                                                |                                                                                                                                                                                                                                                                                               
| Frontend       | ![React](https://img.shields.io/badge/react%2016-%2320232a.svg?style=for-the-badge&logo=react&logoColor=%2361DAFB)                                                                                              |
| Backend        | ![Java](https://img.shields.io/badge/JAVA%20-JDK%208-green?style=for-the-badge) ![Spring Boot](https://img.shields.io/badge/spring%20boot%202.1-white.svg?style=for-the-badge&logo=springboot&logoColor=6DB33F) |
| Database       | ![MongoDB](https://img.shields.io/badge/MongoDB-47A248.svg?style=for-the-badge&logo=MongoDB&logoColor=white)                                                                                                    |
| Cloud          | ![Heroku](https://img.shields.io/badge/Heroku-430098.svg?style=for-the-badge&logo=Heroku&logoColor=white)                                                                                                       |
| Client Build   | ![NPM](https://img.shields.io/badge/npm-white.svg?style=for-the-badge&logo=npm&logoColor=CB3837) ![Yarn](https://img.shields.io/badge/yarn-2C8EBB.svg?style=for-the-badge&logo=yarn&logoColor=FFF)              |                                                                                                                                                                                                                                                                                               
| Server Build   | ![Maven](https://img.shields.io/badge/maven-white.svg?style=for-the-badge&logo=apache%20maven&logoColor=C71A36)                                                                                                 |
| API            | ![Swagger](https://img.shields.io/badge/swagger-85EA2D.svg?style=for-the-badge&logo=swagger&logoColor=FFF)                                                                                                      |
| Test Framework | ![Test Framework](https://img.shields.io/badge/JUnit5-47A248.svg?style=for-the-badge&logo=JUnit5&logoColor=white)                                                                                               |

### Setup & Launch

Coming soon...

<br >

#### Acknowledgements
The repo badges, logos and code stats on this README are courtesy of [Simple Icons](https://simpleicons.org) and [Shields.io](https://shields.io).