package managers;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.http.Consts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class WebDriverManager {
	
	private WebDriver driver;
	//private static DriverType driverType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	
	

	public WebDriver getDriver() {
		if(driver==null)
			driver=createDriver();
		return driver;
}
	
	
	private WebDriver createDriver() {
		
			System.setProperty(CHROME_DRIVER_PROPERTY, "src/test/resources/drivers/chromedriver.exe");
			
		
			
			Map<String, Object> deviceMetrics = new HashMap<>();
			deviceMetrics.put("width", 560);
			deviceMetrics.put("height", 640);
			deviceMetrics.put("pixelRatio", 4.0);
			Map<String, Object> mobileEmulation = new HashMap<>();
			mobileEmulation.put("deviceMetrics", deviceMetrics);
			mobileEmulation.put("userAgent", "Mozilla/5.0 (Linux; Android 8.0.0;" + "Pixel 2 XL Build/OPD1.170816.004) AppleWebKit/537.36 (KHTML,like Gecko) " + "Chrome/67.0.3396.99 Mobile Safari/537.36");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
			driver = new ChromeDriver(chromeOptions);

			/*Map<String, String> mobileEmulation = new HashMap<String, String>();
			//mobileEmulation.put("deviceName", "Google Nexus 5");
			mobileEmulation.put("deviceName", "iphone X");
			Map<String, Object> chromeOptions = new HashMap<String, Object>();
			chromeOptions.put("mobileEmulation", mobileEmulation);
			
			ChromeOptions options = new ChromeOptions();
			options.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			driver = new ChromeDriver(options);
			
		
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			 driver = new ChromeDriver(capabilities);*/
			 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
}
