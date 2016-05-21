
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {
	
	
	//public static WebDriver driver;

	public static void main(String[] args) throws IOException   { {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
		
		
		driver.get("http://www.southalltravel.co.uk/");			
	              File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	           //The below method will save the screen shot in d drive with name "screenshot.png"
	              FileUtils.copyFile(screenshot, new File("C:\\Users\\anubhav.s\\DesktopScreenshot.jpg"));
	  
	              
	              WebElement crop=driver.findElement(By.xpath("html/body/div[1]/div[6]/div/div[2]"));
	   
	   
	   BufferedImage BuffImg=ImageIO.read(screenshot);
	   
	   Point pt=crop.getLocation();
	   
	   int height=crop.getSize().getHeight();
	   int width=crop.getSize().getWidth();
	   
	   BufferedImage eleScreenshot= BuffImg.getSubimage(pt.getX(), pt.getY(), width, height);
	   
	   ImageIO.write(eleScreenshot, "png",screenshot );
	   
	   FileUtils.copyFile(screenshot, new File("C:\\Users\\anubhav.s\\topScreenshot.jpg"));
	   }
	
	}
}

