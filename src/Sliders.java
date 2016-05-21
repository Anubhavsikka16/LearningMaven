import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		
		
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);

		WebElement slider = driver.findElement(By.xpath(".//*[@id='slider']/span"));



         Actions action=new Actions(driver);
		
		action.dragAndDropBy(slider, 300, 0).perform();

		driver.close();

	}

}
