package pages;

import org.openqa.selenium.WebDriver;

import elements.WebItemsMgr;

public class DashboardPage extends BasePage {

    public DashboardPage(WebDriver driver, String applyEnvUrl) {
        super(driver, applyEnvUrl);
    }

    public void navigateToDashboard() {
        String dashboardUrl = APPLY_ENV_URL + "/dashboard";
        driver.get(dashboardUrl);
    }
    
    public boolean isInDashboard() {
        return check.isDisplayed(WebItemsMgr.DASHBOARD_MENU);
    }
}
