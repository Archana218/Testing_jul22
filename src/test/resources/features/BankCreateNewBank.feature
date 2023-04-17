Feature: Create New Bank
  This feature will verify create new bank validations for P

  @BankLogin234
  Scenario Outline: New Bank Scenario one
    Given User is logged into Bank Domain application "<TestCase_ID>" "Purchase order"
    When User Click on Bank Dashboard Link it should be on bank dashboard page
    When User Click on Add New Bank Button
    When User enter below detail
    |DCB BANK|FGHJ|7895641259|PUN-MAH|DCB0PUNMAH|50000|
    When User click on Add Bank
    When Uesr hendle Alert
    Then User Verify that new bank creation
    
    Examples:
      | TestCase_ID |
      | Purna_TC_001|
      
      
  

 
