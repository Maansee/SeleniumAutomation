package miscellaneous;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrokenLinkList {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		
		for(WebElement link: links) {
			
			String url = link.getAttribute("href");
			
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			
			conn.setRequestMethod("HEAD");
			conn.connect();
			int reqCode = conn.getResponseCode();
			System.out.println(reqCode);
			
			if(reqCode>=400)
			{
				System.out.println(link.getText()+" is boken with code "+reqCode);
				Assert.assertTrue(false);
			}
		}
		
		

	}

}
