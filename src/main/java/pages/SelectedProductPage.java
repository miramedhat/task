package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;


import java.util.Iterator;
import java.util.Set;

public class SelectedProductPage {
    private WebDriver driver;
    public By addToCart = By.cssSelector("[id=add_to_cart] button[type=submit]");
    public By proceedToCheckOut = By.cssSelector("[class=\"button-container\"] a[class=\"btn btn-default button button-medium\"]");

    public SelectedProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public ShoppingCartPage addToCart()  {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(addToCart));
       // new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(driver.findElement(addToCart)));
        driver.findElement(addToCart).click();
        String parentWindowHandler = driver.getWindowHandle();
        String subWindowHandler = null;
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()) {
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler);
        driver.findElement(proceedToCheckOut).click();
        return new ShoppingCartPage(driver);
    }
}
