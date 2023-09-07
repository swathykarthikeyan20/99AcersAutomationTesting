
@login
Feature: validate and check all the functionality in 99acres website 
#Background:
 #Given the user opens the web page
@log1 
  Scenario: Navigate to the UpComimg Project
    Given the user opens the web page
    When the user clicks on the Up Project link
    And the user scrolls down to the Floor Plan section 
    Then check all the Functionality of FloorPlan Section
 
   @log2 
   Scenario: Navigate to  Seller and Facilities  Section
    When the user scrolls down to the Seller Section
    And  check all the Functionality of Seller Section
    And the user scrolls down to the Facilities Section
    Then check all the Functionality of Facilities Section
    
    @log3
    Scenario: Navigate to BrochureAndPriceList and ExploreLocality  Section
    When the user scrolls down to the BrochureAndPriceList Section
    And will check all the functionality of BrochureAndPriceList Section
    Then the user scrolls down to the ExploreLocality Section
   
@log4
   Scenario:  Navigate to  Builder and FAQS Section
    When the user scrolls down to the Builder  Section
    And  check all the functionality of Builder Section
    And the user scrolls down to the FAQS Section
    Then check all the functionality of FAQS Section
    
    @log5
    Scenario Outline:  Navigate to Brochure form Section
    When the user scrolls down to the  Brochure Section
    And user click the Investment button 
    And user click the yes button 
    And user click the Month3
    And user click the Site
    And user click the Iagree
    And the user needs to enter the name <"Name">
    And user click the IN91
    And the user needs to enter the PhoneNumber<"PhoneNumber">
     And the user needs to enter the EmailId<"EmailId">
     And user clicks the download
     And user clicks the closeTab
    #Then check all the functionality of Brochure Section
    Examples:
    |Name|PhoneNumber|EmailId|
    |swathy|8072660406|swathykarthikeyan20@gmail.com|
    
  @log6
  Scenario: Enter Data from Excel Sheet
    When the user enters the following data:
    #And the user check all the functionality of ExcelSheet
    #Then the user submits the form and checks the result

    @log7
    Scenario Outline: negative Scenario for BrochureForm

    When the user scrolls down to the  Brochure Section
    And the user needs to enter the name <"Name">
    And the user needs to enter the PhoneNumber<"PhoneNumber">
    Then the user needs to enter the EmailId<"EmailId">
   
    Examples:
    |Name|PhoneNumber|EmailId|
    |swathy|NA|swathykarthikeyan20@gmail.com|
    
    
    
    