//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package steps;

import pages.AddEmployeePage;
import pages.DashboardPage;
import pages.EmployeeSearchPage;
import pages.LoginPage;

public class PageInitializers {
    public static LoginPage login;
    public static EmployeeSearchPage employeeSearchPage;
    public static AddEmployeePage addEmployeePage;
    public static DashboardPage dash;

    public PageInitializers() {
    }

    public static void intializePageObjects() {
        login = new LoginPage();
        employeeSearchPage = new EmployeeSearchPage();
        addEmployeePage = new AddEmployeePage();
        dash =new DashboardPage();
    }
}
