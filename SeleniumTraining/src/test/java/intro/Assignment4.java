package intro;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		
		String L2 = driver.findElement(By.cssSelector("h3")).getText();
		
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		
		Set<String> windows =driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		
		String L1 = driver.findElement(By.cssSelector("h3")).getText();
		
		driver.switchTo().window(parentId);
		
		System.out.println(L1);
		System.out.println(L2);


	}

}
