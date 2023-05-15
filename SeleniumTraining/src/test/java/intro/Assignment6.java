package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption3")).click();
		
		String label = driver.findElement(By.id("checkBoxOption3")).getAttribute("value");
		System.out.println(label);
		
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		Select dropDownValue = new Select(dropDown);
		dropDownValue.selectByValue(label);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("name")).sendKeys(label);
		driver.findElement(By.id("alertbtn")).click();
		
		String alertText= driver.switchTo().alert().getText();
		
		System.out.println(alertText);
		

	
		if(alertText.contains(label))
		{
			System.out.println("Verified");
		}
		
		else
			
			System.out.println("Execution failed");
		
		

	}

}
