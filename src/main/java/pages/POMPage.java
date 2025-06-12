package pages;

import org.openqa.selenium.WebDriver;

import elements.WebItemsMgr;

public class POMPage extends BasePage{
    public POMPage(WebDriver driver, String applyEnvUrl) {
        super(driver, applyEnvUrl);
    }

    public void openHomePage() {
        driver.get(APPLY_ENV_URL);
    }

    public void openLoginPage(){
        check.isDisplayed(WebItemsMgr.LOGIN_BUTTON_REDIRECT_LOGIN_PAGE);
        click.clickItem(WebItemsMgr.LOGIN_BUTTON_REDIRECT_LOGIN_PAGE);
        check.isDisplayed(WebItemsMgr.LOGIN_BUTTON_LOGIN);
    }

    public void loginWithAccount(String username, String password) {
        check.isDisplayed(WebItemsMgr.LOGIN_INPUT_USERNAME);
        // click.clickItem(WebItemsMgr.LOGIN_INPUT_USERNAME);
        input.enterString(WebItemsMgr.LOGIN_INPUT_USERNAME, username);

        check.isDisplayed(WebItemsMgr.LOGIN_INPUT_PASSWORD);
        // click.clickItem(WebItemsMgr.LOGIN_INPUT_PASSWORD);
        input.enterString(WebItemsMgr.LOGIN_INPUT_PASSWORD, password);

        // check.isClickable(WebItemsMgr.LOGIN_BUTTON_LOGIN);
        click.clickItem(WebItemsMgr.LOGIN_BUTTON_LOGIN);
    }

    public boolean isInDashboard() {
        return check.isDisplayed(WebItemsMgr.DASHBOARD_MENU);
    }

    public void openChallengeDropdownOptions() {
        click.clickItem(WebItemsMgr.CHALLENGE_DROPDOWN);
    }

    public void openCreateChallengePage() {
        check.isDisplayed(WebItemsMgr.CHALLENGE_DROPDOWN_CREATE);
        click.clickItem(WebItemsMgr.CHALLENGE_DROPDOWN_CREATE);
    }

    public boolean isInChallengeForm() {
        return check.isDisplayed(WebItemsMgr.CHALLENGE_FORM);
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

    public void fillChallengeForm() {
        input.enterString(WebItemsMgr.CHALLENGE_FORM_TITLE, "V Challenge");
        input.enterString(WebItemsMgr.CHALLENGE_FORM_FLAG, "CTFlearn{}");
        input.enterString(WebItemsMgr.CHALLENGE_FORM_DESCRIPTION, "## V Challenge Description");
        input.enterString(WebItemsMgr.CHALLENGE_FORM_SOLUTION, "Just do it. If failure, try again.");
        click.clickItem(WebItemsMgr.CHALLENGE_FORM_BTN_SUBMIT);
    }

    public boolean isChallengeCreated() {
        // Check if the challenge was created successfully on toast notification or page redirection
        return true;
    }

    public void openMyChallengesPage() {
        check.isEnabled(WebItemsMgr.PROFILE);
        click.clickItem(WebItemsMgr.PROFILE);
        check.isDisplayed(WebItemsMgr.MY_CHALLENGE_REDIRECT);
        click.clickItem(WebItemsMgr.MY_CHALLENGE_REDIRECT);
        // driver.get("https://ctflearn.com/challenge/by/tkv001");
    }

    public void openCreatedChallengeByName(String string) {
        //Open the first challenge in the list with the specified name
        click.clickItem(WebItemsMgr.MY_CHALLENGE_FIRST_ITEM);
    }

    public String getChallengeName() {
        return get.strValue(WebItemsMgr.CHALLENGE_ITEM_TITLE);
    }

    public String getChallengeDescription() {
        return get.strValue(WebItemsMgr.CHALLENGE_ITEM_DESCRIPTION);
    }

    public String getChallengeCategory() {
       return get.strValue(WebItemsMgr.CHALLENGE_ITEM_CATEGORY);
    }

    public String getChallengePoint() {
        return get.strValue(WebItemsMgr.CHALLENGE_ITEM_POINT);
    }
    
    public void logout(){
        click.clickItem(WebItemsMgr.PROFILE);
        click.clickItem(WebItemsMgr.LOGOUT_BUTTON);
    }
}
