package testcases;

import org.testng.annotations.Test;
import pages.AddEmployeePage;
import pages.DashBoardPage;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

public class AddEmployeeTest extends CommonMethods {

    @Test
    public void addEmployee(){

        LoginPage loginpage = new LoginPage();
        loginpage.login(ConfigReader.getPropertyValue("username"), ConfigReader.getPropertyValue("password"));

        DashBoardPage dash =  new DashBoardPage();
        click(dash.pimOPtion);
        click(dash.addEmployeeButton);

        AddEmployeePage add = new AddEmployeePage();
        sendText(add.firstName, "test123");
        sendText(add.lastName, "test12345");
        click(add.saveBtn);
    }
}
