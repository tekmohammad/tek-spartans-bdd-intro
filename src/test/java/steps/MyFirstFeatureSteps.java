package steps;

import io.cucumber.java.de.Wenn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyFirstFeatureSteps {

    @Given("Open some type of Browser")
    public void openSomeBrowser() {
        System.out.println("opening some browser");
    }

    @Given("navigate to retail app")
    public void navigateToRetail() {
        System.out.println("Navigating to retail app");
    }

    @When("Click on Sign in button")
    public void clickOnSignInLink() {
        System.out.println("Click on sign in link");
    }

    @Then("validate your are in sign in page")
    public void validateSignInPage() {
        System.out.println("Validating you are in sign in page");
    }

    @When("fill up sign in form and click sign in")
    public void fillingUpSignInForm() {
        System.out.println("fill up sign in form and click sign in");
    }

    @Then("validate you are signed in")
    public void validateYouAreSignedIn() {
        System.out.println("validate you are signed in");
    }

    @When("enter invalid username and password and click sign in")
    public void enterInvalidCredential() {
        System.out.println("Invalid credentials");
    }

    @Then("Validate error message")
    public void validateErrorMessage() {
        System.out.println("Validate error message");
    }



}
