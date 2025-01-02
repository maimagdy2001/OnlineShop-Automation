package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class L05_CheckoutLocators {

    WebDriver driver = Hooks.driver;

    public WebElement placeOrderButton(){
        return driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));
    }

    public WebElement inputNameField(){
        return driver.findElement(By.xpath("//*[@id=\"name\"]"));
    }

    public WebElement inputCountryField(){
        return driver.findElement(By.xpath("//*[@id=\"country\"]"));
    }
    public WebElement inputCityField(){
        return driver.findElement(By.xpath("//*[@id=\"city\"]"));
    }
    public WebElement inputCardField(){
        return driver.findElement(By.xpath("//*[@id=\"card\"]"));
    }
    public WebElement inputMonthField(){
        return driver.findElement(By.xpath("//*[@id=\"month\"]"));
    }
    public WebElement inputYearField(){
        return driver.findElement(By.xpath("//*[@id=\"year\"]"));
    }

    public WebElement purchaseButton(){
        return driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));
    }

    public int PurchaseTotal(){
        WebElement totalPrice = driver.findElement(By.xpath("//*[@id=\"totalm\"]"));
        String totalText=totalPrice.getText();

        return Integer.parseInt(totalText.replaceAll("[^0-9]", ""));
    }

    public String purchaseMessage(){
        return driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
    }

    public WebElement totalText(){
        return  driver.findElement(By.xpath("//*[@id=\"totalm\"]"));
    }


}
