package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.TestPage;

public class TestStep {
    @Then("^I should see the High Five confirmation and freddie hand displayed$")
    public void iShouldSeeTheHighFiveConfirmationAndFreddieHandDisplayed() {
       new TestPage().testClick();

    }

    @Then("^I should see the \"([^\"]*)\" page$")
    public void iShouldSeeThePage(String arg0) throws Throwable {

    }

    @And("^I should see a create campaign iconoing, Completed$")
    public void iShouldSeeACreateCampaignIconoingCompleted() {

    }

    @Given("^I am on the campaigns mobile view$")
    public void iAmOnTheCampaignsMobileView() {

    }
}
