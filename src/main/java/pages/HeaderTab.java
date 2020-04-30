package pages;

import org.openqa.selenium.By;

public class HeaderTab {

        public By pullRequestsButtonIsDisplayed = By.xpath("//a[contains(text(),'Pull requests')]");
        public By issuesYouCreatedIsDisplayed = By.linkText("Issues");
        public By marketplaceButtonIsDisplayed = By.linkText("Marketplace");
        public By exploreButtonIsDisplayed = By.xpath("//a[contains(.,'Explore')]");


}
