package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import helper.Base;


public class Hook extends Base {
    @Before
    public void setUp(){
        startDriver();
        driver.get(prop.getProperty("url"));
    }

    @After
    public void tearDown(){
        stopDriver();
    }
}
