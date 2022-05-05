//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.PageInitializers;

public class CommonMethods extends PageInitializers {
    public static WebDriver driver;

    public CommonMethods() {
    }

    public void openBrowserAndLauchApplication() {
        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        String var1 = ConfigReader.getPropertyValue("browser");
        byte var2 = -1;
        switch(var1.hashCode()) {
            case -1361128838:
                if (var1.equals("chrome")) {
                    var2 = 0;
                }
                break;
            case -849452327:
                if (var1.equals("firefox")) {
                    var2 = 1;
                }
        }

        switch(var2) {
            case 0:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case 1:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid browser name");
        }

        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        intializePageObjects();
    }

    public static void sendText(WebElement element, String textToSend) {
        element.clear();
        element.sendKeys(new CharSequence[]{textToSend});
    }

    public static WebDriverWait getWait() {
        WebDriverWait wait = new WebDriverWait(driver, 20L);
        return wait;
    }

    public static void waitForClickability(WebElement element) {
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void click(WebElement element) {
        waitForClickability(element);
        element.click();
    }

    public static JavascriptExecutor getJSExecutor() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        return js;
    }

    public static void jsClick(WebElement element) {
        getJSExecutor().executeScript("arguments[0].click();", new Object[]{element});
    }

    public static void tearDown() {
        driver.quit();
    }


}
