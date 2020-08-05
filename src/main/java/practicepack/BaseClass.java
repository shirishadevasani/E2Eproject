package practicepack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	protected WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell pc\\eclipse-workspace\\practice\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	/*Readconfig rc=new Readconfig();
	public String url=rc.getUrl();*/
}
