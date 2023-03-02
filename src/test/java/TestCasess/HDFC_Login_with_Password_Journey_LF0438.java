package TestCasess;

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

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class HDFC_Login_with_Password_Journey_LF0438 {
	
	private static final long TimeOut = 20;
	XSSFCell muser;
	XSSFCell mpass;
	XSSFCell otpp;
	WebDriver driver;
	Properties prop = new Properties();
	
	@Test(priority=13,description = " login With Password HDFC Advisor channel LF0438 ")
	@Description("verify the sucessfully login with password Entry...")
	@Epic("Tc013")
	@Feature("Login with Password land on Dashboard Page")
	@Story("Password Login")
	@Severity(SeverityLevel.NORMAL)
	
	public void Login_With_Password_HDFC_advisor () throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ABSLI\\ABSLI_Service_buddy\\Driver\\chromedriver.exe");
		FileInputStream ip = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\DemoProperties\\AB.Login_Properties");
		FileInputStream fs = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\DemoData\\Project_Login_data.xlsx");
				//Creating a workbook
				XSSFWorkbook workbook = new XSSFWorkbook(fs);
				XSSFSheet sheet = workbook.getSheetAt(0);
				XSSFRow row = sheet.getRow(0);
				XSSFCell cell = row.getCell(0);
				muser = sheet.getRow(4).getCell(1);
				mpass = sheet.getRow(4).getCell(3);
				System.out.println(muser);	
		prop.load(ip);
		driver = new ChromeDriver();
		System.out.println(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("userID"))).sendKeys(muser.toString());
		driver.findElement(By.xpath(prop.getProperty("next"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("Password"))).sendKeys(mpass.toString());
		driver.findElement(By.xpath(prop.getProperty("Login"))).click();
		driver.findElement(By.xpath(prop.getProperty("Skip"))).click();
		String confirmMessage = driver.findElement(By.xpath(prop.getProperty("DashboardText"))).getText();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("Dashboard"));
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	@Test(priority=14,description = "verify the dashboard page in HDFC Advisor channel ")
	@Description("verify the sucessfully login with password Entry & verify the Dashboard Page...")
	@Epic("Tc014")
	@Feature("Login with Password land on Dashboard Page")
	@Story("Password Login")
	@Severity(SeverityLevel.NORMAL)
	
	public void Login_WthPassword_verify_theDashboard_page () throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ABSLI\\ABSLI_Service_buddy\\Driver\\chromedriver.exe");
		FileInputStream ip = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\DemoProperties\\AB.Login_Properties");
		FileInputStream fs = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\DemoData\\Project_Login_data.xlsx");
				//Creating a workbook
				XSSFWorkbook workbook = new XSSFWorkbook(fs);
				XSSFSheet sheet = workbook.getSheetAt(0);
				XSSFRow row = sheet.getRow(0);
				XSSFCell cell = row.getCell(0);
				muser = sheet.getRow(4).getCell(1);
				mpass = sheet.getRow(4).getCell(3);
				System.out.println(muser);	
		prop.load(ip);
		driver = new ChromeDriver();
		System.out.println(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("userID"))).sendKeys(muser.toString());
		driver.findElement(By.xpath(prop.getProperty("next"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("Password"))).sendKeys(mpass.toString());
		driver.findElement(By.xpath(prop.getProperty("Login"))).click();
		driver.findElement(By.xpath(prop.getProperty("Skip"))).click();
		String confirmMessage = driver.findElement(By.xpath(prop.getProperty("DashboardText"))).getText();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("Dashboard"));
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(priority=15,description = " login With Password HDFC Advisor Channel & click on Logout button  ")
	@Description("verify the sucessfully login with Password click on logout button & verify the Welcome to Service Buddy link text ...")
	@Epic("Tc015")
	@Feature("After click on logout button user should see the Welcome to Service Buddy user id page")
	@Story("OTP Login")
	@Severity(SeverityLevel.CRITICAL)
		public void logout_with_Password_HDFC_Advisor_Verify_the_Welcome_to_Service_Buddy_LinkText() throws IOException, InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\ABSLI\\ABSLI_Service_buddy\\Driver\\chromedriver.exe");
			FileInputStream ip = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\DemoProperties\\AB.Login_Properties");
			FileInputStream fs = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\DemoData\\Project_Login_data.xlsx");
					//Creating a workbook
					XSSFWorkbook workbook = new XSSFWorkbook(fs);
					XSSFSheet sheet = workbook.getSheetAt(0);
					XSSFRow row = sheet.getRow(0);
					XSSFCell cell = row.getCell(0);
					muser = sheet.getRow(4).getCell(1);
					mpass = sheet.getRow(4).getCell(3);
					System.out.println(muser);	
			prop.load(ip);
			driver = new ChromeDriver();
			System.out.println(prop.getProperty("browser"));
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
			driver.findElement(By.xpath(prop.getProperty("userID"))).sendKeys(muser.toString());
			driver.findElement(By.xpath(prop.getProperty("next"))).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("Password"))).sendKeys(mpass.toString());
			driver.findElement(By.xpath(prop.getProperty("Login"))).click();
			driver.findElement(By.xpath(prop.getProperty("Skip"))).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("HDFClogo"))).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("LogOut"))).click();
			Thread.sleep(2000);
			String confirmMessageq = driver.findElement(By.xpath(prop.getProperty("welcometoservicebuddy"))).getText();
			Assert.assertTrue(confirmMessageq.equalsIgnoreCase("Welcome to Service Buddy"));
			driver.quit();
		}
		
		
	

}
