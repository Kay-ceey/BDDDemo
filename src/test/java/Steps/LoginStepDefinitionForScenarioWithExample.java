package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinitionForScenarioWithExample {
    private WebDriver driver;

    @Given("User is on Home page")
    public void userIsOnHomePage() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("User Navigate to Login page")
    public void userNavigateToLoginPage() {
        System.out.println("User navigates to login page");
    }

    @And("Enters {string} and {string}")
    public void entersAnd(String arg0, String arg1) {
        System.out.println("Username is "+arg0+" password is "+arg1);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(arg0);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(arg1);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }

    @Then("Message displays login successfully")
    public void messageDisplaysLoginSuccessfully() throws Throwable{
        System.out.println("successfully logged in");
        Thread.sleep(2000);
        driver.close();
    }
}
