package page_objects;
import org.openqa.selenium.By;
import org.testng.Assert;

public class FacebookTest extends BasePage {

    private By firstName = By.name("firstname");
    private By lastName = By.name("lastname");
    private By number = By.name("reg_email__");
    private By password = By.name("reg_passwd__");
    private By submit = By.name("websubmit");
    private By error = By.className("_5633 _5634 _53ij");

    public void enterFirstName(String value){
        setValue(firstName,value );
    }

    public void enterLastName(String value){
        setValue(lastName, value);
    }

    public void enterNumber(String value){
        setValue(number, value);
    }

    public void enterPassword(String value){
        setValue(password, value);
    }

    public void testLoginButton(){
        LandingPage landingPage = new LandingPage();
       // Assert.assertTrue(landingPage.isLoginButtonDisplayed(), "Custom message.");
    }

//    public void clickSignUp(){
//        clickOn(submit);
//    }
//
//    public String ErrorMessage(String value){
//        return getValueFromElement(error);
//    }

}
