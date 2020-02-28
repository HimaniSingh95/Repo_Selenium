package page_objects;

import org.openqa.selenium.By;

public class LandingPage extends BasePage {

    //      LOCATORS

    private By firstName = By.name("firstname");
    private By lastName = By.name("lastname");
    private By number = By.name("reg_email__");
    private By password = By.name("reg_passwd__");
    private By submit = By.name("websubmit");
    private By selected = By.id("u_0_6");
    private By gender = By.id("u_0_6");

    //      METHODS

    public void enterFirstName(String value){
        setValue(firstName, value);
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

    public void clickButton(){
        clickOn(submit);
    }

    public boolean isGenderSelected(){
        return isElementSelected(selected);
    }

    public void SelectGender(){
        clickOn(gender);
    }


}
