import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.ElementsHelper;
import pages.HeaderTab;
import pages.LoginPage;
import pages.SettingPage;

import static org.testng.Assert.assertEquals;

public class GitHubTests extends TestHelper {

    @Test(priority = 1)
    public void HeadersTest() {
        Assert.assertEquals(elementsHelper.getTextToClickableElement(headerTab.pullRequestsButtonIsDisplayed, 5),"Pull requests");

        Assert.assertEquals(elementsHelper.getTextToClickableElement(headerTab.issuesYouCreatedIsDisplayed,5),"Issues");

        Assert.assertEquals(elementsHelper.getTextToClickableElement(headerTab.marketplaceButtonIsDisplayed,5),"Marketplace");
        Assert.assertEquals(elementsHelper.getTextToClickableElement(headerTab.exploreButtonIsDisplayed,5),"Explore");

    }

    @Test (priority = 2)
    public void SettingPageTest () {
        driver.get("https://github.com/settings/profile");
        Assert.assertEquals(elementsHelper.getTextToClickableElement(settingPage.updateProfileButtonIsDisplayed,5),"Update profile");
        Assert.assertEquals(elementsHelper.getTextToClickableElement(settingPage.updateContributionsButtonIsDisplayed),"Update contributions");
        Assert.assertEquals(elementsHelper.getTextToClickableElement(settingPage.saveJobsProfileButtonIsDisplayed,5),"Save jobs profile");
        Assert.assertEquals(elementsHelper.getTextToClickableElement(settingPage.saveTrendingSettingButtonIsDisplayed,5),"Save Trending settings");
        Assert.assertEquals(driver.findElement(settingPage.publicProfileTextIsDisplayed).getText(),"Public profile");
        Assert.assertEquals(driver.findElement(settingPage.nameTextIsDisplayed).getText(),"Name");
        Assert.assertEquals(driver.findElement(settingPage.publicEmailTextIsDisplayed).getText(),"Public email");
        Assert.assertEquals(driver.findElement(settingPage.bioTextIsDisplayed).getText(),"Bio");
        Assert.assertEquals(driver.findElement(settingPage.urlTextIsDisplayed).getText(),"URL");
        Assert.assertEquals(driver.findElement(settingPage.companyTextIsDisplayed).getText(),"Company");
        Assert.assertEquals(driver.findElement(settingPage.locationTextIsDisplayed).getText(),"Location");
        Assert.assertEquals(driver.findElement(settingPage.gitHubDeveloperProgramIsDisplayed).getText(),"GitHub Developer Program");
    }


}








