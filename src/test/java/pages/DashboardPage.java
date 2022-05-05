package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.DashboardSteps;
import utils.CommonMethods;

import java.util.List;

public class DashboardPage extends CommonMethods {

    @FindBy(xpath="//*[@class='menu']/ul/li")
    public List<WebElement> dashboardTabs;

    @FindBy(id="welcome")
    public WebElement welcomeMessage;

    public DashboardPage(){
        PageFactory.initElements(driver, this);
    }

}
