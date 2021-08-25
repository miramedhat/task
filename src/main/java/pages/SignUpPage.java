package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
    private WebDriver driver;
    public By maleGender = By.id("uniform-id_gender1");
    public By firstName = By.id("customer_firstname");
    public By lastName = By.id("customer_lastname");
    public By password = By.id("passwd");
    public By birthDay = By.id("days");
    public By birthMonth = By.id("months");
    public By birthYear = By.id("years");
    public By addressFName = By.id("firstname");
    public By addressLName = By.id("lastname");
    public By address = By.id("address1");
    public By city = By.id("city");
    public By state = By.id("id_state");
    public By postcode = By.id("postcode");
    public By mobilePhone = By.id("phone_mobile");
    public By submitBtn = By.id("submitAccount");

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFromDropDown(String value) {
        Select select = new Select(driver.findElement(state));
        select.selectByVisibleText(value);
    }

    public HomePage fillSignUpFields(String fName, String lName, String pwd, String addressDetails, String cityName,
                                     String stateName, String postCode, String phone) {
        driver.findElement(maleGender).click();
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(address).sendKeys(addressDetails);
        driver.findElement(city).sendKeys(cityName);
        selectFromDropDown(stateName);
        driver.findElement(postcode).sendKeys(postCode);
        driver.findElement(mobilePhone).sendKeys(phone);
        driver.findElement(submitBtn).click();

        return new HomePage(driver);
    }

}
