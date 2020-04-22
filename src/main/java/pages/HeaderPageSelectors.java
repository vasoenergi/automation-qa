package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HeaderPageSelectors {
    {
        public By pullRequestsButtonIsDisplayed = By.cssSelector("//headerTabs.headerTabPullRequests')]");
        public By issuesYouCreatedIsDisplayed = By.cssSelector("pullRequestsButton should be displayed']");
        public By marketplaceButtonIsDisplayed = By.cssSelector("[headerTabs.headerTabIssues']");
        public By exploreButtonIsDisplayed = By.cssSelector("[headerTabs.headerTabMarketplace']");
    }
}
