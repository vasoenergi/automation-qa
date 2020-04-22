package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsHelper {
    public class ElementsHelper {
        WebDriver driver;

        public ElementsHelper(WebDriver driver) {
            this.driver = driver;
        }

        public boolean isClickable(By locator){
            try{
                WebDriverWait wait = new WebDriverWait(driver, 10);
                wait.until(ExpectedConditions.elementToBeClickable(locator));
                return true;
            } catch (Exception ex){
                return false;
            }
        }
    }
}
