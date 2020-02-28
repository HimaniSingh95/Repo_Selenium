package page_objects;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_scripts.DriverWrapper;

public class FacebookForm extends DriverWrapper {
    @Test
    public void FacebookForm() {

        FacebookTest FacebookTest = new FacebookTest();

        FacebookTest.enterFirstName("test");
        FacebookTest.enterLastName("test");
        FacebookTest.enterNumber("8883338888");
        FacebookTest.enterPassword("test");
        //FacebookTest.clickSignUp();
       // FacebookTest.ErrorMessage("Please choose a gender. You can change who can see this later.");

//        String actualMessage = DriverWrapper.getDriver().findElement(By.xpath("//div[@class='uiContextualLayer uiContextualLayerLeft'].")).getText();
//        String expectedMessage = "Please choose a gender. You can change who can see this later.";
//        Assert.assertEquals(actualMessage, expectedMessage);
//        System.out.println("Error verified.");



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
