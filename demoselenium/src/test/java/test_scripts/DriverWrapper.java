package test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverWrapper {

    WebElement html ;

    private static WebDriver driver;
    private static String url = "https://www.facebook.com/";

    @BeforeClass
    public void beforeClass() {
        //setChromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/Singh/Downloads/chromedriver_win32/chromedriver.exe");
        //init webdriver object
        driver = new ChromeDriver();
        driver.manage().window().maximize();
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
