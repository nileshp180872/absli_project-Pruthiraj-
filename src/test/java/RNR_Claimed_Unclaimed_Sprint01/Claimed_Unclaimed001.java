package RNR_Claimed_Unclaimed_Sprint01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Claimed_Unclaimed001 {
	
	private static final long TimeOut = 100;
	XSSFCell muser;
	XSSFCell mpass;
	WebDriver driver;
	Properties prop = new Properties();
	
	@Test
	public void NeftDate() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ABSLI\\ABSLI_Service_buddy\\Driver\\chromedriver.exe");
		FileInputStream ip = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\src\\propertyfiles\\prop.claimedUnclaimedCR");
		prop.load(ip);
		FileInputStream fs = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\src\\datafiles\\data.ClaimedUnclaimedCR.xlsx");
				
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
		driver.findElement(By.xpath(prop.getProperty("Rewards"))).click();
		driver.findElement(By.xpath(prop.getProperty("ClaimedRewards"))).click();
		driver.findElement(By.xpath(prop.getProperty("ViewMore"))).click();
		Thread.sleep(3000);
		String confirmMessage = driver.findElement(By.xpath(prop.getProperty("NeftDate"))).getText();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("NEFT date"));
		System.out.println(confirmMessage);
		driver.quit();
	}
	
	@Test
	public void BalanceGrossPrizeMony() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ABSLI\\ABSLI_Service_buddy\\Driver\\chromedriver.exe");
		FileInputStream ip = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\src\\propertyfiles\\prop.claimedUnclaimedCR");
		prop.load(ip);
		FileInputStream fs = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\src\\datafiles\\data.ClaimedUnclaimedCR.xlsx");
				
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
		driver.findElement(By.xpath(prop.getProperty("Rewards"))).click();
		driver.findElement(By.xpath(prop.getProperty("ClaimedRewards"))).click();
		Thread.sleep(3000);
		String confirmMessage = driver.findElement(By.xpath(prop.getProperty("BalanceGrossPrizeMony"))).getText();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("Balance gross Prize money"));
		driver.quit();
	}
	
	@Test
	public void NetPrizeMoney() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ABSLI\\ABSLI_Service_buddy\\Driver\\chromedriver.exe");
		FileInputStream ip = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\src\\propertyfiles\\prop.claimedUnclaimedCR");
		prop.load(ip);
		FileInputStream fs = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\src\\datafiles\\data.ClaimedUnclaimedCR.xlsx");
				
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
		driver.findElement(By.xpath(prop.getProperty("Rewards"))).click();
		driver.findElement(By.xpath(prop.getProperty("ClaimedRewards"))).click();
		Thread.sleep(3000);
		String confirmMessage = driver.findElement(By.xpath(prop.getProperty("NetPrizeMoney"))).getText();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("Net Prize Money"));
		driver.quit();
	}
	@Test
	public void BankACNo() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ABSLI\\ABSLI_Service_buddy\\Driver\\chromedriver.exe");
		FileInputStream ip = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\src\\propertyfiles\\prop.claimedUnclaimedCR");
		prop.load(ip);
		FileInputStream fs = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\src\\datafiles\\data.ClaimedUnclaimedCR.xlsx");
				
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
		driver.findElement(By.xpath(prop.getProperty("Rewards"))).click();
		driver.findElement(By.xpath(prop.getProperty("ClaimedRewards"))).click();
		driver.findElement(By.xpath(prop.getProperty("ViewMore"))).click();
		Thread.sleep(3000);
		String confirmMessage = driver.findElement(By.xpath(prop.getProperty("BankACNo"))).getText();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("Bank A/c no"));
		driver.quit();
	}
	@Test
	public void UTRNumber() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ABSLI\\ABSLI_Service_buddy\\Driver\\chromedriver.exe");
		FileInputStream ip = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\src\\propertyfiles\\prop.claimedUnclaimedCR");
		prop.load(ip);
		FileInputStream fs = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\src\\datafiles\\data.ClaimedUnclaimedCR.xlsx");
				
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
		driver.findElement(By.xpath(prop.getProperty("Rewards"))).click();
		driver.findElement(By.xpath(prop.getProperty("ClaimedRewards"))).click();
		driver.findElement(By.xpath(prop.getProperty("ViewMore"))).click();
		Thread.sleep(3000);
		String confirmMessage = driver.findElement(By.xpath(prop.getProperty("UTRNumber"))).getText();
		System.out.println(confirmMessage);
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("UTR number"));
		driver.quit();
	}
	@Test
	public void Download() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ABSLI\\ABSLI_Service_buddy\\Driver\\chromedriver.exe");
		FileInputStream ip = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\src\\propertyfiles\\prop.claimedUnclaimedCR");
		prop.load(ip);
		FileInputStream fs = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\src\\datafiles\\data.ClaimedUnclaimedCR.xlsx");
				
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
		driver.findElement(By.xpath(prop.getProperty("Rewards"))).click();
		driver.findElement(By.xpath(prop.getProperty("ClaimedRewards"))).click();
		driver.findElement(By.xpath(prop.getProperty("Download"))).click();
		driver.findElement(null);
		
	}

}
