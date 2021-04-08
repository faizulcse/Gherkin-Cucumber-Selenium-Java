package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.TestPage;

public class TestStep {
    @Then("^I should see the High Five confirmation and freddie hand displayed$")
    public void iShouldSeeTheHighFiveConfirmationAndFreddieHandDisplayed() {
        System.out.println("^I should see the High Five confirmation and freddie hand displayed$");
        new TestPage().testClick();

    }

    @Then("^I should see the \"([^\"]*)\" page$")
    public void iShouldSeeThePage(String arg0) {

    }

    @And("^I should see a create campaign iconoing, Completed$")
    public void iShouldSeeACreateCampaignIconoingCompleted() {

    }

    @Given("^I am on the campaigns mobile view$")
    public void iAmOnTheCampaignsMobileView() {

    }

    @Given("^I am on the xxx home page$")
    public void iAmOnTheXxxHomePage() {

    }
}
