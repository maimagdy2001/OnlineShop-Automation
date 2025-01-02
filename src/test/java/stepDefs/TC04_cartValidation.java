package stepDefs;

import Pages.L03_productLocators;
import Pages.L04_cartlocator;
import Pages.StoreData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TC04_cartValidation {

    L04_cartlocator cart = new L04_cartlocator();


    @And("click on cart putton")
    public void click_on_cart_putton(){
        cart.cartbutton().click();
    }
    @And("verify that the product1 added to the cart with the same titel and price")
    public void verify_that_the_product1_added_to_the_cart_with_the_same_titel_and_price(){

        String productName1 = StoreData.productName1;
        String cartProductName1 = cart.product1namecart();

        int productprice1 = StoreData.ProductPrice1;
        int cartProductprice1=cart.product1pricecart();

        Assert.assertEquals(productName1,cartProductName1);
        Assert.assertEquals(productprice1,cartProductprice1);

    }

    @And("verify that the product2 added to the cart with the same titel and price")
    public void verify_that_the_product2_added_to_the_cart_with_the_same_titel_and_price(){
        String productname2=StoreData.productName2;
        String cartProductName2 = cart.product2namecart();
        int productprice2=StoreData.ProductPrice2;
        int cartproductprice2=cart.product2price();
        Assert.assertEquals(productname2,cartProductName2);
        Assert.assertEquals(productprice2,cartproductprice2);
    }

    @Then("verify that total amount is display corectally for poth product")
    public void verify_that_total_amount_is_display_corectally_for_poth_product(){

        int ExpectedTotal = cart.product1pricecart()+cart.product2price();
        int ActualTotal = cart.TotalCartAmount();

        Assert.assertEquals(ActualTotal,ExpectedTotal);


    }




}
