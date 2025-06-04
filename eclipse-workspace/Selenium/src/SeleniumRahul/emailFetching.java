package SeleniumRahul;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class emailFetching {
    public static void main(String[] args) {
        // Set up ChromeDriver
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.linkedin.com");

        try {
            // Open a publicly scrapable website (example)
            driver.get("https://google.com"); 
            driver.navigate().to("https://example.com/contacts");
            // Replace with a legal source

            // Get all elements that might contain email addresses
            List<WebElement> elements = driver.findElements(By.xpath("//*[contains(text(),'gmail.com')]"));

            // Print each found email-containing element
            for (WebElement element : elements) {
                System.out.println("Found: " + element.getText());
            }
        } finally {
            driver.quit();
        }
    }
}