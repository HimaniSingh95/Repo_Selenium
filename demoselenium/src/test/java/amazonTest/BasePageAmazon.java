package amazonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import test_scripts.DriverWrapper;

public class BasePageAmazon {
    private static Actions action;

    public void clickOn(By locator) {
        DriverWrapper.getDriver().findElement(locator).click();
    }

    public void setValue(By locator, String value) {
        DriverWrapper.getDriver().findElement(locator).sendKeys(value);
    }

    public String getValueFromElement(By locator) {
        return DriverWrapper.getDriver().findElement(locator).getText();
    }

    public void mouseHover(By locator){
        action = new Actions(DriverWrapper.getDriver());
        action.moveToElement((WebElement) locator).perform();
    }

    public boolean isElementDisplayed(By locator){
        boolean isDisplayed;
        try{
            isDisplayed = DriverWrapper.getDriver().findElement(locator).isDisplayed();
        } catch(NoSuchElementException e){
            isDisplayed = false;
        }
        return isDisplayed;
    }

    public boolean isElementSelected(By locator){
        return DriverWrapper.getDriver().findElement(locator).isSelected();
    }

//    public boolean isElementEnabled(By locator){
//
//    }
}
