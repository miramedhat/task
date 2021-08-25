package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SelectedProductPage {
    private WebDriver driver;
    public By addToCart = By.cssSelector("[id=add_to_cart] button[type=submit]");
    public By proceedToCheckOt = By.cssSelector("[class=\"button-container\"] a[class=\"btn btn-default button button-medium\"]");

    public SelectedProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public ShoppingCartPage addToCart() throws InterruptedException {
        driver.findElement(addToCart).click();
        String parentWindowHandler = driver.getWindowHandle();
        String subWindowHandler = null;
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()) {
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler);
        driver.findElement(proceedToCheckOt).click();
        return new ShoppingCartPage(driver);
    }
}
