package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment13_Amezon_DropDown {
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement drpDwon_All = driver.findElement(By.id("searchDropdownBox"));
		Select slct_option = new Select(drpDwon_All);
//		slct_option.selectByValue("search-alias=stripbooks");
		slct_option.selectByVisibleText("Books");
		WebElement txtBox_Search = driver.findElement(By.id("twotabsearchtextbox"));
		txtBox_Search.sendKeys("Think and grow rich");
		WebElement btn_Search = driver.findElement(By.id("nav-search-submit-button"));
		btn_Search.click();

		
	}


}
