package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class config_dataprovider {
	Properties pro;
	public config_dataprovider() throws Exception    {
		
		String filepath="C:\\Users\\Hp\\eclipse-workspace\\New_Red_Bus\\config\\config.properties";
		
		FileInputStream fis=new FileInputStream(filepath);
		
		pro=new Properties();
		pro.load(fis);
		
	}

	public String getBaseUrl() {
	return pro.getProperty("BaseUrl");
	}
	
	public String getBrowserChrome() {
		return pro.getProperty("BrowserChrome");
	}
	
	public String getBrowserEdge() {
		return pro.getProperty("BrowserEdge");
	}
	
	public String getExcelPath() {
		return pro.getProperty("ExcelPath");
	}
	
	
}
