package StepsDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCSteps {
    private WebDriver d;

    @Before
    public void init(){
        d = new ChromeDriver();
        d.manage().window().maximize();
    }

    @Given("I open the BBC homepage")
    public void iOpenTheBBCHomepage() {
        d.get("https://www.bbc.com");
    }

    @When("I click on the news link")
    public void iClickOnTheNewsLink() {
        d.findElement(By.linkText("News")).click();
    }

    @Then("I should see {string} in the page title")
    public void iShouldSeeInThePageTitle(String expectedText) {
        String title = d.getTitle();
        System.out.println(title);
        Assert.assertTrue("Page title contain expected text",title.contains(expectedText));
    }
}
