Feature: demoqa regitrion
Scenario Outline: demo page reg text box only

Given The user navigates to demo page
When The user enters firstname"<fname>" and lastname"<lname>"and phonenumber"<pnumber>"and username"<uname>" and email"<email>"and password "<password>"and conpassword"<conpassword>"
Then The user verify first name"<fname>" andlast name"<lname>" and phonenumber "<pnumber>"and username "<uname>" and email "<email>" and password "<password>"and conpassword"<conpassword>"
Examples:

|fname    |lname   |pnumber    |uname   |email           |password |conpassword|
|santhosh |kumar   |9895949392 |san     |bala@gmail.com  |123456789|123456789  |
|san1     |kumar1  |9790935323 |san1    |bala93@gmail.com|15678978 |15678978   |
|san2     |kumar2  |9843536373 |san2    |bala95@gmail.com|123456798|123466798  |

Scenario: demo page reg radiobutton and checkbox
Then the user click staus button
When the user click check box 

Scenario: demo page dropdown selection
Then the user select the country
|country|
|Albania|
|Angola|
|Armenia|
When the user select the DOoB
|month|day |year|
|1    |11  |1999|
|2    |2   |2000|
|5    |5   |2010|