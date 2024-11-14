package assignment67_Amazon_CrossBrowserTestingPkg.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Browser_Launch_Quit {
	WebDriver driver;
	@BeforeMethod()
	@Parameters("browser")
	public void LaunchAmazon(String NameOfBrowser)
	{
		if(NameOfBrowser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		if(NameOfBrowser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	}
	
	@AfterMethod()
	public void QuitAmazon()
	{
		driver.quit();
	}

}
