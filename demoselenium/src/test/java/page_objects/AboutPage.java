package page_objects;

import org.openqa.selenium.By;

public class AboutPage extends BasePage {

    private By createPage = By.xpath("//button[text()='Create a Page']");
    private By logInText = By.className("dialog_body");

    public void createPage() throws InterruptedException {
        Thread.sleep(3000);
        clickOn(createPage);
    }

     public String verifyLogin(){
       return getValueFromElement(logInText);
     }

}
