package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class SupportPagePOF {
	WebDriver driver;
	
	@FindBy(how=How.CSS, using=("[class='text-brand-title font-medium mb-6']"))
	public WebElement Banner;
	
	@FindBy(how=How.CSS, using=("[class] .tablet\\:half:nth-of-type(1) [type]"))
	public WebElement FirstName;
	
	@FindBy(how=How.CSS, using=("[class] .tablet\\:half:nth-of-type(2) [type]"))
	public WebElement LastName;
	
	@FindBy(how=How.CSS, using=("[class] .tablet\\:half:nth-of-type(3) [type]"))
	public WebElement PhoneNumber;
	
	@FindBy(how=How.CSS, using=("[class] .tablet\\:half:nth-of-type(4) [type]"))
	public WebElement Email;
	
	@FindBy(how=How.CSS, using=("[class] .tablet\\:half:nth-of-type(6) [type]"))
	public WebElement City;
	
	@FindBy(how=How.CSS, using=("textarea"))
	public WebElement Description;
	
	@FindBy(how=How.CSS, using=(".tablet\\:inline-flex .rounded-button"))
	public WebElement SubmitBtn;
	
	@FindBy(how=How.LINK_TEXT, using=("Go back to the homepage"))
	public WebElement SubmitSuccessVerfication;
	
	public SupportPagePOF(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void goToForm() {
	  driver.get("https://eqcare.com/en/contact-us/support");
      JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Banner);	
	}
	
	public void  SelectProvince() {
	Select drpProvince = new Select(driver.findElement(By.cssSelector("Select")));
	drpProvince.selectByVisibleText("Ontario");
}
	
	public void enterFormData() {
		FirstName.sendKeys("Test");
		LastName.sendKeys("Test");
		PhoneNumber.sendKeys("1234567890");
		Email.sendKeys("test@test.com");
		SelectProvince();
		City.sendKeys("Toronto");
		Description.sendKeys("Test description");
		
	}
	
	public void submitForm() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");	
		SubmitBtn.click();
	}
	
	public  void assertion() {
		SoftAssert softAssert = new SoftAssert();
		String FirstErrorMEssage = driver.findElement(By.cssSelector("div:nth-of-type(1) > .form-error")).getText();
	    String Firstexpect = "The first name field is required";
	    String Lastexpect = "The last name field is required";
	    String LastErrorMEssage2 = driver.findElement(By.cssSelector("div:nth-of-type(2) > .form-error")).getText();
	    softAssert.assertEquals(FirstErrorMEssage,Firstexpect);
	    softAssert.assertEquals(LastErrorMEssage2,Lastexpect);
	    softAssert.assertAll();
	    System.out.println("test");
}
	
	public void closeDriver() {
		//driver.close();
		driver.quit();
		
	}
}
	
	
