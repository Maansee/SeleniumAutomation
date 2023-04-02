package ui;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\chromedriver.exe"); //not nneeded for selenium server 4.6 and above for chrome, edge and firefox
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); //create object driver
	
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		
		driver.manage().window().maximize();
		List<WebElement> alltags= driver.findElements(By.tagName("a"));
		System.out.println("Total tags are "+alltags.size());
		
	}

}
