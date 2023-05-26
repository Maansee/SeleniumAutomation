package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecDemo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);

		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

		List<WebElement> values = driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));

		int sum = 0;

		for (int i = 0; i < values.size(); i++) {

			// System.out.println(Integer.parseInt(values.get(i).getText()));

			sum = sum + Integer.parseInt(values.get(i).getText());

		}

		System.out.println(sum);

	}

}
