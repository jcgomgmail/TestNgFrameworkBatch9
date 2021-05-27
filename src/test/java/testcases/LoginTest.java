package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashBoardPage;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginTest extends CommonMethods {

    @Test
    public void adminLogin(){

        //login to hrms application
        LoginPage loginpage = new LoginPage();
        sendText(loginpage.usernamebox, ConfigReader.getPropertyValue("username"));
        sendText(loginpage.passwordbox, ConfigReader.getPropertyValue("password"));
        click(loginpage.loginBtn);

        //validation
        //assertion

        DashBoardPage dashboard = new DashBoardPage();
        Assert.assertTrue(dashboard.welcomemessage.isDisplayed(), "welcome message is not displayed");
    }

}
