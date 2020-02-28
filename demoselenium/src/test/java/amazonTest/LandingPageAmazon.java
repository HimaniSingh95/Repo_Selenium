package amazonTest;

import org.openqa.selenium.By;

public class LandingPageAmazon extends BasePageAmazon {

    private By searchInput = By.id("twotabsearchtextbox");
    private By searchButton = By.className("nav-input");

    public void searchInput(){
        setValue(searchInput,"iphone");
    }

    public void searchButton(){
        clickOn(searchButton);
    }

}
