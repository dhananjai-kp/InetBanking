//        User ID :	mngr473421
//        Password : emAjemA

package inetbanking.testCases;

import inetbanking.utilities.ReadConfig;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    ReadConfig readconfig = new ReadConfig();
    public String baseURL = readconfig.getApplicationURL();
    public String userName = readconfig.getUsername();
    public String password = readconfig.getpassword();
    public static WebDriver driver;
    public static  Logger Logger;

    @Parameters("browser")
    @BeforeClass
    public void setup(String br){

        Logger  =  Logger.getLogger("eBanking");
        PropertyConfigurator.configure("log4j.properties");

        if (br.equals("chrome")){
            System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
            driver = new ChromeDriver();
        }
        else if (br.equals("edge")){

            System.setProperty("webdriver.edge.driver",readconfig.getEdgePath());
            driver = new EdgeDriver();
        }
        else if (br.equals("firefox")){

            System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
            driver = new FirefoxDriver();

        }
    }

    @AfterClass
    public void teatDown(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.quit();
    }








}
