package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
    public static WebDriver createDriver(String browser) {
        String usingBrowser = (browser == null || browser.isBlank()) ? "chrome" : browser.trim().toLowerCase();
        switch (usingBrowser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                if (Boolean.parseBoolean(System.getProperty("headless", "false"))) {
                    chromeOptions.addArguments("--headless=new", "--no-sandbox", "--disable-gpu", "--disable-dev-shm-usage", "--window-size=1920,1080");
                }
                String extraChromeOptions = System.getProperty("chrome.options");
                if (extraChromeOptions != null) {
                    for (String arg : extraChromeOptions.split(" ")) {
                        chromeOptions.addArguments(arg.trim());
                    }
                }
                return new ChromeDriver(chromeOptions);

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                if (Boolean.parseBoolean(System.getProperty("headless", "false"))) {
                    firefoxOptions.addArguments("--headless");
                }
                String extraFirefoxOptions = System.getProperty("firefox.options");
                if (extraFirefoxOptions != null) {
                    for (String arg : extraFirefoxOptions.split(" ")) {
                        firefoxOptions.addArguments(arg.trim());
                    }
                }
                return new FirefoxDriver(firefoxOptions);

            default:
                throw new IllegalArgumentException("Unsupported browser: " + browser);
        }
    }
}