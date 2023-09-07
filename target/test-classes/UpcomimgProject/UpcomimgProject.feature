
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
     Then user clicks the closeTab
    
    Examples:
    |Name|PhoneNumber|EmailId|
    |swathy|8072660406|swathykarthikeyan20@gmail.com|
    
 
    @log6
    Scenario Outline: Negative Scenario for BrochureForm

    When The user needs to click the Feedback button
    And  The user needs to is enter the <"Email"> 
    And the user needs to enter the feedback <"Feedback_details">
    And the user needs to clicks on the Send button
    Then the user needs to clicks on the Ok button
   Examples:
   |Email Id|FeedBack Details|
   ||I get good home from this website|        
    
    
    
    
    