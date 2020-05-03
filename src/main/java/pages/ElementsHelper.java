package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsHelper {

    WebDriver driver;

    public ElementsHelper(WebDriver driver) {
        this.driver = driver;
    }

    public ElementsHelper() {

    }

    public String getTextToClickableElement(By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, (timeout));
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return driver.findElement(element).getText();
        } catch (NoSuchElementException e) {
            throw new RuntimeException("The following element is not found: " + element, e);
        }
    }


    public void clickOnClickableElement (By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, (timeout));

        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            driver.findElement(element).click();
        } catch (NoSuchElementException e) {
            throw new RuntimeException(" The following element is not found: " + element, e);
        }
    }

    public boolean isElementPresent (By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, (timeout));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(element));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }

    }
}
