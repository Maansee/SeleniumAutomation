package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		//display count of iframes
		System.out.println(driver.findElements(By.tagName("iframe")).size());

		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		
		Actions a = new Actions(driver);
		
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement tgt = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(src, tgt).build().perform();
	}

}
