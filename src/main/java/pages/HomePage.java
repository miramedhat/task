package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    private WebDriver driver;
    public By womenTab = By.cssSelector("[title=Women]");
    public By blouses = By.cssSelector("[title=Blouses]");
    public By loginBtn = By.cssSelector("[class=login]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public BlousesPage clickBlouses() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(womenTab)).perform();
        driver.findElement(blouses).click();
        return new BlousesPage(driver);
    }

    public AuthenticationPage clickOnSignInBtn() {
        driver.findElement(loginBtn).click();
        return new AuthenticationPage(driver);
    }

}
