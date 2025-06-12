package utils.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Click extends BaseAction {

    public Click(WebDriver driver) {
        super(driver);
    }

    public void clickItem(String elementCode){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathRegistry.getPath(elementCode)))).click();
    }

    public boolean isClickable(String elementCode) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(pathRegistry.getPath(elementCode))));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
