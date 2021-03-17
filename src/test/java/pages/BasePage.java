package pages;

import helper.TestSetup;

public class BasePage extends TestSetup {
    public void waitFor(double second) {
        try {
            Thread.sleep((int) (1000 * second));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
