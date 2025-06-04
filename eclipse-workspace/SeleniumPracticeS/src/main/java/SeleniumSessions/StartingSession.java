package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StartingSession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser = "chrome";
		Webdriver driver  = null;
         if 
         (browser.equals("chrome")) {
        	 driver= new ChromeDriver();
         }
         else
         {
        
        	 System.out.println("Plz pass the right browser" + browser);
      
         }
         
         driver.get("https://google.com");
	}

}
