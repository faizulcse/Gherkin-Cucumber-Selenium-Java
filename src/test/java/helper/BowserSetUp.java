package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BowserSetUp {
	public static WebDriver driver;
	public static Properties prop;

	public BowserSetUp(){
		prop = PropertySettings.getInstance().getProperties();
	}
	
	public static void startDriver(){
		String osName = System.getProperty("os.name");
		String browserName = prop.getProperty("browser");

		if(osName.contains("Windows")) {
			if(browserName.equals("chrome")){
				System.setProperty("webdriver.chrome.driver", AppConstant.CHROME_DRIVER_WINDOWS);	
				driver = new ChromeDriver(); 
			}
			else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", AppConstant.FIRE_FOX_DRIVER_WINDOWS);
				driver = new FirefoxDriver(); 
			}
		}
		else if(osName.contains("Mac")) {
			if(browserName.equals("chrome")){
				System.setProperty("webdriver.chrome.driver", AppConstant.CHROME_DRIVER_MAC);	
				driver = new ChromeDriver(); 
			}
			else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", AppConstant.FIRE_FOX_DRIVER_MAC);	
				driver = new FirefoxDriver(); 
			}
		}

		if(driver!=null){
			PropertySettings.getInstance().setWebDriver(driver);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			//driver.manage().timeouts().pageLoadTimeout(AppConstant.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(AppConstant.IMPLICIT_WAIT, TimeUnit.SECONDS);
		}
		else {
			System.out.println("Please go to 'config >> setting.conf' and set OS & Browser name");
			System.exit(0);
		}
	}

	public static void stopDriver(){
		if(driver!=null){
			driver.quit();
		}
	}
}