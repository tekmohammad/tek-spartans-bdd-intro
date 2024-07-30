Feature: This is my first feature file

#  Scenario: This is my first scenario
#    Given The step for preconditions
#    When this step use for actions
#    Then This step is validation of action result
#
#
#    Scenario: I need a new TV
#      Given checking my bank account for enought money
#      Then I should have enough money
#      Given make some free time
#      When I drive to BestBuy
#      Then I arrive BestBuy
#      Given Best Buy have the TV I want
#      When I pay for it
#      Then I have the new TV


      Scenario: In retail app want to sign in with valid credential
        Given Open some type of Browser
        Given navigate to retail app
        When Click on Sign in button
        Then validate your are in sign in page
        When fill up sign in form and click sign in
        Then validate you are signed in

        Scenario: In retail app want to sign in with invalid credential
          Given Open some type of Browser
          Given navigate to retail app
          When Click on Sign in button
          Then validate your are in sign in page
          When enter invalid username and password and click sign in
          Then Validate error message