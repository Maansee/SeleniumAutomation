package intro;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddPdtsToCart {

	public static void main(String[] args) {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		int count=0;
		String[] cartList= {"Cucumber","Tomato","Beetroot","Apple"};
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++)
		{
			String[] item = products.get(i).getText().split("-");
			String final_item=item[0].trim();
			
		}
		
		List finalCartList = Arrays.asList(cartList);
		
		if(finalCartList.contains(cartList))
		{
			count++;
			driver.findElement(By.xpath("//div[@class='product-action']//button")).get(i).click();
		}

	}

}
