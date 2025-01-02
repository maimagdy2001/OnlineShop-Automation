package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class L04_cartlocator {
    WebDriver driver = Hooks.driver;
    public WebElement cartbutton (){
        return driver.findElement(By.xpath("//*[@id=\"cartur\"]"));
    }



    public int product1pricecart () {
        WebElement price = driver.findElement(By.xpath("//td[text()='Sony vaio i5']/following-sibling::td"));
        String pricetext= price.getText();
        return Integer.parseInt(pricetext);
    }

    public String  product1namecart () {
        return driver.findElement(By.xpath("//td[contains(text(), 'Sony vaio i5')]")).getText();
    }


    public String product2namecart () {
        return driver.findElement(By.xpath("//td[contains(text(), 'Sony vaio i7')]")).getText();
    }


    public int product2price () {
          WebElement price = driver.findElement(By.xpath("//td[contains(text(), 'Sony vaio i7')]/following-sibling::td"));
          String pricetext= price.getText();
          return Integer.parseInt(pricetext);
    }

    public int TotalCartAmount(){
        WebElement TotalPrice = driver.findElement(By.xpath("//*[@id=\"totalp\"]"));
        return Integer.parseInt(TotalPrice.getText());
    }



}
