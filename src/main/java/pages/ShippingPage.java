package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage {
    private WebDriver driver;
    public By submitBtn = By.cssSelector("[class=\"cart_navigation clearfix\"] button[type=submit]");
    public By checkBox = By.id("uniform-cgv");

    public ShippingPage(WebDriver driver) {
        this.driver = driver;
    }

    public PaymentPage ProceedToCheckOut() {
        driver.findElement(checkBox).click();
        driver.findElement(submitBtn).click();
        return new PaymentPage(driver);
    }

}
