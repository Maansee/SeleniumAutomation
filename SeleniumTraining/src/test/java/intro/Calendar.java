package intro;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("form-field-travel_comp_date"))));
		
		Thread.sleep(5000);

		driver.findElement(By.xpath(".//input[@id='form-field-travel_comp_date']")).sendKeys(Keys.ENTER);
		
		List<WebElement> dates = driver.findElements(By.className("flatpickr-month"));
        
        int count = driver.findElements(By.className("flatpickr-month")).size();
        System.out.println(count);
        System.out.println("before for loop");
        
        for(int i=1;i<count;i++)
        	
        	
        {
        	System.out.println("inside for");
            String text = driver.findElements(By.tagName("//div[@class='dayContainer']")).get(i).getText();
            
            if(text.equalsIgnoreCase("23"))
            {
            	driver.findElements(By.tagName("//div[@class='dayContainer']")).get(i).click();
                break;
            }
        }
	}

}
