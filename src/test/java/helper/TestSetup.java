package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.util.concurrent.TimeUnit;

public class TestSetup {
    protected static WebDriver driver;
    protected static String baseUrl;

    public static void startDriver() {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, Constants.CHROME_DRIVER_MAC);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/guru99home/");
    }

    public static void closeBrowser() {
        if (driver != null)
            driver.quit();
    }
}