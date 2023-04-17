Feature: Add New Customer
  This feature will verify add new Customer validations for P

  @BankLogin456
  Scenario Outline: New Bank Scenario one
    Given User is logged into Bank Domain application "<TestCase_ID>" "Purchase order"
    When User Click add new Customer button from dashboard page
    When User enter below Customer details
    |SDF|SDF|9876543210|asdf@gmail.com|123423456876|GFYPL5863P|Pune|Archana|Archana|
    When User click on Add Customer
    When Uesr hendle Customer added successfully alert
    When User heldle show entry list drop dowen
    Then User Verify that new Customer creation
    
    Examples:
      | TestCase_ID |
      | Purna_TC_001|
      
      
  

 
