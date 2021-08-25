package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {
    private WebDriver driver;
    public By proceedToCheckOutBtn = By.cssSelector("[class=\"cart_navigation clearfix\"] [title=\"Proceed to checkout\"]");

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public AddressPage proceedToCheckOut() {
        driver.findElement(proceedToCheckOutBtn).click();
        return new AddressPage(driver);

    }
}
