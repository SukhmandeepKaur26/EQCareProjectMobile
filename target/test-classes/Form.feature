@tag
Feature: As a user, I want the contact form to display validation errors when I submit an empty form and with valid test data.

Background:
Given I have visited EQCare support page

@tag1
Scenario: Submit an empty support Form
When I click on submit without entering any data in the form
Then proper validation errors should be displayed and user should be unable to submit the form.

@tag2
Scenario: Submit the support form with valid data
When I enter valid data values in all form fields
Then User should be able to submit the form successfully.