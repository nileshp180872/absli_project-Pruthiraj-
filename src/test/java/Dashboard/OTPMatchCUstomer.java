package Dashboard;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OTPMatchCUstomer {
	
	private static final long TimeOut = 150;
	WebDriver driver;
	Properties prop = new Properties();
	@Test
	public void OTP() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pruthish\\OneDrive\\Desktop\\chromedriver.exe");
		FileInputStream ip = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\test\\java\\Dashboard\\prop.properties");
		prop.load(ip);
		driver = new ChromeDriver();
		System.out.println(prop.getProperty("browser"));
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URLotp"));
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("1"))).sendKeys(prop.getProperty("11"));
		driver.findElement(By.xpath(prop.getProperty("2"))).sendKeys(prop.getProperty("12"));
		driver.findElement(By.xpath(prop.getProperty("3"))).sendKeys(prop.getProperty("13"));
		driver.findElement(By.xpath(prop.getProperty("4"))).sendKeys(prop.getProperty("14"));
		driver.findElement(By.xpath(prop.getProperty("5"))).sendKeys(prop.getProperty("15"));
		driver.findElement(By.xpath(prop.getProperty("6"))).sendKeys(prop.getProperty("16"));
		driver.findElement(By.xpath(prop.getProperty("Verify"))).click();
		
	}

}
