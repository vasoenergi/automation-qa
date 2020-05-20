package pages;

import org.openqa.selenium.By;

public class ViewProfile {
    public By viewProfileButton = By.cssSelector("[aria-label='View profile and more']");
    public By signedInAsButton = By.xpath("//div[@class='header-nav-current-user css-truncate']");
    public By settingPageButton = By.cssSelector("[href='/settings/profile']");
}
