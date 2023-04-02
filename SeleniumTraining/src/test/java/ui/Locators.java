package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	
	public static String browser = "Edge"; //Comes from external config files
	public static WebDriver driver;

	public static void main(String[] args) {
		
		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		//driver.get("https://www.saucedemo.com/");
		//driver.findElement(By.id("user-name")).sendKeys("Testing");
		//driver.findElement(By.tagName("input")).sendKeys("Testing");
		//driver.findElement(By.cssSelector("#user-name")).sendKeys("Testing");
		//driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("Testing");
		driver.get("https://www.selenium.dev/documentation/webdriver/elements/locators/");
		driver.findElement(By.partialLinkText("File")).click();

	}

}
