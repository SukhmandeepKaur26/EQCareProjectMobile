package supportPage;

import testContext.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.SupportPagePOF;
    
	public class Form {
		TestContext TestContext;
		SupportPagePOF SupportPage;
		
		public Form(TestContext context){
			TestContext = context;
			SupportPage = TestContext.getPageObjectManager().getSupportPAgePOF();
		}

	@Given("^I have visited EQCare support page$")
	public void i_have_visited_EQCare_support_page() throws Throwable {
		 SupportPage.goToForm();
	}

	
		
	@When("^I click on submit without entering any data in the form$")
	public void i_click_on_submit_without_entering_any_data_in_the_form() throws Throwable {
		SupportPage.submitForm();
		
	}

	@Then("^proper validation errors should be displayed and user should be unable to submit the form\\.$")
	public void proper_validation_errors_should_be_displayed_and_user_should_be_unable_to_submit_the_form() throws Throwable {
	   SupportPage.assertion();
	   SupportPage.SubmitBtn.isDisplayed();
	   SupportPage.closeDriver();
	}

	@When("^I enter valid data values in all form fields$")
	public void i_enter_valid_data_values_in_all_form_fields() throws Throwable {
	SupportPage.enterFormData();
	}

	@Then("^User should be able to submit the form successfully\\.$")
	public void user_should_be_able_to_submit_the_form_successfully() throws Throwable {
		SupportPage.submitForm();
		SupportPage.SubmitSuccessVerfication.getText().contains("Go back to the homepage");
	    SupportPage.closeDriver();
	}

	

}
