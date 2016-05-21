import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-form/");
		List<WebElement> button=driver.findElements(By.name("sex"));
		
		boolean bvalue=false;
		
		bvalue=button.get(0).isSelected();
		
		if(bvalue=true){
			
			button.get(1).click();
		}else
			button.get(0).click();
		
		driver.findElement(By.id("exp-3")).click();
		driver.findElement(By.cssSelector("#profession-1")).click();
		//driver.close();
		
	}
		
		
		
		
	}


