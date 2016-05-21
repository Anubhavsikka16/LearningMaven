import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Resizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/resizable/");
		
		driver.switchTo().frame(0);
		
		
		WebElement resizable=driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));//xpath is of resizable arrow at the corner of window
		Actions resize=new Actions(driver);
		
		resize.dragAndDropBy(resizable, 500, 300).perform();
		
		
	}

}
