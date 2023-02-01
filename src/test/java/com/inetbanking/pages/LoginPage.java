//        User ID :	mngr473421
//        Password : emAjemA

package inetbanking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class LoginPage {
    WebDriver ldriver;

    public LoginPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }

    @FindBy(name = "uid")
    WebElement txtUserName;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(name = "btnLogin")
    WebElement btnLogin;

    public void setUserName(String uname){
        txtUserName.sendKeys(uname);
    }

    public void setPassword(String pwd){
        password.sendKeys(pwd);
    }

    public void clickSubmit (){
        btnLogin.click();
    }




}
