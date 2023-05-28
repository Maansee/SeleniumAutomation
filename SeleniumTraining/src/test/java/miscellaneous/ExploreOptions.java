package miscellaneous;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExploreOptions {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("myipadd:4444");
		options.setCapability("proxy", proxy);
		
		Map<String,Object> prefs = new HashMap<String,Object>();
		
		prefs.put("download.default_directory", "/directory/path");
		
		options.setExperimentalOption("prefs", prefs);
		options.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(options);
		

	}

}
