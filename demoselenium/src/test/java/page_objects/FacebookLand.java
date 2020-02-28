package page_objects;

import org.openqa.selenium.By;

public class FacebookLand extends BasePage {

    private By about = By.xpath("//a[contains(text(),'About')]");

    public void clickAbout(){
        clickOn(about);
    }
}
