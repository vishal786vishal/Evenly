package SeleniumRahul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class flipkartLoginDropDown {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.flipkart.com");
	        Actions actions = new Actions(driver);
	        WebElement button    = driver.findElement(By.className("H6-NpN"));
	        actions.moveToElement(button).perform();
	         driver.findElement(By.linkText("Orders")).click();

	  

	}

}




       