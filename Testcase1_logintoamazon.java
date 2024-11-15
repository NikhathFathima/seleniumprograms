package seleniumbasics;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Testcase1_logintoamazon {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Testcase1_logintoamazon tc1=new Testcase1_logintoamazon();
		System.out.println(tc1.getClass());
		/*Date d1= new Date();
		System.out.println(d1.getTime());

		
		Date d2=new Date(d1.getTime());
		System.out.println(d2);*/
		
		TakesScreenshot ts=driver;
		
		File Source=ts.getScreenshotAs(OutputType.FILE);
		File Destination=new File("C:\\Users\\PC\\Desktop\\Takescreenshotinselenoum\\"+new Testcase1_logintoamazon() +".png");
		FileHandler.copy(Source, Destination);
		
	}

}
