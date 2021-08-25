package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {
    private WebDriver driver;
    public By confirmationBtn = By.cssSelector("[id=cart_navigation] button[type=submit]");
    public By completeOrderMsg = By.className("cheque-indent");

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void confirmMyOrder() {
        driver.findElement(confirmationBtn).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(completeOrderMsg).getText();
    }
}
