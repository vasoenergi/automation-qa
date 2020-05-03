package pages;

import org.openqa.selenium.By;

public class SettingPage {

        public By publicProfileText = By.xpath("//h2[@id='public-profile-heading']");
        public By nameText = By.cssSelector("[for='user_profile_name']");
        public By publicEmailText = By.cssSelector("[for ='user_profile_email']");
        public By bioText = By.cssSelector("[for='user_profile_bio']");
        public By urlText = By.cssSelector("[for='user_profile_blog']");
        public By companyText =By.cssSelector("[for='user_profile_company']");
        public By locationText = By.cssSelector("[for ='user_profile_location']");
        public By contributionsText = By.xpath("//h2[@id='contributions-heading']");
        public By gitHubDeveloperProgram = By.xpath("//h2[contains(text(),'GitHub Developer Program')]");
        public By updateProfileButton = By.xpath("//button[@class='btn btn-primary']");
        public By updateContributionsButton = By.xpath("//button[contains(text(),'Update contributions')]");
        public By saveJobsProfileButton = By.xpath("//button[contains(text(),'Save jobs profile')]");
        public By profilePictureText = By.xpath("//label[@class='d-block mb-2']");
        public By viewProfileButton = By.cssSelector("[aria-label='View profile and more']");
        public By signedInAsButton = By.xpath("//div[@class='header-nav-current-user css-truncate']");
        public By settingPageButton = By.cssSelector("[href='/settings/profile']");

}