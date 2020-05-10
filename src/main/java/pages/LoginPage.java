package pages;

import org.openqa.selenium.By;

public class LoginPage {

    public By loginPageHeader = By.xpath("//h1[contains(text(),'Sign in to GitHub')]");
    public By textLabel = By.cssSelector("[for='login_field']");
    public By loginInputField = By.cssSelector("[id='login_field']");
    public By passwordInputField = By.cssSelector("[id='password']");
    public By signInButton = By.cssSelector("[value='Sign in']");

}
