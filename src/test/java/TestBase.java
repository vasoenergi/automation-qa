import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.ElementsHelper;
import pages.HeaderTab;
import pages.LoginPage;
import pages.SettingPage;

public class TestBase {
    WebDriver driver;

    ElementsHelper elementsHelper = new ElementsHelper();
    HeaderTab headerTab = new HeaderTab();
    LoginPage loginPage = new LoginPage();
    SettingPage settingPage = new SettingPage();
    @BeforeClass
    public void setUp() {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
        elementsHelper = new ElementsHelper(driver);
        driver.navigate().to("https://github.com/login");
        driver.manage().window().maximize();
        driver.findElement(loginPage.loginInputField).sendKeys("vasoenergi@gmail.com");
        driver.findElement(loginPage.passwordInputField).sendKeys("FreeR1de!");
        driver.findElement(loginPage.signInButton).click();
    }

    @AfterClass
    public void tearDown() {
        //if (driver !=null)
            driver.quit();
    }

}

