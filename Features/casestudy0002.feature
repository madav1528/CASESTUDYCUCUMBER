Feature:  login of TestMeApp

Scenario Outline: user enters username and password
Given login page is diplayed
When user entesrrr "<username>" as username
When user enterrrr "<password>" as password
Then Succesfull Login

Examples:
|username|password|
|madav333|madav321| 