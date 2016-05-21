import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
		
driver.get("http://deluxe-menu.com/popup-mode-sample.html");		
		WebElement righclic=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]"));
		
		Actions action=new Actions(driver);
		
		action.contextClick(righclic).perform();

		driver.close();

	}

}
