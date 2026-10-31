package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostStep {
    @Given("User should be logged in and should be present at its own wall")
    public void userShouldBeLoggedInAndShouldBePresentAtItsOwnWall() {
    }

    @When("I type the message as {string} in the text box")
    public void iTypeTheMessageAsInTheTextBox(String arg0) {
    }

    @And("Click on post button")
    public void clickOnPostButton() {
    }

    @Then("the message should get posted")
    public void theMessageShouldGetPosted() {
    }

    @When("User supply the youtube link as {string} in the text box")
    public void userSupplyTheYoutubeLinkAsInTheTextBox(String arg0) {
    }

    @Then("video should get posted on the user wall")
    public void videoShouldGetPostedOnTheUserWall() {
    }

    @And("the video should have proper thumbnailgta{int}")
    public void theVideoShouldHaveProperThumbnailgta(int arg0) {
    }
}
