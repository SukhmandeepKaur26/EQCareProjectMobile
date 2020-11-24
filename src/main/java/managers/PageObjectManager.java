package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.SupportPagePOF;

public class PageObjectManager {
	
	private WebDriver driver;
	SupportPagePOF SupportPage;
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public SupportPagePOF getSupportPAgePOF() {
		return(SupportPage==null)? new SupportPagePOF(driver):SupportPage;
	}
	
}

