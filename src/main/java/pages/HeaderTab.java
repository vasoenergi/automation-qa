package pages;

import org.openqa.selenium.By;

public class HeaderTab {

        public By pullRequestsButton = By.xpath("//a[contains(text(),'Pull requests')]");
        public By issuesYouCreated = By.xpath("//a[contains(text(),'Issues')]");
        public By marketplaceButton = By.cssSelector("[aria-label='Global'] [href='/marketplace']");
        public By exploreButton = By.xpath("//a[contains(.,'Explore')]");

}
