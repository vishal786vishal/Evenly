package SeleniumSessions;
import org.openqa.selenium.chrome.ChromeDriver; 
public class WebDriverBasics {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
driver.get("https://www.google.com");

String title = driver.getTitle();
System.out.println(title);
if (title.equals("google"))
{
	System.out.println("the test passed");
	
}
else {
	System.out.println("failed");
}
driver.quit();
	}

}
