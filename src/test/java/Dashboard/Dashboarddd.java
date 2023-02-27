package Dashboard;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.google.common.io.Files;



public class Dashboarddd {
	private static final long TimeOut = 15;
	WebDriver driver;
	Properties prop = new Properties();
	
	@Test
	public void Login() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pruthish\\OneDrive\\Desktop\\chromedriver.exe");
		
		FileInputStream ip = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\test\\java\\Dashboard\\prop.properties");
		prop.load(ip);
		driver = new ChromeDriver();
		System.out.println(prop.getProperty("browser"));
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath(prop.getProperty("userID"))).sendKeys(prop.getProperty("ID1"));
		driver.findElement(By.xpath(prop.getProperty("next"))).click();
		driver.findElement(By.xpath(prop.getProperty("Password"))).sendKeys(prop.getProperty("Pass"));
		driver.findElement(By.xpath(prop.getProperty("Login"))).click();
		String confirmMessage = driver.findElement(By.xpath(prop.getProperty("DashboardText"))).getText();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("Dashboard"));
		java.io.File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  Files.copy(f1, new java.io.File(".\\ScreenShot\\Login.png"));
		driver.quit();
		
	}
	@Test
	public void globalsearchName() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pruthish\\OneDrive\\Desktop\\chromedriver.exe");
		
		FileInputStream ip = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\test\\java\\Dashboard\\prop.properties");
		prop.load(ip);
		driver = new ChromeDriver();
		System.out.println(prop.getProperty("browser"));
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath(prop.getProperty("userID"))).sendKeys(prop.getProperty("ID1"));
		driver.findElement(By.xpath(prop.getProperty("next"))).click();
		driver.findElement(By.xpath(prop.getProperty("Password"))).sendKeys(prop.getProperty("Pass"));
		driver.findElement(By.xpath(prop.getProperty("Login"))).click();
		driver.findElement(By.xpath(prop.getProperty("Search"))).click();
		driver.findElement(By.xpath(prop.getProperty("searchByname"))).sendKeys(prop.getProperty("SearchName"));
		String confirmGlobal = driver.findElement(By.xpath(prop.getProperty("SearchByCUname"))).getText();
		Assert.assertTrue(confirmGlobal.equalsIgnoreCase("Arvind Heda"));
		java.io.File f2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  Files.copy(f2, new java.io.File(".\\ScreenShot\\globalsearchName.png"));
		driver.quit();
	}
	@Test
	public void searchMobilenumber() throws IOException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pruthish\\OneDrive\\Desktop\\chromedriver.exe");
			
			FileInputStream ip = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\test\\java\\Dashboard\\prop.properties");
			prop.load(ip);
			driver = new ChromeDriver();
			System.out.println(prop.getProperty("browser"));
			driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			driver.findElement(By.xpath(prop.getProperty("userID"))).sendKeys(prop.getProperty("ID1"));
			driver.findElement(By.xpath(prop.getProperty("next"))).click();
			driver.findElement(By.xpath(prop.getProperty("Password"))).sendKeys(prop.getProperty("Pass"));
			driver.findElement(By.xpath(prop.getProperty("Login"))).click();
			driver.findElement(By.xpath(prop.getProperty("Search"))).click();
			driver.findElement(By.xpath(prop.getProperty("searchbymobile"))).click();
			driver.findElement(By.xpath(prop.getProperty("searchmobile"))).sendKeys(prop.getProperty("Number"));
			String verifyMobile = driver.findElement(By.xpath(prop.getProperty("verifyMobile"))).getText();
			Assert.assertTrue(verifyMobile.equalsIgnoreCase("6381167490"));	
			java.io.File f3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  Files.copy(f3, new java.io.File(".\\ScreenShot\\searchMobilenumber.png"));
			driver.quit();
	}
	@Test
	public void policyid() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pruthish\\OneDrive\\Desktop\\chromedriver.exe");
		
		FileInputStream ip = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\test\\java\\Dashboard\\prop.properties");
		prop.load(ip);
		driver = new ChromeDriver();
		System.out.println(prop.getProperty("browser"));
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath(prop.getProperty("userID"))).sendKeys(prop.getProperty("ID1"));
		driver.findElement(By.xpath(prop.getProperty("next"))).click();
		driver.findElement(By.xpath(prop.getProperty("Password"))).sendKeys(prop.getProperty("Pass"));
		driver.findElement(By.xpath(prop.getProperty("Login"))).click();
		driver.findElement(By.xpath(prop.getProperty("Search"))).click();
		driver.findElement(By.xpath(prop.getProperty("verifyPOlicyID"))).click();
		driver.findElement(By.xpath(prop.getProperty("searchpolicyID"))).sendKeys("000800963",Keys.ENTER);
		driver.findElement(By.xpath(prop.getProperty("policyOwener"))).click();
		String policyID = driver.findElement(By.xpath(prop.getProperty("policyIdD"))).getText();
		Assert.assertTrue(policyID.equalsIgnoreCase("000800963"));
		driver.quit();
	}
	@Test
	public void TotalavtiveNOPs() throws IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pruthish\\OneDrive\\Desktop\\chromedriver.exe");
		
		FileInputStream ip = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\test\\java\\Dashboard\\prop.properties");
		prop.load(ip);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath(prop.getProperty("userID"))).sendKeys(prop.getProperty("ID1"));
		driver.findElement(By.xpath(prop.getProperty("next"))).click();
		driver.findElement(By.xpath(prop.getProperty("Password"))).sendKeys(prop.getProperty("Pass"));
		driver.findElement(By.xpath(prop.getProperty("Login"))).click();
		driver.findElement(By.xpath(prop.getProperty("TotalActivePOlicyTiilDATE"))).getText();
		driver.findElement(By.xpath(prop.getProperty("Mycustomer"))).click();
		
		String TotalavtiveNOPs = driver.findElement(By.xpath(prop.getProperty("TotalavtiveNOPs"))).getText();
		Assert.assertTrue(TotalavtiveNOPs.equalsIgnoreCase("538"));
	}
	

}
