import org.testng.Assert;
import org.testng.annotations.Test;

public class GitHubTests extends TestBase {

    @Test(priority = 1)
    public void HeadersTest() {
        Assert.assertEquals(elementsHelper.getTextToClickableElement(headerTab.pullRequestsButtonIsDisplayed, 5),"Pull requests");
        Assert.assertEquals(elementsHelper.getTextToClickableElement(headerTab.issuesYouCreatedIsDisplayed,5),"Issues");
        Assert.assertEquals(elementsHelper.getTextToClickableElement(headerTab.marketplaceButtonIsDisplayed,5),"Marketplace");
        Assert.assertEquals(elementsHelper.getTextToClickableElement(headerTab.exploreButtonIsDisplayed,5),"Explore");

    }

    @Test (priority = 2)
    public void SettingPageTest () {
        elementsHelper.clickOnClickableElement(settingPage.viewProfileButton,5);
        Assert.assertTrue(elementsHelper.isElementPresent(settingPage.signedInAsButton, 2));
        elementsHelper.clickOnClickableElement(settingPage.settingPageButton,2);
        Assert.assertEquals(elementsHelper.getTextToClickableElement(settingPage.updateProfileButton,5),"Update profile");
        Assert.assertEquals(elementsHelper.getTextToClickableElement(settingPage.updateContributionsButton, 5),"Update contributions");
        Assert.assertEquals(elementsHelper.getTextToClickableElement(settingPage.saveJobsProfileButton,5),"Save jobs profile");
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



