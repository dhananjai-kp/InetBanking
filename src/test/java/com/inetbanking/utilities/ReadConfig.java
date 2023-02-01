package inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

    Properties pro;

    public ReadConfig(){
       File src = new File("./Configuration/config.properties");

       try{
           FileInputStream fis = new FileInputStream(src);
           pro = new Properties();
           pro.load(fis);
       }
       catch (Exception e ){
           System.out.println("Exception is " + e.getMessage());
       }

   }
    public String getApplicationURL(){
        String url = pro.getProperty("baseURL");
        return url;
    }

    public String getpassword(){
        String password = pro.getProperty("password");
        return password;
    }

    public String getUsername(){
        String username = pro.getProperty("userName");
        return username;
    }

    public String getChromePath(){
        String chrome = pro.getProperty("chromepath");
        return chrome;
    }

    public String getEdgePath(){
        String edge = pro.getProperty("edgepath");
        return edge;
    }
    public String getFirefoxPath(){
        String firefox = pro.getProperty("firefoxpath");
        return firefox;
    }

}
