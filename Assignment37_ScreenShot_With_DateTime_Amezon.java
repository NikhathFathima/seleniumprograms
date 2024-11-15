package seleniumbasics;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment37_ScreenShot_With_DateTime_Amezon {
	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amezon.in");
		
		Date d1 = new Date();
		Date p_Date = new Date(d1.getTime());
		System.out.println(p_Date);
		String saveDate = p_Date.toString();
		String get_CurrentDateTime = saveDate.substring(saveDate.length()-4).concat("_").concat(saveDate.substring(4, 19));
		String CurrentDateTime_1 = get_CurrentDateTime.replace(":", "");
		String FinalDateTime = CurrentDateTime_1.replace(" ", "_");
		System.out.println(FinalDateTime);
		
		TakesScreenshot ts = driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\PC\\Desktop\\Takescreenshotinselenoum"+FinalDateTime+".png");
		FileHandler.copy(sourceFile, destFile);

	}
}
