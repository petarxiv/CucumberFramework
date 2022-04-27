package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CommonMethods {

    public static WebDriver driver;

    public void openBrowserAndLunchApplication(){
        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        switch (ConfigReader.getPropertyValue("browser")){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid browser name");
        }
        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
    }
    public static void sendText(WebElement element, String textToSend){
        element.clear();
        element.sendKeys(textToSend);

    }
    public static WebDriverWait getWait(){
        WebDriverWait wait=new WebDriverWait(driver,Constants.EXPLICIT_WAIT);
        return wait;
    }
    public static void waitForClickability(WebElement element){
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void click(WebElement element){
        waitForClickability(element);
        element.click();
    }
public static JavascriptExecutor getJSExecutor(){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        return js;
}
public static void jsClick(WebElement element){
        getJSExecutor().executeScript("arguments[0].click();",element);

}
public static void tearDown(){
        driver.quit();

}

}