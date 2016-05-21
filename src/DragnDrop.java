import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement drag=driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath(".//*[@id='droppable']"));
		
		Actions dnd=new Actions(driver);
		
		dnd.dragAndDrop(drag, drop).perform();
	
		driver.quit();
		
		
	}

}
