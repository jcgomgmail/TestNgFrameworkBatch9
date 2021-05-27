package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods{

    @FindBy(id = "txtUsername")
    WebElement usernamebox;

    @FindBy(id = "txtPassword")
    WebElement passwordbox;

    @FindBy(id = "btnLogin")
    WebElement loginBtn;

    LoginPage(){
        PageFactory.initElements(driver, this);
    }

}
