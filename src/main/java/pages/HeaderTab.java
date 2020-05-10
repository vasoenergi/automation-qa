package pages;

import org.openqa.selenium.By;

public class HeaderTab {

        public By pullRequestsButton = By.xpath("//a[contains(text(),'Pull requests')]");
        public By issuesYouCreated = By.linkText("Issues");
        public By marketplaceButton = By.linkText("Marketplace");
        public By exploreButton = By.xpath("//a[contains(.,'Explore')]");

}
