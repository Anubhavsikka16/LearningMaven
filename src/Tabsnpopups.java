import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tabsnpopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		
		
		driver.get("http://www.southalltravel.co.uk/");
		
	
				driver.findElement(By.xpath("html/body/div[7]/div[1]/div/div[1]/a[1]/img")).click();
				Set<String> win_id=driver.getWindowHandles();
			java.util.Iterator<String> itr= win_id.iterator();
			String First_id=itr.next();
				String Second_id=itr.next();
				driver.switchTo().window(Second_id);
				driver.findElement(By.xpath(".//*[@id='site-container']/article/div[2]/div/div/div/p[3]/a/span[2]")).click();
	}

}
