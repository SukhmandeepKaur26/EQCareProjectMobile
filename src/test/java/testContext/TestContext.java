package testContext;

import managers.WebDriverManager;
import managers.PageObjectManager;

public class TestContext {
	
	private WebDriverManager WebDriverManager;
	private PageObjectManager PageObjectManager;
	
	public TestContext() {
		WebDriverManager = new WebDriverManager();
		PageObjectManager = new PageObjectManager(WebDriverManager.getDriver());
	}
	
	public WebDriverManager getWebDriverManager() {
		return WebDriverManager;

	}
	
	public PageObjectManager getPageObjectManager() {
		return PageObjectManager;
	}
}

