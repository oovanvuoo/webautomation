package utils.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Do extends BaseAction {

    public Do(WebDriver driver) {
        super(driver);
    }

    public void clear(String elementCode) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathRegistry.getPath(elementCode)))).clear();
    }
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) wait.until(d -> d);
        js.executeScript("window.scrollBy(0, window.innerHeight);");
    }

    public void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) wait.until(d -> d);
        js.executeScript("window.scrollBy(0, -window.innerHeight);");
    }

    public void rightClick(String elementCode) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathRegistry.getPath(elementCode))));
        Actions actions = new Actions(wait.until(d -> d));
        actions.contextClick(element).perform();
    }

    public boolean scrollDownToElement(String elementCode) {
        String xpath = pathRegistry.getPath(elementCode);
        JavascriptExecutor js = (JavascriptExecutor) wait.until(d -> d);
        int maxScrolls = 20; // Prevent infinite loop
        int scrollCount = 0;
        long lastHeight = (long) js.executeScript("return document.body.scrollHeight");

        while (scrollCount < maxScrolls) {
            try {
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
                if (element.isDisplayed()) {
                    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
                    return true;
                }
            } catch (Exception ignored) {}

            js.executeScript("window.scrollBy(0, window.innerHeight);");
            scrollCount++;

            // Check if we've reached the bottom
            long newHeight = (long) js.executeScript("return window.scrollY + window.innerHeight");
            long totalHeight = (long) js.executeScript("return document.body.scrollHeight");
            if (newHeight >= totalHeight) {
                break;
            }
        }
        return false;
    }

    public boolean scrollUpToElement(String elementCode) {
        String xpath = pathRegistry.getPath(elementCode);
        JavascriptExecutor js = (JavascriptExecutor) wait.until(d -> d);
        int maxScrolls = 20; // Prevent infinite loop
        int scrollCount = 0;

        while (scrollCount < maxScrolls) {
            try {
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
                if (element.isDisplayed()) {
                    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
                    return true;
                }
            } catch (Exception ignored) {}

            js.executeScript("window.scrollBy(0, -window.innerHeight);");
            scrollCount++;

            // Check if we've reached the top
            long scrollY = ((Number) js.executeScript("return window.scrollY;")).longValue();
            if (scrollY <= 0) {
                break;
            }
        }
        return false;
    }
}
