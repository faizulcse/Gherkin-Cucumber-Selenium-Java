package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import helper.BowserSetUp;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Hook extends BowserSetUp {
    static Logger log = Logger.getLogger(Hook.class);
    static boolean flag = true;
    public Hook(){

        if (flag == true){
            PropertyConfigurator.configure("log/log4j.properties");
            flag = false;
        }
    }

    @Before
    public void setUp(){
        log.debug("Browser is running...");
        startDriver();
        log.debug("Target URL is: " + prop.getProperty("url"));
        driver.get(prop.getProperty("url"));
    }

    @After
    public void tearDown(){
        log.debug("Browser is closing");
        stopDriver();
    }
}
