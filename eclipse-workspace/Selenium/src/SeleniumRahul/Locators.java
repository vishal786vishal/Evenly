package SeleniumRahul;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
	driver.findElement(By.id("inputUsername")).sendKeys("Vishal");
	driver.findElement(By.name("inputPassword")).sendKeys("user123");
	driver.findElement(By.className("signInBtn")).click();
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

	
	}

}