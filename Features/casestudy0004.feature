Feature: Cart Situation

Scenario: user moves to the cart without adding any item
Given Alex has registerd to the testme app
When Alex search a particular product
And try to proceed to payment without adding any item
Then Testmeapp didnt display any icon
