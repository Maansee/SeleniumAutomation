package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();
		
		//count of iframes
		System.out.println(driver.findElements(By.tagName("frame")).size());
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		String p = driver.findElement(By.id("content")).getText();
		
		System.out.println(p);

	}

}
