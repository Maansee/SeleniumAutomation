package intro;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddPdtsToCart {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		
		
		int count=0;
		String[] addItem = {"Cucumber","Tomato","Beetroot","Apple"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		
		
		List<String> addItemList = Arrays.asList(addItem);

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		List<WebElement> buttons = driver.findElements(By.xpath("//div[@class='product-action']/button"));

		String[] productArray;

		String product;

		int j = 0;



		for(int i = 1;i<products.size();i++) {

		productArray = products.get(i).getText().split("-");

		product = productArray[0].trim();

		if (addItemList.contains(product)) {

		j++;

		buttons.get(i).click();

		Thread.sleep(3000);

		if (j == (addItem.length)) {

		break;

		}

		}

		}

		//click on Cart bag

		driver.findElement(By.xpath("//*[@id='root']/div/header/div/div[3]/a[4]/img")).click();

		//click on Proceed to checkout

		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		

	}

}
