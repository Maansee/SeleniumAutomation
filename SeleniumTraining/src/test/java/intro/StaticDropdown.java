package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement staticdd = driver.findElement(By.id("dropdown-class-example"));
		
		Select dd = new Select(staticdd);
		dd.selectByIndex(3);
		System.out.println(dd.getFirstSelectedOption().getText());
		dd.selectByVisibleText("Option1");
		System.out.println(dd.getFirstSelectedOption().getText());
		dd.selectByValue("option2");
		System.out.println(dd.getFirstSelectedOption().getText());
		

	}

}
