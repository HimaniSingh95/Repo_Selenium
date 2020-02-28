package test_scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.FacebookTest;
import page_objects.LandingPage;
import page_objects.LoginPage;

public class VerifyInvalidLogin extends DriverWrapper {

    @Test
    public void verifyInvalidLogin() {
        FacebookTest FacebookTest = new FacebookTest();

        FacebookTest.enterFirstName("test");
        FacebookTest.enterLastName("test");
        FacebookTest.enterNumber("8883338888");
        FacebookTest.enterPassword("test");
        //acebookTest.clickSignUp();
        //Assert.assertEquals("Please choose a gender. You can change who can see this later.", loginPage.getErrorMessage() );

//        LandingPage landingPage = new LandingPage();
//        LoginPage loginPage = new LoginPage();
//
//        landingPage.enterEmail("mohammad@technosoft.io");
//        landingPage.enterPassword("test12345");
//        landingPage.clickLoginButton();
//        //Assertion
//        Assert.assertEquals("Recover your account", loginPage.getErrorMessage());
    }
}
