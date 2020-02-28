package amazonTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

import javax.swing.*;

public class DriverWrapperAmazon {

    private static WebDriver driver;
    private static String url = "https://www.amazon.com/";
   // Actions actions = new Actions(driver);
    @BeforeClass
    public void beforeClass() {
        //setChromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/Singh/Downloads/chromedriver_win32/chromedriver.exe");

        //init webdriver object
        driver = new ChromeDriver();

        //navigate to the url
        driver.navigate().to(url);
    }
//    @AfterClass
//    public void afterClass() {
//        //quit the browser
//        driver.quit();
//    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static String getUrl() {
        return url;
    }
}
