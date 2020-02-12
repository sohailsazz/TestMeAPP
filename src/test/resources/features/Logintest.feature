Feature:Login Functionality

Scenario: Login with valid credentials
Given Navigate to Home page
When user enters username and password
Then user logged in successfully

@sanity
Scenario: The one where the user change some of the data and place the order
Given Larry has already Signed-In in the TestMeApp
When Larry increase the headphone by 2
And continue for checkout
And change the shipping address to a new address as "Pune"
Then the product should be delivered to the new address


Scenario Outline: The one where the user logs in with different user data
When Larry login with below set of "<username>" and "<password>"
Then Larry login successfully to TestMeApp

Examples:
|username | password |
|Lalitha | Password123|
