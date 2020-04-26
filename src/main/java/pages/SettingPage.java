package pages;

import org.openqa.selenium.By;

public class SettingPage {

        public By updateProfileButtonIsDisplayed = By.linkText("Update profile");
        public By updateContributionsButtonIsDisplayed = By.linkText("Update contributions");
        public By saveJobsProfileButtonIsDisplayed = By.linkText("Save jobs profile");
        public By saveTrendingSettingButtonIsDisplayed = By.linkText("Save Trending settings");
        public By publicProfileTextIsDisplayed = By.linkText("Public profile");
        public By nameTextIsDisplayed = new By.ByLinkText("Name");
        public By publicEmailTextIsDisplayed = new By.ByLinkText("Public email");
        public By bioTextIsDisplayed = new By.ByLinkText("Bio");
        public By urlTextIsDisplayed = new By.ByLinkText("URL");
        public By companyTextIsDisplayed = new By.ByLinkText("Company");
        public By locationTextIsDisplayed = new By.ByLinkText("Location");
        public By contributionsTextIsDisplayed = By.xpath("//h2[@id='contributions-heading']");
        public By gitHubDeveloperProgramIsDisplayed = new By.ByLinkText("GitHub Developer Program'");

}