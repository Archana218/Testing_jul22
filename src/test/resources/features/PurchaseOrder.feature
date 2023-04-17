Feature: Purchase order functionality verification
  
@RegressionTest12
Scenario Outline: Verify that user is able create purchase order successfully
Given User is logged into Purna application "<TestCase_ID>" "Purchase order"
When User clicks on purchase link
When User clicks on purchase order link
When User clicks on New purchase order button
When User enters purchase invoice details
When User clicks on Calculate button
When User clicks on Save button
When User clicks on Ok popup
When User clicks on Purchase Invoice details button
Then User verifies that the new Purchase order is created

Examples:
      | TestCase_ID |
      | Purna_TC_008|

@RegressionTest123
Scenario: Verify that user is able delete purchase order successfully
Given User is logged into Purna application "<TestCase_ID>" "Purchase order"
When User clicks on purchase link
When User clicks on purchase order link
When User clicks on New purchase order button
When User enters below purchase invoice details
|8888146874|CR123|12000|
When User clicks on Calculate button
When User clicks on Save button
When User clicks on Ok popup
When User clicks on Purchase Invoice details button
When User clicks on delete button
When User clicks on Ok popup
Then User verifies that the purchase order is deleted
