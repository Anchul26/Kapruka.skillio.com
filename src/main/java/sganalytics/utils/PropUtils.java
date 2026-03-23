package sganalytics.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropUtils {

	public String getProperty(String filePath, String key) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
		String value = null;
		Properties prop = new Properties();
		prop.load(fis);
		value = prop.getProperty(key);
		return value;
	}
	
	public static void main(String[] args) throws IOException {
		String value = new PropUtils().getProperty("./src/main/resources/OR.properties", "loginBtn");
		System.out.println("Value: "+value);
	}
}
