$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Form.feature");
formatter.feature({
  "line": 2,
  "name": "As a user, I want the contact form to display validation errors when I submit an empty form and with valid test data.",
  "description": "",
  "id": "as-a-user,-i-want-the-contact-form-to-display-validation-errors-when-i-submit-an-empty-form-and-with-valid-test-data.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I have visited EQCare support page",
  "keyword": "Given "
});
formatter.match({
  "location": "Form.i_have_visited_EQCare_support_page()"
});
formatter.result({
  "duration": 13898411700,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Submit an empty support Form",
  "description": "",
  "id": "as-a-user,-i-want-the-contact-form-to-display-validation-errors-when-i-submit-an-empty-form-and-with-valid-test-data.;submit-an-empty-support-form",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I click on submit without entering any data in the form",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "proper validation errors should be displayed and user should be unable to submit the form.",
  "keyword": "Then "
});
formatter.match({
  "location": "Form.i_click_on_submit_without_entering_any_data_in_the_form()"
});
formatter.result({
  "duration": 209651600,
  "status": "passed"
});
formatter.match({
  "location": "Form.proper_validation_errors_should_be_displayed_and_user_should_be_unable_to_submit_the_form()"
});
formatter.result({
  "duration": 1778884100,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I have visited EQCare support page",
  "keyword": "Given "
});
formatter.match({
  "location": "Form.i_have_visited_EQCare_support_page()"
});
formatter.result({
  "duration": 10449984400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Submit the support form with valid data",
  "description": "",
  "id": "as-a-user,-i-want-the-contact-form-to-display-validation-errors-when-i-submit-an-empty-form-and-with-valid-test-data.;submit-the-support-form-with-valid-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I enter valid data values in all form fields",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User should be able to submit the form successfully.",
  "keyword": "Then "
});
formatter.match({
  "location": "Form.i_enter_valid_data_values_in_all_form_fields()"
});
formatter.result({
  "duration": 899160700,
  "status": "passed"
});
formatter.match({
  "location": "Form.user_should_be_able_to_submit_the_form_successfully()"
});
formatter.result({
  "duration": 1682019200,
  "status": "passed"
});
});