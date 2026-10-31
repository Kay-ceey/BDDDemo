package Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class LoginSteps {
    @Given("User is in the login page of  the application")
    public void userIsInTheLoginPageOfTheApplication() {
    }

    @When("User logs in with following username and password")
    public void userLogsInWithFollowingUsernameAndPassword(DataTable dataTable) {
        List<List<String>> list_of_rows = dataTable.asLists(String.class);
        for (List<String> list : list_of_rows){
            for (String data : list){
                System.out.println(" Data : "+data);
            }
        }
    }

    @Then("user should be able to login with correct username and password")
    public void userShouldBeAbleToLoginWithCorrectUsernameAndPassword() {
    }
}
