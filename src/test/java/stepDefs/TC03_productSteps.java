package stepDefs;

import Pages.L03_productLocators;
import io.cucumber.java.en.And;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TC03_productSteps {

    WebDriver driver = Hooks.driver;
    L03_productLocators product = new L03_productLocators();



    @And("click on laptop in categories")
    public void click_on_laptop_in_categories() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nameofuser\"]")));

        product.laptops().click();


        Thread.sleep(2000);
    }


    @And("click on the first laptop")
    public void click_on_first_laptop() {

        product.firstLaptop().click();
        product.productName1();
        product.productPrice1();


    }


    @And("click on add to cart button")
    public void click_on_addToCart_Button(){
        product.addToCartButton().click();
    }


    @And("verify that the product added to the cart")
    public void verify_product_added_to_cart() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();

        String ExpectedResult = "Product added.";
        String ActualResult = alert.getText();

        Assert.assertEquals(ActualResult,ExpectedResult);
        alert.accept();
    }


    @And("go back to the laptops page")
    public void navigate_to_laptops(){
        product.back();
    }


    @And("click on the second laptop")
    public void click_on_second_laptop(){
        product.secondLaptop().click();
        product.productName2();
        product.productPrice2();

    }

}
