package utils.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Get extends BaseAction {
    public Get(WebDriver driver){
        super(driver);
    }

    public String strValue(String elementCode){
        return elementCode.trim().isBlank() ? "" : wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathRegistry.getByCSSSelector(elementCode)))).getText();
    }
}
