import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.*;
import helpers.ElementsHelper;
import pages.*;

public class TestBase {
    WebDriver driver;

    ElementsHelper elementsHelper;

    String testURL = "https://github.com/login";
    String login = "vasoenergi@gmail.com";
    String pass = "FreeR1de!";

    @BeforeGroups (groups = {"test_groups"})
    @Parameters ("browser")
    public void setUp(Browsers browser) {
        switch (browser) {
            case CHROME:
                ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
                driver = new ChromeDriver();
            break;

            case OPERA:
                OperaDriverManager.getInstance(DriverManagerType.OPERA).setup();
                driver = new OperaDriver();

            case FIREFOX:
                FirefoxDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid specified browser: " + browser + "expected one of 'CHROME','IE11','OPERA','FIREFOX'");
        }

        elementsHelper = new ElementsHelper(driver);
        driver.navigate().to(testURL);
        driver.manage().window().maximize();

    }

    @AfterGroups (groups = {"test_groups"})
    public void tearDown() {
        if (driver !=null)
        driver.quit();
    }

}

