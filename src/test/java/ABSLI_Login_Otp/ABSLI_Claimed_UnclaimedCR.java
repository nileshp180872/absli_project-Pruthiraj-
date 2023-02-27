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
import org.testng.annotations.Test;

public class ABSLI_Claimed_UnclaimedCR {
	private static final long TimeOut = 100;
	XSSFCell muser;
	XSSFCell mpass;
	WebDriver driver;
	Properties prop = new Properties();
	
	@Test
	public void claimedUnclaimedCR() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ABLSI_SB\\absli-portals-service-buddy\\JARS\\ChromeDriver\\chromedriver.exe");
		FileInputStream ip = new FileInputStream("D:\\ABLSI_SB\\absli-portals-service-buddy\\src\\propertyfiles\\prop.claimedUnclaimedCR");
		prop.load(ip);
		FileInputStream fs = new FileInputStream("D:\\ABLSI_SB\\absli-portals-service-buddy\\src\\datafiles\\data.ClaimedUnclaimedCR.xlsx");
				
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
		
	}

}
