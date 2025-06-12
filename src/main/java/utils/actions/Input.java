package utils.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Input extends BaseAction {

    public Input(WebDriver driver) {
        super(driver);
    }
    
    public boolean enterString(String elementCode, String value){
        try {
            WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathRegistry.getByCSSSelector(elementCode))));
            ele.click();
            ele.clear();
            ele.sendKeys(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
