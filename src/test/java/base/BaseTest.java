package base;

import org.openqa.selenium.WebDriver;
import utils.DriverFactory;
import java.net.MalformedURLException;
import org.testng.annotations.*;

import config.Config;

public class BaseTest {
    protected WebDriver driver;
    protected String APPLY_ENV_URL = "";

    @BeforeClass
    public void setup() throws MalformedURLException {
        String browser = System.getProperty("browser", "chrome");
        this.driver = DriverFactory.createDriver(browser);
        // this.driver = DriverFactory.createDriver(WebItemsMgr.CHROME_DRIVER);

        // Read environment from system property, default to "dev"
        String env = System.getProperty("env", "dev").toUpperCase();
        System.out.println("Running tests in environment: " + env);
        // Set URL based on env
        switch (env) {
            // case "PROD":
            //     this.APPLY_ENV_URL = Config.PROD_URL;
            //     break;
            case "STAGING":
                this.APPLY_ENV_URL = Config.STAGING_URL;
                break;
            case "DEV":
                this.APPLY_ENV_URL = Config.DEV_URL;
                break;
            // case "UAT":
            //     this.APPLY_ENV_URL = Config.UAT;
            //     break;
            case "QA":
            default:
                this.APPLY_ENV_URL = Config.QA_URL;
                break;
        }
    }
}