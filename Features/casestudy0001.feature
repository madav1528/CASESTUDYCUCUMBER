Feature: TestMeApp

Scenario Outline: Registration of TestMeApp
Given the signup page is opened
When user entes "<username>" as username
When user entrs "<firstname>" as firstname
When user entrs "<lastname>" as lastname
When user eners "<password>" as password
When user entes "<con_password>" as conpassword
When Select male
When user eners "<email>" as email
When user eners "<mobile>" as mobile
When user entrs "<dob>" as dob
When user ents "<address>" as address
When Select secque
When user entr "<answer>" as answer
When user Clicks Register
Then Registers Successfully


Examples:
     |username|firstname|lastname|password|con_password|email          |mobile    |dob       |address           |answer|
     |madav333|madav    |rakshith|madav321|madav321    |madav@gmail.com|9008765432|14/05/1997|Koramangala       |my    |
