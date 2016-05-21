
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Property {
	
	public static Logger Log=Logger.getLogger("devpinoyLogger");//used for logging into logs
	
	public static WebDriver driver;
		    public static void main(String[] args) throws IOException {

		        Properties OR=new Properties();
		        	 Properties Config=new Properties();
		        	 
		      FileInputStream fis=new FileInputStream("C:\\Selenium\\programs\\Practice\\OR.properties");
		      
		      FileInputStream fist=new FileInputStream("C:\\Selenium\\programs\\Practice\\Config.properties"); 	 
		        		 
		      OR.load(fis);
		      Log.debug("Loading OR file");
		      Config.load(fist);
		      
		      Log.debug("Loading Config file");
		      
		      System.out.println(OR.getProperty("username"));
		      
		     Log.debug("Printing username");
		      System.out.println(Config.getProperty("testsiteurl"));
		      Log.debug("Printing URL");
		      
		      if(Config.getProperty("browser").equals("Firefox")){
					
					 driver=new FirefoxDriver();
					 //Log.debug("Loading Firefox");
					
		      } 
		      //Once the browser is opened we will  give the URL
		      
		      driver.get(Config.getProperty("testsiteurl"));
		      driver.findElement(By.xpath(OR.getProperty("username"))).sendKeys("anubhavsikka@gmail.com");
		    }
}

