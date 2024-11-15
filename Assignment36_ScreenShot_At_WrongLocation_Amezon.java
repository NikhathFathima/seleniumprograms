package seleniumbasics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment36_ScreenShot_At_WrongLocation_Amezon {
	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amezon.in");
		
		TakesScreenshot ts = driver;
		File src_File = ts.getScreenshotAs(OutputType.FILE);
		try 
		{
		File dest_File = new File("G:\\GrowtechMind\\Screenshots_Practice\\img"+Math.random()+".png");
		FileHandler.copy(src_File, dest_File);
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex+" <- Exception occured");
		}
		
		// Exception - java.io.FileNotFoundException
		

	}
}
