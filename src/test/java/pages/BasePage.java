package pages;

import helper.PropertySettings;
import org.openqa.selenium.WebDriver;

public class BasePage  {
    WebDriver driver;

    public BasePage() {
        driver = PropertySettings.getInstance().getCurrentDriver();
    }


    public void waitFor(double second) {
        try {
            Thread.sleep((int) (1000 * second));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
