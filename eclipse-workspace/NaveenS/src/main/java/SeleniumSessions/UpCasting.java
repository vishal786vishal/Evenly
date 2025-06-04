package SeleniumSessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 
 
public class UpCasting {

	public static void main(String[] args) {

		String browser = "Chrome";
		WebDriver driver = null;
		
		switch(browser.trim().toLowerCase()) {
		
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
			default:
				System.out.println("Plz pass the right browser");
				//break;
			throw new BrowserException("Invalid Browser");
			
		
		}
		driver.get("https://google.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}

}
