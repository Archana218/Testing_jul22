Feature: Edit Bank
  This feature will verify bank detail edit validations for P

  @BankLogin345
  Scenario Outline: Edit Bank Scenario one
    Given User is logged into Bank Domain application "<TestCase_ID>" "Purchase order" 
    When User Click on Bank Dashboard Link 
    When User Click on Edit Bank Button
    When User enter below details
    |DCB BANK|ABC|545648978231|PUN-MAH|DCB0PUNMAH|50000|
    When User click on Save Change
    When Uesr hendle Alerts
    Then User Verify that bank detail edited
    
    Examples:
      | TestCase_ID |
      | Purna_TC_001|
      
      
  

 
