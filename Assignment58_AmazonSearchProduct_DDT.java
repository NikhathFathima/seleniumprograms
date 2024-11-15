package seleniumbasics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment58_AmazonSearchProduct_DDT {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		WebElement txtBox_search = driver.findElement(By.xpath("//input[@name='field-keywords']"));
		txtBox_search.sendKeys(getData());
		WebElement btn_Search = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		btn_Search.click();

	}
	
	public static String getData() throws EncryptedDocumentException, IOException
	{
		//get file location
		FileInputStream f1 = new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\seleniumbasics\\DDT Sheet\\DDTworksheet.xlsx");
		//open workbook
		Workbook wb1 = WorkbookFactory.create(f1);
		//GetData
		
			String searchData = wb1.getSheet("SearchInput").getRow(1).getCell(0).getStringCellValue();
			return searchData;
	
	}
}
