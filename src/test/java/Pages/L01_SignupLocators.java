package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class L01_SignupLocators {

    WebDriver driver = Hooks.driver;

    public WebElement signUpButton(){
        return driver.findElement(By.xpath("//*[@id=\"signin2\"]"));
    }
    public WebElement usernameField(){
        return driver.findElement(By.xpath("//*[@id=\"sign-username\"]"));
    }
    public WebElement passwordField(){
        return driver.findElement(By.xpath("//*[@id=\"sign-password\"]"));
    }
    public WebElement signupConfirm(){
        return driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"));
    }

}
