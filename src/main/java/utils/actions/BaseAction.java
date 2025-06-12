package utils.actions;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.Config;
import elements.PathRegistry;

public class BaseAction {
    protected final WebDriverWait wait;
    protected final PathRegistry pathRegistry;

    public BaseAction(WebDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(Config.TIMEOUT_SEC), Duration.ofMillis(Config.POLLING_MILLI_SEC));
        this.pathRegistry = new PathRegistry();
    }
}