package practicepack;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	
	Properties prop = new Properties();
	
	public Readconfig()
	{
		File src= new File("C:\\Users\\dell pc\\eclipse-workspace\\practice\\configuration.properties");
		
		
		try {
			FileInputStream fis= new FileInputStream(src);
			prop.load(fis);
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
		public String getUrl()
		
		{
			String url=prop.getProperty("baseurl");
			return url;
		}
		
		
		
	}
	
	


