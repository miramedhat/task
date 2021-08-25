package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver ");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get("http://automationpractice.com/index.php");
        //driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(1024, 768));

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
