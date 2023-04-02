package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Maansee");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Abc1234$");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement staticdd = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dd = new Select(staticdd);
		dd.selectByVisibleText("Female");

		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.name("bday")).sendKeys("12/05/1994");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		String successMsg = driver.findElement(By.xpath("//body/app-root[1]/form-comp[1]/div[1]/div[2]/div[1]")).getText();
		
		System.out.println(successMsg);
	}

}
