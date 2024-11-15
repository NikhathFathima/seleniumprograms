package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment19_GrotechMinds_DropDown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://grotechminds.com/registration/");
		WebElement skill_DropDown = driver.findElement(By.id("Skills"));
		Select select_Skl = new Select(skill_DropDown);
		select_Skl.selectByValue("select2");
		
		WebElement country_DropDown = driver.findElement(By.name("Country"));
		Select select_Cntry = new Select(country_DropDown);
		select_Cntry.selectByVisibleText("India");
		
		WebElement relegon_DropDown = driver.findElement(By.id("Relegion"));
		Select select_relgn = new Select(relegon_DropDown);
		select_relgn.selectByIndex(4);    
	}
	}


