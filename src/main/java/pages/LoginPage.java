package pages;

import org.openqa.selenium.By;

public class LoginPage {
    public By loginPageHeader = By.xpath("//h1[contains(text(),'Sign in to GitHub')]");
    public By textLabel = By.cssSelector("[for='login_field']");
    public By loginInputField = By.cssSelector("[id='login_field']");
    public By passwordInputField = By.cssSelector("[id='password']");
    public By signInButton = By.cssSelector("[value='Sign in']");
    public By downStairs = By.xpath("/html[1]/body[1]/div[1]/header[1]/div[7]/details[1]/summary[1]");
    public By logOut = By.xpath("//button[contains(@class,'dropdown-item dropdown-signout')]");



}
