package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
    private WebDriver driver;
    public By bankWirePaymentMethod = By.className("bankwire");

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public ConfirmationPage selectPaymentMethod() {
        driver.findElement(bankWirePaymentMethod).click();
        return new ConfirmationPage(driver);
    }

}
