package utils.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Check extends BaseAction {
    public Check(WebDriver driver) {
        super(driver);
    }

    public boolean isClickable(String elementCode) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(pathRegistry.getByCSSSelector(elementCode))));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isDisplayed(String elementCode) {
        System.out.println("Checking if element is displayed: " + elementCode);
        System.out.println("Path: " + pathRegistry.getByCSSSelector(elementCode));
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(pathRegistry.getByCSSSelector(elementCode)))).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isEnabled(String elementCode) {
        try {
            return wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(pathRegistry.getByCSSSelector(elementCode)))).isEnabled();
            // return true;
        } catch (Exception e) {
            return false;
        }
    }
}
