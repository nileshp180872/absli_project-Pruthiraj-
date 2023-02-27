package Dashboard;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_Class {
	
	WebDriver driver;
	Properties prop = new Properties();
	@Test
	public void Login() throws IOException, InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pruthish\\OneDrive\\Desktop\\chromedriver.exe");
		
		FileInputStream ip = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\test\\java\\Dashboard\\prop.properties");
		prop.load(ip);
		driver = new ChromeDriver();
		System.out.println(prop.getProperty("browser"));
		
		driver.get(prop.getProperty("url"));
		Thread.sleep(15000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(prop.getProperty("userID"))).sendKeys(prop.getProperty("ID1"));
		driver.findElement(By.xpath(prop.getProperty("next"))).click();
		driver.findElement(By.xpath(prop.getProperty("Password"))).sendKeys(prop.getProperty("Pass"));
		driver.findElement(By.xpath(prop.getProperty("Login"))).click();
		String confirmMessage = driver.findElement(By.xpath(prop.getProperty("DashboardText"))).getText();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("Dashboard"));
		driver.quit();
		
		
	}

}
