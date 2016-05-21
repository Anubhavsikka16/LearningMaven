import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table1 {
	
	public static Logger Log=Logger.getLogger("devpinoyLogger");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		Log.debug("Loading FireFox");
		driver.manage().window().maximize();
		Log.debug("Maximizing window");
		driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
		
		driver.get("http://www.espncricinfo.com/new-zealand-v-sri-lanka-2015-16/engine/match/914217.html");
	Log.debug("Opening website");
		
		WebElement score=driver.findElement(By.xpath(".//*[@id='full-scorecard']/div[2]/div/table[3]/tbody/tr[4]/td[2]/a"));
		System.out.println(score.getText());
		Log.debug("getting player name");
	
	score.click();
WebElement status=driver.findElement(By.cssSelector(".dismissal-info"));
status.isDisplayed();
	
	
	
	
	
	
	}

}
