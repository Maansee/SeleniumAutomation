package intro;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		//ChromeOptions ops = new ChromeOptions();
		//ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
		driver.findElement(
				By.xpath("//body/div[@id='login']/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/label[2]/span[2]"))
				.click();

		// explicit wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']"))).click();

		WebElement staticdd = driver.findElement((By.xpath("//select[@class='form-control']")));
		Select dd = new Select(staticdd);
		dd.selectByValue("consult");

		driver.findElement(By.xpath("//input[@id='terms']")).click();

		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();

		// adding all products to cart
		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		
		List<WebElement> products =driver.findElements(By.cssSelector("button[class='btn btn-info']"));

		for (int i = 0; i < products.size(); i++) {
			products.get(i).click();
		}
		
		driver.findElement(By.partialLinkText("Checkout")).click();
	}

}
