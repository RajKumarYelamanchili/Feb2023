package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		try
		{
			File scr = new File("./Configuration/config.properties");
			FileInputStream fis = new FileInputStream(scr);
			pro = new Properties();
			pro.load(fis);
		}	
		catch(IOException e)	
		{
						
			System.out.println("some error");
		}
	
	}
	
	public String getApplicationURL()
	{
		String url =pro.getProperty("baseURL");
		return url;
	}
	
	
	public String getChromePath()
	 {
		   String chromePath = pro.getProperty("chromepath");
		   return chromePath;
	 }
	public String getFireFoxPath()
	{
		String firefoxPath = pro.getProperty("firefoxpath");
		return firefoxPath;
	}
	

}//end of ReadConfig class
