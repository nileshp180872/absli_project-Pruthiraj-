package Dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class smokeTest {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pruthish\\OneDrive\\Desktop\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://lifeinsurancepartnersuat.adityabirlacapital.com/");
		//Thread.sleep(9000);
		
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		// Navigate to the demoqa website
		driver.get("https://lifeinsurancepartnersuat.adityabirlacapital.com/adminlogin");

	}

}
