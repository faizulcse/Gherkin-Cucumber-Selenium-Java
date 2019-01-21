package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
	public static WebDriver driver;
	public static Properties prop;

	public Base(){
		prop = PropertySettings.getInstance().getProperties();
	}
	
	public static void startDriver(){
		String osName = prop.getProperty("os");
		String browserName = prop.getProperty("browser");

		if(osName.equals("windows")) {
			if(browserName.equals("chrome")){
				System.setProperty("webdriver.chrome.driver", AppConstant.CHROME_DRIVER_WINDOWS);	
				driver = new ChromeDriver(); 
			}
			else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", AppConstant.FIRE_FOX_DRIVER_WINDOWS);	
				driver = new FirefoxDriver(); 
			}
		}
		else if(osName.equals("mac")) {
			if(browserName.equals("chrome")){
				System.setProperty("webdriver.chrome.driver", AppConstant.CHROME_DRIVER_MAC);	
				driver = new ChromeDriver(); 
			}
			else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", AppConstant.FIRE_FOX_DRIVER_MAC);	
				driver = new FirefoxDriver(); 
			}
		}

		PropertySettings.getInstance().setWebDriver(driver);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(AppConstant.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(AppConstant.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}

	public static void stopDriver(){
		if(driver!=null){
			driver.quit();
		}
	}
	
}
