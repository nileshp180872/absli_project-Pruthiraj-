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

public class HDFC_Login_with_OTP_Journey_LF0438 {
	
	private static final long TimeOut = 15;
	XSSFCell muser;
	XSSFCell mpass;
	XSSFCell otpp;
	WebDriver driver;
	Properties prop = new Properties();
	
	@Test(priority=16,description = " login With OTP HDFC Advisor LF0438 ")
	@Description("verify the sucessfully login with otp...")
	@Epic("Tc016")
	@Feature("Login with OTP land on Dashboard Page")
	@Story("OTP Login")
	@Severity(SeverityLevel.CRITICAL)
	
	public void Login_WithOTP_HDFC_advisor () throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ABSLI\\ABSLI_Service_buddy\\Driver\\chromedriver.exe");
		FileInputStream ip = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\DemoProperties\\AB.Login_Properties");
		FileInputStream fs = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\DemoData\\Project_Login_data.xlsx");
				//Creating a workbook
				XSSFWorkbook workbook = new XSSFWorkbook(fs);
				XSSFSheet sheet = workbook.getSheetAt(0);
				XSSFRow row = sheet.getRow(0);
				XSSFCell cell = row.getCell(0);
				muser = sheet.getRow(4).getCell(1);
				otpp = sheet.getRow(8).getCell(3);
				System.out.println(muser);	
		prop.load(ip);
		driver = new ChromeDriver();
		System.out.println(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("userID"))).sendKeys(muser.toString());
		driver.findElement(By.xpath(prop.getProperty("next"))).click();
		driver.findElement(By.xpath(prop.getProperty("otp"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id(prop.getProperty("Enterotp"))).sendKeys(otpp.toString());
		driver.findElement(By.xpath(prop.getProperty("LoginOTP"))).click();
		//driver.findElement(By.xpath(prop.getProperty("Skip"))).click();
		//String confirmMessage = driver.findElement(By.xpath(prop.getProperty("DashboardText"))).getText();
		//Assert.assertTrue(confirmMessage.equalsIgnoreCase("Dashboard"));
		//Thread.sleep(2000);
		driver.quit();
	}
	
	
	@Test(priority=17,description = " login With OTP HDFC Advisor portal verify the Dashboadr page ")
	@Description("verify the sucessfully login with otp land on Dashboard page...")
	@Epic("Tc017")
	@Feature("Login with OTP & verify the Dashboard Page")
	@Story("OTP Login")
	@Severity(SeverityLevel.CRITICAL)
	
	public void HDFC_Advisor_Dashboard() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ABSLI\\ABSLI_Service_buddy\\Driver\\chromedriver.exe");
		FileInputStream ip = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\DemoProperties\\AB.Login_Properties");
		FileInputStream fs = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\DemoData\\Project_Login_data.xlsx");
				//Creating a workbook
				XSSFWorkbook workbook = new XSSFWorkbook(fs);
				XSSFSheet sheet = workbook.getSheetAt(0);
				XSSFRow row = sheet.getRow(0);
				XSSFCell cell = row.getCell(0);
				muser = sheet.getRow(4).getCell(1);
				otpp = sheet.getRow(8).getCell(3);
				System.out.println(muser);	
		prop.load(ip);
		driver = new ChromeDriver();
		System.out.println(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("userID"))).sendKeys(muser.toString());
		driver.findElement(By.xpath(prop.getProperty("next"))).click();
		driver.findElement(By.xpath(prop.getProperty("otp"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id(prop.getProperty("Enterotp"))).sendKeys(otpp.toString());
		driver.findElement(By.xpath(prop.getProperty("LoginOTP"))).click();
		driver.findElement(By.xpath(prop.getProperty("Skip"))).click();
		String confirmMessage = driver.findElement(By.xpath(prop.getProperty("DashboardText"))).getText();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("Dashboard"));
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	
	
	@Test(priority=18,description = " login With OTP HDFC Advisor portal click on logout button  ")
	@Description("verify the sucessfully login with otp click on logout button & verify the Welcome to Service Buddy link text ...")
	@Epic("Tc018")
	@Feature("After click on logout button user should see the Welcome to Service Buddy user id page")
	@Story("OTP Login")
	@Severity(SeverityLevel.CRITICAL)
		public void logout_with_HDFC_Advisor() throws IOException, InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\ABSLI\\ABSLI_Service_buddy\\Driver\\chromedriver.exe");
			FileInputStream ip = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\DemoProperties\\AB.Login_Properties");
			FileInputStream fs = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\DemoData\\Project_Login_data.xlsx");
					//Creating a workbook
					XSSFWorkbook workbook = new XSSFWorkbook(fs);
					XSSFSheet sheet = workbook.getSheetAt(0);
					XSSFRow row = sheet.getRow(0);
					XSSFCell cell = row.getCell(0);
					muser = sheet.getRow(4).getCell(1);
					otpp = sheet.getRow(8).getCell(3);
					System.out.println(muser);	
			prop.load(ip);
			driver = new ChromeDriver();
			System.out.println(prop.getProperty("browser"));
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
			driver.findElement(By.xpath(prop.getProperty("userID"))).sendKeys(muser.toString());
			driver.findElement(By.xpath(prop.getProperty("next"))).click();
			driver.findElement(By.xpath(prop.getProperty("otp"))).click();
			Thread.sleep(2000);
			driver.findElement(By.id(prop.getProperty("Enterotp"))).sendKeys(otpp.toString());
			driver.findElement(By.xpath(prop.getProperty("LoginOTP"))).click();
			driver.findElement(By.xpath(prop.getProperty("Skip"))).click();
			String confirmMessage = driver.findElement(By.xpath(prop.getProperty("DashboardText"))).getText();
			Assert.assertTrue(confirmMessage.equalsIgnoreCase("Dashboard"));
			driver.findElement(By.xpath(prop.getProperty("HDFClogo"))).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("LogOut"))).click();
			Thread.sleep(2000);
			String confirmMessageq = driver.findElement(By.xpath(prop.getProperty("welcometoservicebuddy"))).getText();
			Assert.assertTrue(confirmMessageq.equalsIgnoreCase("Welcome to Service Buddy"));
			driver.quit();
		}
		
		
	



}
