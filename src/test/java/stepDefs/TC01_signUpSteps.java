package stepDefs;

import Pages.L01_SignupLocators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static stepDefs.Hooks.driver;

public class TC01_signUpSteps {

    L01_SignupLocators signup = new L01_SignupLocators();

    @When("user click on signup button")
    public void user_click_on_signup_button(){
        signup.signUpButton().click();
    }
    @And("user signup with valid {string} and {string}")
    public void user_signup_with_valid(String username ,String password){
        signup.usernameField().sendKeys(username);
        signup.passwordField().sendKeys(password);
    }
    @And("press on signup button")
    public void press_on_signup_button(){
        signup.signupConfirm().click();
    }

    @Then("verify user signup successfully")
    public void signupSuccess(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        String actualResult = alert.getText();
        String expectedResult ="Sign up successful.";
        Assert.assertEquals(actualResult,expectedResult);
        alert.accept();

    }
}
