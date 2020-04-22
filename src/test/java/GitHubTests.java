import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HeaderPageSelectors;
import pages.LoginPageSelectors;

public class GitHubTests {
    WebDriver driver;
    LoginPageSelectors LoginPageSelectors = new LoginPageSelectors();

    @Test(priority = 1)
    public void logInPageTest() {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://github.com/login");
        driver.manage().window().maximize();
        Assert.assertEquals(driver.findElement(LoginPageSelectors.loginPageHeader).getText(), "Sign in to GitHub");
        Assert.assertEquals(driver.findElement(LoginPageSelectors.textLabel).getText(),"Username or email address");
        driver.findElement(LoginPageSelectors.loginInputField).sendKeys("vasoenergi@gmail.com");
        driver.findElement(LoginPageSelectors.passwordInputField).sendKeys("FreeR1de!");
        driver.findElement(LoginPageSelectors.signInButton).click();

    }

    @Test(priority = 2)
    public void HeaderPage () {

        boolean isPullRequestsPresent = driver.findElement(headerTabLocators.pullRequests).isDisplayed();
        Assert.assertTrue(isPullRequestsPresent);
        boolean isPullRequestsClickable = elementsHelper.isClickable(headerTabLocators.pullRequests);
        Assert.assertTrue(isPullRequestsClickable);

        boolean isIssuesPresent = driver.findElement(HeaderPageSelectors.).isDisplayed();
        Assert.assertTrue(isIssuesPresent);
        boolean isIssuesClickable = elementsHelper.isClickable(headerTabLocators.issues);
        Assert.assertTrue(isIssuesClickable);

        boolean isMarketplacePresent = driver.findElement(headerTabLocators.marketplace).isDisplayed();
        Assert.assertTrue(isMarketplacePresent);
        boolean isMarketplaceClickable = elementsHelper.isClickable(headerTabLocators.marketplace);
        Assert.assertTrue(isMarketplaceClickable);

        boolean isExplorePresent = driver.findElement(headerTabLocators.explore).isDisplayed();
        Assert.assertTrue(isExplorePresent);
        boolean isExploreClickable = elementsHelpers.isClickable(headerTabLocators.explore);
        Assert.assertTrue(isExploreClickable);
    }
        @Test(priority = 3)
        public void SettingPageTest() {
            driver.navigate().to("https://github.com/settings/profile");

        } }