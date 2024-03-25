Feature: Login Action

Description: This feature will test a Login and LogOut functionality

Scenario Outline: Login with valid and Invalid Credentials
  Given User is on Home Page
  When User navigate to Login Page
  Then User enters "<username>" and "<password>"
  And Keeping case as "<Case>"
  Then User should get logged in
  And Message displayed Login Successfully
  Then User enters "<username>" and "<password>"
  And Keeping case as  invalid "<Case>"
  Then user will be asked to go back to login page
  And Provide correct credentials

Examples:
  | username        | password | Case   |
  | shinde55@gmail.com  | Shiva@123    | Valid  |
  | abc1@gmail.com | dfsd2    | Invalid|
