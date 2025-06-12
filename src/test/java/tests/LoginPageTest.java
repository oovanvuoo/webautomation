package tests;

import java.net.MalformedURLException;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

import base.BaseTest;
import elements.WebItemsMgr;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {
    private LoginPage loginPage;
  
    @Before
    public void setUp() throws MalformedURLException {
        super.setup();
        loginPage = new LoginPage(driver, APPLY_ENV_URL);
    }

    @Test
    public void TestOpenScrollLoginPage() {
        loginPage.openLoginPage();
        // loginPage.scrollDown();
        Assert.assertTrue(loginPage.scrollDownToElement(WebItemsMgr.LOGIN_BUTTON_REGISTER));
  
    }

    @Test
    public void TestOpenLoginPage() {
        loginPage.openLoginPage();
    }


    // @Test
    // public void testLoginWithValidCredentials() {
    //     loginPage.open();
    //     loginPage.login("validUser", "validPassword");
    //     assertTrue(loginPage.isLoginSuccessful());
    // }

    // @Test
    // public void testLoginWithInvalidCredentials() {
    //     loginPage.open();
    //     loginPage.login("invalidUser", "invalidPassword");
    //     assertFalse(loginPage.isLoginSuccessful());
    // }

    // @Test
    // public void testLoginWithEmptyFields() {
    //     loginPage.open();
    //     loginPage.login("", "");
    //     assertTrue(loginPage.isErrorDisplayed("Username and password cannot be empty"));
    // }
    
}
