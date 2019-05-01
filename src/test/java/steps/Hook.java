package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import helper.Configurations;

public class Hook {
    @Before
    public void setUp(){
        Configurations.openBrowser();
    }

    @After
    public void tearDown(){
        Configurations.closeBrowser();
    }
}
