Feature: Purna Sales invoice functionality
  I want to validate the Sales invoice functionality
  
  
 @RegressionTest
 Scenario Outline: Verify that user is able to create sales invoice
 Given User is logged into Purna application "<TestCase_ID>" "SalesInvoice"
 When user clicks on New Sales Invoice button
 When user enters sales invoice details
 When user enters "<sr number>"
 When user enters "<powo>"
 When user clicks on save button
 When User clicks on Ok button on popup
 When User clicks on Sale Invoice details button
 Then user verifies that the Sales Invoice is created
 
 Examples:
 | TestCase_ID |sr number|powo|
 | Purna_TC_005|1234|powo1234 |
 
 
 
 