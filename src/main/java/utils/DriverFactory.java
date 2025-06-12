package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public static WebDriver createDriver(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                if (Boolean.parseBoolean(System.getProperty("headless", "false"))) {
                    options.addArguments("--headless=new", "--no-sandbox", "--disable-gpu", "--window-size=1920,1080");
                }
                // Add extra chrome options if provided
                String chromeOptions = System.getProperty("chrome.options");
                if (chromeOptions != null) {
                    for (String arg : chromeOptions.split(" ")) {
                        options.addArguments(arg.trim());
                    }
                }
                return new ChromeDriver(options);
            case "firefox":
                return new FirefoxDriver();
            default:
                throw new IllegalArgumentException("Unsupported browser: " + browser);
        }
    }
}