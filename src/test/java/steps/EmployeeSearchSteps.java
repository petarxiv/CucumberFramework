package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Command;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Constants;

import java.util.concurrent.TimeUnit;

public class EmployeeSearchSteps extends CommonMethods {

    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() {
        openBrowserAndLunchApplication();
    }
    @When("user enters valid admin credentials")
    public void user_enters_valid_admin_credentials() {
        WebElement usernamefield = driver.findElement(By.id("txtUsername"));
        //usernamefield.sendKeys(ConfigReader.getPropertyValue("username"));
        sendText(usernamefield, ConfigReader.getPropertyValue("username"));
        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        sendText(passwordField, ConfigReader.getPropertyValue("password"));
        //passwordField.sendKeys(ConfigReader.getPropertyValue("password"));

    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        click(loginButton);
        //loginButton.click();
        //driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
    }

    @When("user navigated to employee list page")
    public void user_navigated_to_employee_list_page() {
        WebElement pimOption = driver.findElement(By.id("menu_pim_viewPimModule"));
        //pimOption.click();
        click(pimOption);
        WebElement empListOption = driver.findElement(By.id("menu_pim_viewEmployeeList"));
        //empListOption.click();
        click(empListOption);
    }

    @When("user enters valid employee id")
    public void user_enters_valid_employee_id() {
        WebElement searchId = driver.findElement(By.id("empsearch_id"));
       // searchId.sendKeys("8510142");
        sendText(searchId, "8510142");
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        WebElement searchButton = driver.findElement(By.id("searchBtn"));
        //searchButton.click();
        click(searchButton);
    }

    @Then("user is able to see employee information")
    public void user_is_able_to_see_employee_information() {
        System.out.println("Result displayed");
        tearDown();
    }
    @When("user enters valid employee name")
    public void user_enters_valid_employee_name() {
        //driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
        WebElement searchName=driver.findElement(By.id("empsearch_employee_name_empName"));
       // searchName.sendKeys("Zubair");
        sendText(searchName,"zubair");
    }

}