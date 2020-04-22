package pages;

import org.openqa.selenium.By;

public class SettingPageSelectors {
    {
        public By updateProfileButtonIsDisplayed = By.cssSelector("//button[@class='btn btn-primary')]");
        public By updateContributionsButtonIsDisplayed = By.cssSelector("//button[contains(text(),'Update contributions')]");
        public By saveJobsProfileButtonIsDisplayed = By.cssSelector("//button[contains(text(),'Save jobs profile')]");
        public By saveTrendingSettingIsDisplayed = By.cssSelector("//input[@name='commit')]");
        public By publicProfileTextIsDisplayed = By.xpath("//h2[@id='public-profile-heading')]");
        public By nameTextIsDisplayed = By.ByLinkText("Name");
        public By publicEmailTextIsDisplayed = By.ByLinkText ("Public email");
        public By bioTextIsDisplayed = By.ByLinkText("Bio");
        public By urlTextIsDisplayed = By.ByLinkText("URL");
        public By companyTextIsDisplayed = By.ByLinkText("Company");
        public By locationTextIsDisplayed = By.ByLinkText("Location");
        public By contributionsTextIsDisplayed = By.xpath("//h2[@id='contributions-heading']");
        public By gitHubDeveloperProgramIsDisplayed = By.ByLinkText("GitHub Developer Program'");
    }
}