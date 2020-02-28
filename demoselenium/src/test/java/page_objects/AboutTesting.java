package page_objects;

import org.testng.Assert;
import org.testng.annotations.Test;
import test_scripts.DriverWrapper;
import org.openqa.selenium.Keys;

public class AboutTesting extends DriverWrapper {

    @Test
    public void Testing() throws InterruptedException {

    FacebookLand facebookLand = new FacebookLand();
    AboutPage aboutPage = new AboutPage();
    String expectedMessage = "Please log in to continue.";

    facebookLand.clickAbout();
    Thread.sleep(3000);

    aboutPage.createPage();

    Assert.assertEquals((aboutPage.verifyLogin()), expectedMessage);

    }

}
