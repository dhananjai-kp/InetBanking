package inetbanking.testCases;

import inetbanking.pages.LoginPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC_LoginTest_001 extends BaseClass {

    @Test
    public void loginTest() throws InterruptedException {
        driver.get(baseURL);
        Logger.info("URL is opened");
        LoginPage lp = new LoginPage(driver);

        lp.setUserName(userName);
        Logger.info("Entered Username");

        lp.setPassword(password);
        Logger.info("Entered Password");

        lp.clickSubmit();

        if(driver.getTitle().equals("Guru99 Bank Manager HomePage")){
            Assert.assertTrue(true);
            Logger.info("Login test passed");

        }
        else{
            Assert.assertTrue(false);
            Logger.info("Login test failed");

        }


    }









}
