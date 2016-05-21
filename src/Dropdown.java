import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {

		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
		
		driver.get("http://www.southalltravel.co.uk/");
		
		WebElement drop=driver.findElement(By.id("AirLineCode1"));
		
		Select oselect=new Select(drop);
		
		oselect.selectByValue("EK");
		
		//driver.close();
		
		
		
		

	}

}
