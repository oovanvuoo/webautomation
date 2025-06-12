package tests;

import java.net.MalformedURLException;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

import base.BaseTest;
import elements.testdata.Account;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {
    private LoginPage loginPage;
  
    @Before
    public void setUp() throws MalformedURLException {
        super.setup();
        loginPage = new LoginPage(driver, APPLY_ENV_URL);
    }

    @Test
    public void TestCreateChallenge() {
        loginPage.openHomePage();
        loginPage.openLoginPage();
        loginPage.loginWithAccount(Account.Acc1.username, Account.Acc1.password);
        Assert.assertTrue(loginPage.isInDashboard(), "Login failed or not redirected to dashboard");
        // loginPage.openChallengeDropdownOptions();
        // loginPage.openCreateChallengePage();
        // Assert.assertTrue(loginPage.isInChallengeForm(), "Not in challenge form after opening create challenge page");
        // loginPage.fillChallengeForm();
        // Assert.assertTrue(loginPage.isChallengeCreated(), "Challenge was not created successfully");
        loginPage.openMyChallengesPage();
        loginPage.openCreatedChallengeByName("V Challenge");
        Assert.assertEquals(loginPage.getChallengeName(), "V Challenge", "Challenge name does not match");
        // Assert.assertEquals(loginPage.getChallengeDescription(), "## V Challenge Description", "Challenge description does not match");
        Assert.assertEquals(loginPage.getChallengeCategory(), "Web");
        Assert.assertEquals(loginPage.getChallengePoint(), "10", "Challenge difficulty does not match");
        loginPage.logout();
    }   

}
