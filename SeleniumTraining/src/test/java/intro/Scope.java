package intro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//limit webdriver scope to footer
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//limit webdriver scope to column
		
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td/ul"));
		
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		//click on the link and verify if they are opening
		
		for(int i=1; i<(columnDriver.findElements(By.tagName("a")).size());i++)
			
		{
			String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			
			Thread.sleep(5000);
		}
		
		//open all tabs
		Set<String> tabNames = driver.getWindowHandles();
		Iterator<String> it = tabNames.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		

	}

}
