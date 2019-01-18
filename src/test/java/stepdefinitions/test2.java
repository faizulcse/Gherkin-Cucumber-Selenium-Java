package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {
    WebDriver mdriver;
    @Then("^I should see the High Five confirmation and freddie hand displayed$")
    public void iShouldSeeTheHighFiveConfirmationAndFreddieHandDisplayed() {
        mdriver.close();

    }

    @Then("^I should see the \"([^\"]*)\" page$")
    public void iShouldSeeThePage(String arg0) throws Throwable {
        mdriver = new ChromeDriver();
              
    }

    @And("^I should see a create campaign iconoing, Completed$")
    public void iShouldSeeACreateCampaignIconoingCompleted() {
        mdriver.get("https://www.google.com/");
    }

    @Given("^I am on the campaigns mobile view$")
    public void iAmOnTheCampaignsMobileView() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
    }
}
