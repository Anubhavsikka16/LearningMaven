
//TO CALCULATE TOTAL VLAUES IN DROPDOWN AND TO PRINT THEM


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
		
		driver.get("http://www.southalltravel.co.uk/");
		
		List<WebElement> dropdown=driver.findElements(By.tagName("option"));
		
		System.out.println("Total number of Airline is:" +dropdown.size());
		
		for(int i=0;i<+dropdown.size();i++){
			
			System.out.println(dropdown.get(i).getAttribute("value"));
		}
		
		
		
	
	
		
		
		
		
		
		

	}

}
