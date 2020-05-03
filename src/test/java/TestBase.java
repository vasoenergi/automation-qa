import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;
import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
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
    String testURL = "https://github.com/login";
    String login = "vasoenergi@gmail.com";
    String pass = "FreeR1de!";

    @BeforeClass
    @Parameters ("browser")
    public void setUp(Browsers browser) {
        switch (browser) {
            case CHROME:
                ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
                driver = new ChromeDriver();
                break;
            case EDGE:
                EdgeDriverManager.getInstance(DriverManagerType.EDGE).setup();
                driver = new EdgeDriver();
                break;
            case IE11:
                InternetExplorerDriverManager.getInstance(DriverManagerType.IEXPLORER).setup();
                driver = new InternetExplorerDriver();
                break;
            case FIREFOX:
                FirefoxDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid specified browser: " + browser + "expected one of 'CHROME','IE11','EDGE','FIREFOX'");
        }

        elementsHelper = new ElementsHelper(driver);
        driver.navigate().to(testURL);
        driver.manage().window().maximize();
        driver.findElement(loginPage.loginInputField).sendKeys (login);
        driver.findElement(loginPage.passwordInputField).sendKeys(pass);
        driver.findElement(loginPage.signInButton).click();
    }

    @AfterClass
    public void tearDown() {
        //if (driver !=null)
        driver.quit();
    }

}

