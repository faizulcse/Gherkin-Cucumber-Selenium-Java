package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import helper.TestSetup;

public class Hook extends TestSetup {
    @Before
    public void setUp() {
        TestSetup.startDriver();
    }

    @After
    public void tearDown() {
        TestSetup.closeBrowser();
    }
}
