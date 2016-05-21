import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		
		
		driver.get("http://www.jabong.com/");
		
		Thread.sleep(5000);
		
		WebElement mouseover=driver.findElement(By.xpath(".//*[@id='mainTopNav']/li[2]/a"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(mouseover).perform();
		
		driver.findElement(By.xpath(".//*[@id='mainTopNav']/li[2]/div/div[3]/div[2]/a[2]")).click();
		
		driver.close();
		
	}

}
