package miscellaneous;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink1 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//("a[href*='broken']");
		
		String url = driver.findElement(By.cssSelector("a[href*='broken']")).getAttribute("href");
		
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		
		conn.setRequestMethod("HEAD");
		conn.connect();
		int reqCode = conn.getResponseCode();
		System.out.println(reqCode);
		
	}

}
