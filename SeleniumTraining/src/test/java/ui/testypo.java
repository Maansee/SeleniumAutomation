package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testypo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://13.214.28.60:3000/users/register-step2?role=IN-Retail%20Investors");
		
		driver.findElement(By.tagName("button")).sendKeys(Keys.ENTER);
	}

}
