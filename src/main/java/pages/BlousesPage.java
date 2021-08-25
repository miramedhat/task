package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlousesPage {
    private WebDriver driver;

    public BlousesPage(WebDriver driver) {
        this.driver = driver;
    }

    public By blouse = By.cssSelector("a[class=product_img_link][title=Blouse]");

    public SelectedProductPage selectBlouse() {
        driver.findElement(blouse).click();
        return new SelectedProductPage(driver);
    }
}
