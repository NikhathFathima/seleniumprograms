package seleniumbasics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment57_AmazonLogin_DDT {
	public static void main(String[] args) throws EncryptedDocumentException, IOException  
	{
		//location of Excel file
		FileInputStream f1 = new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\seleniumbasics\\DDT Sheet\\DDTworksheet.xlsx");
		//Open File
		Workbook wb1 = WorkbookFactory.create(f1);
		//Get required sheet
		//Get Row
		//Get Column
		//Get Value
		String mobileNum = NumberToTextConverter.toText((wb1.getSheet("login").getRow(1).getCell(0).getNumericCellValue()));
		String password = wb1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement e1 =driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		WebElement btn_SignIn1 = driver.findElement(By.linkText("Sign in"));
		btn_SignIn1.click();
		
		WebElement txt_Mobile= driver.findElement(By.xpath("//input[@name=\"email\"]"));
		txt_Mobile.sendKeys(mobileNum);
		WebElement btn_cntinue= driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		btn_cntinue.click();
		WebElement txt_Pwd= driver.findElement(By.xpath("//input[@id=\"ap_password\"]"));
		txt_Pwd.sendKeys(password);
		WebElement btn_SignIn= driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		btn_SignIn.click();
		
	}
	
}
