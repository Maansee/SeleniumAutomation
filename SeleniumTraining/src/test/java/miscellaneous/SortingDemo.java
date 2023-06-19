package miscellaneous;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortingDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));

		List<String> originalList = elementList.stream().map(s -> s.getText()).collect(Collectors.toList());

		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		Assert.assertTrue(originalList.equals(sortedList));
		
		List<String> price;
		
		//scan column name with gettext() -> Beans -> 	print price of Beans
		do {
			
			List<WebElement> elementList1 = driver.findElements(By.xpath("//tr/td[1]"));	
		price = elementList1.stream().filter(s->s.getText().contains("Cheese")).map(s->getVegPrice(s)).collect(Collectors.toList());
		 
		price.forEach(a->System.out.println(a));
		
		if(price.size()<1) {
			driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		}
		}
		while(price.size()<1);
	}

	private static String getVegPrice(WebElement s) {
		
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return priceValue;
	}

}
