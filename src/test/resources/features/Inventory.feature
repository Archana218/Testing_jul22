Feature: Verify Inventory module
	Verify the Inventory functionalities for Purna application
	

@MyPurnaTest_Ignore
Scenario Outline: Verify that user is able to create Inventory
Given User is logged into Purna application "<TestCase_ID>" "Login"
When User clicks on Main Menu
When User clicks on Inventory link
When User clicks on New Inventory button
When User enters below Inventory details
|John|9876543211|London|john@gmail.com|Matt|GST123|CULCN101R|
When User clicks on Inventory Save button
When User clicks on Inventory details button
Then Inventory should be created

Examples:
      | TestCase_ID |
      | Purna_TC_001|