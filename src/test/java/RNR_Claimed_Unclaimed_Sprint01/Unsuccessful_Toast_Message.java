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

public class Unsuccessful_Toast_Message {
	private static final long TimeOut = 100;
	XSSFCell muser;
	XSSFCell mpass;
	WebDriver driver;
	Properties prop = new Properties();
	
	@Test
	public void NeftDate() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ABLSI_SB\\absli-portals-service-buddy\\JARS\\ChromeDriver\\chromedriver.exe");
		FileInputStream ip = new FileInputStream("D:\\ABLSI_SB\\absli-portals-service-buddy\\src\\propertyfiles\\prop.Unsuccessful_toast_Message");
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
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("NOP"))).click();
		driver.findElement(By.xpath(prop.getProperty("Edit"))).click();
		driver.findElement(By.xpath(prop.getProperty("EditNominee"))).click();
		driver.findElement(By.xpath(prop.getProperty("SelectPolicyNo"))).click();
		
		
		
		/*driver.findElement(By.xpath(prop.getProperty("Rewards"))).click();
		driver.findElement(By.xpath(prop.getProperty("ClaimedRewards"))).click();
		driver.findElement(By.xpath(prop.getProperty("ViewMore"))).click();
		Thread.sleep(3000);
		String confirmMessage = driver.findElement(By.xpath(prop.getProperty("NeftDate"))).getText();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("NEFT date"));
		System.out.println(confirmMessage);
		driver.quit();*/
	}

}
