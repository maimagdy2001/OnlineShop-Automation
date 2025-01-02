package stepDefs;

import Pages.L02_LoginLocators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static stepDefs.Hooks.driver;

public class TC02_loginSteps {

    L02_LoginLocators login = new L02_LoginLocators();

    @When("user click on login button")
    public void user_click_on_login_button(){
        login.loginButton().click();
    }
    @And("user login with valid {string} and {string}")
    public void user_login_with_valid(String username ,String password){
        login.usernameField().sendKeys(username);
        login.passwordField().sendKeys(password);
    }

    @And("press on login button")
    public void press_on_login_button(){
        login.loginConfirm().click();
    }

    @And("verify user login successfully {string}")
    public void loginSuccessfully(String name) throws InterruptedException {

        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nameofuser\"]")));

        SoftAssert softAssert = new SoftAssert();
        String actualResult = login.welcomeButton().getText();
        String expectedResult ="Welcome "+name;
        softAssert.assertEquals(actualResult,expectedResult);
    }
}
