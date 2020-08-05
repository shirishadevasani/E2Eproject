package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import practicepack.BaseClass;

public class appTest extends BaseClass {

	
	@Test
	public void test()
	{
		System.out.println("Im test function");
	}
	
	@Parameters({"baseurl"})
	@Test 
	public void login(String urlname)
	{
		driver.get(urlname);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
	}
}
