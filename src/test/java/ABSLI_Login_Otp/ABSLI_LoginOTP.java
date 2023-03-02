package ABSLI_Login_Otp;

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

import com.google.common.collect.Table.Cell;

public class ABSLI_LoginOTP {
	
	private static final long TimeOut = 15;
	XSSFCell muser;
	XSSFCell mpass;
	XSSFCell otpp;
	WebDriver driver;
	Properties prop = new Properties();
	
	@Test
	public void Login() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ABSLI\\ABSLI_Service_buddy\\Driver\\chromedriver.exe");
		FileInputStream ip = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\src\\propertyfiles\\AB.Login_Properties");
		FileInputStream fs = new FileInputStream("D:\\ABSLI\\ABSLI_Service_buddy\\src\\main\\java\\src\\datafiles\\AB_Login_Data.xlsx");
				//Creating a workbook
				XSSFWorkbook workbook = new XSSFWorkbook(fs);
				XSSFSheet sheet = workbook.getSheetAt(0);
				XSSFRow row = sheet.getRow(0);
				XSSFCell cell = row.getCell(0);
				muser = sheet.getRow(1).getCell(1);
				otpp = sheet.getRow(2).getCell(1);
				System.out.println(otpp);	
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
		String confirmMessage = driver.findElement(By.xpath(prop.getProperty("DashboardText"))).getText();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("Dashboard"));
		//driver.quit();
		
		
	}

}
