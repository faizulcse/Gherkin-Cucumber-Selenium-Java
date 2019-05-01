package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Configurations {
	protected static WebDriver driver;
	private static String browser;
	protected static String  baseUrl;

    private static void loadConfigData() {
		try{
            Properties prop = new Properties();
            prop.load(new FileInputStream(Constants.SETTING_PATH));
            baseUrl = prop.getProperty("url");
            int waitTime = Integer.parseInt(prop.getProperty("waitTime"));
            browser = prop.getProperty("browser");
            String dbhost = prop.getProperty("dbhost");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private static void selectDriver(){
        if (System.getProperty("os.name").contains("Mac")) {
            if(browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_MAC);
                driver = new ChromeDriver();
            }
            if(browser.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver", Constants.FIRE_FOX_DRIVER_MAC);
                driver = new FirefoxDriver();
            }
        }
        if (System.getProperty("os.name").contains("Windows")) {
            if(browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_WINDOWS);
                driver = new ChromeDriver();
            }
            if(browser.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver", Constants.FIRE_FOX_DRIVER_WINDOWS);
                driver = new FirefoxDriver();
            }
        }
    }

	public static void openBrowser(){
        loadConfigData();
        selectDriver();
        if(driver!=null) {
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
        }
        else
        {
            System.out.println("==================< Failed to opening '" +browser+ "' browser >==================\n[Note]: This Framework is supported by" +
                    " MAC & Windows OS and Chrome & Firefox browser,\n\t" +
                    "Go to 'Config' >> 'setting.conf' and set a browser name as 'chrome' or 'firefox'");
            System.exit(0);
        }
    }

    public static void closeBrowser(){
        if(driver!=null)
            driver.quit();
        else
        {
            System.out.println("Failed to closing " +browser+ " browser");
            System.exit(0);
        }

    }
}