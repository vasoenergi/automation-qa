package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementsHelper {

    WebDriver driver;

    public ElementsHelper(WebDriver driver) {
        this.driver = driver;
    }

    public ElementsHelper() {

    }

    public String getTextToClickableElement(By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver,(timeout));
try {
    wait.until(ExpectedConditions.elementToBeClickable(element));
    return driver.findElement(element).getText();
}
    catch (NoSuchElementException e) {
    throw new RuntimeException("The following element is not found: " + element, e);

}
    }

}
