package stepDefs;

import Pages.L04_cartlocator;
import Pages.L05_CheckoutLocators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TC05_CheckoutSteps {

    L05_CheckoutLocators checkout = new L05_CheckoutLocators();
    L04_cartlocator cart = new L04_cartlocator();

    @And("click on place order button")
    public void click_on_placeOrder_button(){

        checkout.placeOrderButton().click();
    }

    @And("Verify that the total amount is calculated correctly")
    public void Verify_the_total_amount(){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElement(checkout.totalText(),"Total:"));


        int ExpectedPurchaseTotal= cart.TotalCartAmount();
        int ActualPurchaseTotal = checkout.PurchaseTotal();

        Assert.assertEquals(ActualPurchaseTotal,ExpectedPurchaseTotal);

    }

    @And("fill data name {string} country {string} city {string} card {string} month {string} year {string}")
    public void fill_field_with_data(String name , String country , String city,String card , String month , String year){

        checkout.inputNameField().sendKeys(name);

        checkout.inputCountryField().sendKeys(country);

        checkout.inputCityField().sendKeys(city);

        checkout.inputCardField().sendKeys(card);

        checkout.inputMonthField().sendKeys(month);

        checkout.inputYearField().sendKeys(year);

    }


    @And("click purchase button")
    public void click_on_purchase_button(){

        checkout.purchaseButton().click();

    }

    @Then("verify the purchase completed succesfully")
    public void verify_the_purchase_completed_successfully(){

        String ExpectedMessage = "Thank you for your purchase!";
        String ActualMessage = checkout.purchaseMessage();

        Assert.assertEquals(ActualMessage,ExpectedMessage);


    }

}
