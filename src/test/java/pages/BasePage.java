package pages;

import helper.Configurations;

public class BasePage extends Configurations {
    public void waitFor(double second) {
        try {
            Thread.sleep((int) (1000 * second));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
