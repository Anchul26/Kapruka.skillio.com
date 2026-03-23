package sganalytics.utils;

import java.io.IOException;

public class App {

	private static final String filePath = "./src/main/resources/app.properties";

	private App() {
		// TODO Auto-generated constructor stub
	}

	public static String getBrowserName() {
		PropUtils prop = new PropUtils();
		String browserName = null;
		try {
			browserName = prop.getProperty(filePath, "browser_name");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return browserName;

	}

	public static String getUrl(String env) {
		PropUtils prop = new PropUtils();
		String appUrl = null;
		try {
			appUrl = prop.getProperty(filePath, "app_" + env + "url");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return appUrl;
	}
	
	public static String getUserName(String env) {
		PropUtils prop = new PropUtils();
		String userName = null;
		try {
			userName = prop.getProperty(filePath, "app_" + env + "UserName");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userName;		
	}
	
	public static String getPassword(String env) {
		PropUtils prop = new PropUtils();
		String password = null;
		try {
			password = prop.getProperty(filePath, "app_" + env + "Password");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return password;		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
