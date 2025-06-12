package base;

import org.openqa.selenium.WebDriver;
import elements.WebItemsMgr;
import utils.DriverFactory;
import java.net.MalformedURLException;
import org.testng.annotations.*;

import config.Config;

public class BaseTest {
    protected WebDriver driver;
    protected String APPLY_ENV_URL = "";

    @BeforeClass
    public void setup() throws MalformedURLException {
        this.driver = DriverFactory.createDriver(WebItemsMgr.CHROME_DRIVER);
        this.APPLY_ENV_URL = Config.DEV_URL;
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    @AfterSuite
    public void tearDownSuite() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    @AfterMethod
    public void tearDownMethod() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
}
}
