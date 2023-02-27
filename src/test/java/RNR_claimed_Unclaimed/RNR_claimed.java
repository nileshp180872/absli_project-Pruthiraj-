package RNR_claimed_Unclaimed;

import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.io.Files;



public class RNR_claimed {
	
	private static final long TimeOut = 100;
	XSSFCell muser;
	XSSFCell mpass;
	WebDriver driver;
	java.util.Properties prop = new java.util.Properties();
	
	@Test
	public void NeftDate() throws java.io.IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ABLSI_SB\\absli-portals-service-buddy\\JARS\\ChromeDriver\\chromedriver.exe");
		java.io.FileInputStream ip = new java.io.FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\src\\propertyfiles\\prop.MRA");
		prop.load(ip);
		java.io.FileInputStream fs = new java.io.FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\src\\datafiles\\MRA.xlsx");
				
				XSSFWorkbook workbook = new XSSFWorkbook(fs);
				XSSFSheet sheet = workbook.getSheetAt(0);
				
				XSSFRow row = sheet.getRow(0);
				XSSFCell cell = row.getCell(0);
				
				muser = sheet.getRow(1).getCell(1);
				mpass = sheet.getRow(0).getCell(1);
							
		driver = new ChromeDriver();
		System.out.println(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("userID"))).sendKeys(muser.toString());
		driver.findElement(By.xpath(prop.getProperty("next"))).click();
		driver.findElement(By.xpath(prop.getProperty("Password"))).sendKeys(mpass.toString());
		driver.findElement(By.xpath(prop.getProperty("Login"))).click();
		Thread.sleep(2000);
		java.io.File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f1, new java.io.File(".\\ScreenShot\\MRAdashboardpage.png"));
		driver.findElement(By.xpath(prop.getProperty("MRA"))).click();
		Thread.sleep(2000);
		java.io.File f2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f2, new java.io.File(".\\ScreenShot\\Most Respected Advisors page.png"));
		Thread.sleep(3000);
		driver.quit();
	}
	@Test
	public void Ibutton() throws java.io.IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ABLSI_SB\\absli-portals-service-buddy\\JARS\\ChromeDriver\\chromedriver.exe");
		java.io.FileInputStream ip = new java.io.FileInputStream("D:\\ABLSI_SB\\absli-portals-service-buddy\\src\\propertyfiles\\prop.MRA");
		prop.load(ip);
		java.io.FileInputStream fs = new java.io.FileInputStream("D:\\ABLSI_SB\\absli-portals-service-buddy\\src\\datafiles\\MRA.xlsx");
				
				XSSFWorkbook workbook = new XSSFWorkbook(fs);
				XSSFSheet sheet = workbook.getSheetAt(0);
				
				XSSFRow row = sheet.getRow(0);
				XSSFCell cell = row.getCell(0);
				
				muser = sheet.getRow(1).getCell(1);
				mpass = sheet.getRow(0).getCell(1);
							
		driver = new ChromeDriver();
		System.out.println(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("userID"))).sendKeys(muser.toString());
		driver.findElement(By.xpath(prop.getProperty("next"))).click();
		driver.findElement(By.xpath(prop.getProperty("Password"))).sendKeys(mpass.toString());
		driver.findElement(By.xpath(prop.getProperty("Login"))).click();
		driver.findElement(By.xpath(prop.getProperty("MRA"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("iButton"))).click();
		String confirmMessage = driver.findElement(By.xpath(prop.getProperty("MRATerms"))).getText();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("MRA Terms"));
		
		
		
	}

}


