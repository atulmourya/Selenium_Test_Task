Feature: Selenium Task

  Scenario: Verify user should be able to add and delete question from Survey
    Given Navigate to survey site
    When Login using credentials email = "selenium-general+cctest@questionpro.com" and password = "Selenium@123"
    And Click on new survey button
    And Enter Survey name "Demo Survey" and create survey
    And Click Add questions button
    And Click to Select Question
    Then Verify Question added successfully
    And Add questions text "This is Demo Question"
    And Click three dot menu
    And Click delete option
    And Click on delete question button
    Then Verify Question deleted successfully
    And Close browser
   
