package pages;

import helper.PropertySettings;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class BasePage  {
    WebDriver driver;
    static Logger log =Logger.getLogger(BasePage.class);

    public BasePage() {
        driver = PropertySettings.getInstance().getCurrentDriver();
    }

    public void waitFor(double second) {
        log.debug("waiting for: " + second + " seconds");
        try {
            Thread.sleep((int) (1000 * second));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
