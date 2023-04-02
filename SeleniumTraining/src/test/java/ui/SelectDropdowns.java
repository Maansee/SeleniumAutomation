package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdowns {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); // create object driver

		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		driver.manage().window().maximize();

		/*
		 * 
		 * WebElement ddown = driver.findElement(By.name("employees_c")); Select select
		 * = new Select(ddown); select.selectByValue("level1"); Thread.sleep(2000);
		 * 
		 * select.selectByIndex(5);
		 * 
		 * 
		 * select.selectByVisibleText("251 - 500 employees");
		 * 
		 */

	}

}
