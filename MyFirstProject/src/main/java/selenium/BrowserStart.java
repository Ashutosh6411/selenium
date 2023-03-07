package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BrowserStart {

	public static void main(String[] args) {
		
		    // Set the path to the ChromeDriver executable
		    System.setProperty("webdriver.chrome.driver", "/Users/ashutoshmishra/Downloads/chromedriver_mac64/chromedriver");

		    // Set the path to the browser profile
		    String profilePath = "/Users/ashutoshmishra/Library/Application Support/Google/Chrome/Profile 2";

		    // Create a new ChromeOptions instance and set the profile path
		    ChromeOptions options = new ChromeOptions();
		    options.addArguments("user-data-dir=" + profilePath);

		    // Create a new ChromeDriver instance with the ChromeOptions
		    WebDriver driver = new ChromeDriver(options);

		    // Navigate to a website
		    driver.get("https://google.com");
		    System.out.print(driver.getTitle());

		    // Close the browser
		    driver.quit();
		  }
		
}
		
		
		
		

