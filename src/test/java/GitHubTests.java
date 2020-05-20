import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class GitHubTests extends TestBase {
    HeaderTab headerTab = new HeaderTab();
    LoginPage loginPage = new LoginPage();
    SettingPage settingPage = new SettingPage();
    LogInAndLogOut logInAndOut = new LogInAndLogOut();
    ViewProfile viewProfile = new ViewProfile();

    @Test (priority = 1,groups = "test_groups" )
    public void login (){
        driver.findElement(loginPage.loginInputField).sendKeys (login);
        driver.findElement(loginPage.passwordInputField).sendKeys(pass);
        driver.findElement(loginPage.signInButton).click();
    }

    @Test(priority = 2, groups = "test_groups")
    public void headersTest() {
        Assert.assertEquals(elementsHelper.getToClickableElement(headerTab.pullRequestsButton, 5),"Pull requests");
        Assert.assertEquals(elementsHelper.getToClickableElement(headerTab.issuesYouCreated,5),"Issues");
        Assert.assertEquals(elementsHelper.getToClickableElement(headerTab.marketplaceButton,5),"Marketplace");
        Assert.assertEquals(elementsHelper.getToClickableElement(headerTab.exploreButton,5),"Explore");

    }

    @Test (priority = 3,groups = "test_groups")
    public void SettingPageTest () {
        elementsHelper.clickOnClickableElement(viewProfile.viewProfileButton,5);
        Assert.assertTrue(elementsHelper.isElementPresent(viewProfile.signedInAsButton, 2));
        elementsHelper.clickOnClickableElement(viewProfile.settingPageButton,2);
        Assert.assertEquals(elementsHelper.getToClickableElement(settingPage.updateProfileButton,5),"Update profile");
        Assert.assertEquals(elementsHelper.getToClickableElement(settingPage.updateContributionsButton, 5),"Update contributions");
        Assert.assertEquals(elementsHelper.getToClickableElement(settingPage.saveJobsProfileButton,5),"Save jobs profile");
        Assert.assertEquals(driver.findElement(settingPage.profilePictureText).getText(),"Profile picture");
        Assert.assertEquals(driver.findElement(settingPage.publicProfileText).getText(),"Public profile");
        Assert.assertEquals(driver.findElement(settingPage.nameText).getText(),"Name");
        Assert.assertEquals(driver.findElement(settingPage.publicEmailText).getText(),"Public email");
        Assert.assertEquals(driver.findElement(settingPage.bioText).getText(),"Bio");
        Assert.assertEquals(driver.findElement(settingPage.urlText).getText(),"URL");
        Assert.assertEquals(driver.findElement(settingPage.companyText).getText(),"Company");
        Assert.assertEquals(driver.findElement(settingPage.locationText).getText(),"Location");
        Assert.assertEquals(driver.findElement(settingPage.gitHubDeveloperProgram).getText(),"GitHub Developer Program");

    }

}



