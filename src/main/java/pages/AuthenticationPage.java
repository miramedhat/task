package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class AuthenticationPage {
    private WebDriver driver;
    public By email = By.id("email");
    public By password = By.id("passwd");
    public By submitLogin = By.id("SubmitLogin");
    public By emailCreate = By.cssSelector("input[id=\"email_create\"]");
    public By createAccountBtn = By.id("SubmitCreate");

    public AuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage login() {

        driver.findElement(email).sendKeys("mira@test.com");
        driver.findElement(password).sendKeys("Mira@123");
        driver.findElement(submitLogin).click();
        return new HomePage(driver);
    }

    public SignUpPage createAccount() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        driver.findElement(emailCreate).sendKeys("miratest" + randomInt + "@gmail.com");
        driver.findElement(createAccountBtn).click();
        return new SignUpPage(driver);
    }
}
