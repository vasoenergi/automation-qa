import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;

public class TestHelper extends TestBase {
    @BeforeClass
    public void logintosite () {
        driver.navigate().to("https://github.com/login");
        driver.manage().window().fullscreen();
        driver.findElement(loginPage.loginInputField).sendKeys("vasoenergi@gmail.com");
        driver.findElement(loginPage.passwordInputField).sendKeys("FreeR1de!");
        driver.findElement(loginPage.signInButton).click();
    }
    @AfterClass
    public void logoff () {
        driver.findElement(loginPage.downStairs).click();
        driver.findElement(loginPage.logOut).click();
    }
}
