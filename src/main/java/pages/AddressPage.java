package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPage {
    private WebDriver driver;
    public By submitBtn = By.cssSelector("[class=\"cart_navigation clearfix\"] button[type=submit]");

    public AddressPage(WebDriver driver) {
        this.driver = driver;
    }

    public ShippingPage proceedToCheckOut() {
        driver.findElement(submitBtn).click();
        return new ShippingPage(driver);
    }
}
