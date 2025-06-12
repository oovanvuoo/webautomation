package tests;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import elements.testdata.Account;
import pages.POMPage;

public class LoginPageTest extends BaseTest {
    private POMPage pomPage;
  
    @BeforeClass
    public void setUp() throws MalformedURLException {
        super.setup();
        pomPage = new POMPage(driver, APPLY_ENV_URL);
    }

    @Test
    public void TestCreateChallenge() {
        pomPage.openHomePage();
        pomPage.openLoginPage();
        pomPage.loginWithAccount(Account.Acc1.username, Account.Acc1.password);
        Assert.assertTrue(pomPage.isInDashboard(), "Login failed or not redirected to dashboard");
        // pomPage.openChallengeDropdownOptions();
        // pomPage.openCreateChallengePage();
        // Assert.assertTrue(pomPage.isInChallengeForm(), "Not in challenge form after opening create challenge page");
        // pomPage.fillChallengeForm();
        // Assert.assertTrue(pomPage.isChallengeCreated(), "Challenge was not created successfully");
        pomPage.openMyChallengesPage();
        pomPage.openCreatedChallengeByName("V Challenge");
        Assert.assertEquals(pomPage.getChallengeName(), "V Challenge", "Challenge name does not match");
        // Assert.assertEquals(pomPage.getChallengeDescription(), "## V Challenge Description", "Challenge description does not match");
        Assert.assertEquals(pomPage.getChallengeCategory(), "Web");
        Assert.assertEquals(pomPage.getChallengePoint(), "10", "Challenge difficulty does not match");
        pomPage.logout();
    }   

}
