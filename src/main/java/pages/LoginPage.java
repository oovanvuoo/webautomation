package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver, String applyEnvUrl) {
        super(driver, applyEnvUrl);
    }

    public void openLoginPage() {
        driver.get(APPLY_ENV_URL);
    }

    public void scrollDown() {
        doAction.scrollDown();
    }

    public boolean scrollDownToElement(String elementCode) {
        try {
            return doAction.scrollDownToElement(elementCode);
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }
}
