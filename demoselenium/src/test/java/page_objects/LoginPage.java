package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_scripts.DriverWrapper;

public class LoginPage extends DriverWrapper {
    @Test
    public void TestGender(){
        LandingPage landingPage= new LandingPage();

        landingPage.enterFirstName("test");
        landingPage.enterLastName("test");
        landingPage.enterNumber("8883338888");
        landingPage.enterPassword("fjwcbdg");
        landingPage.clickButton();
        landingPage.isGenderSelected();
        landingPage.SelectGender();
        //landingPage.isSelected();

        if(landingPage.isGenderSelected() == false){
            landingPage.SelectGender();
        }
        //Assert.assertEquals();

    }
}
