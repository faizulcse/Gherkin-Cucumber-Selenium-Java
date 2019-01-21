package helper;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertySettings {
	private PropertySettings(){ }

	Properties prop = null;
	private Map<Integer, String> browserList;
	private String browser;
	private String baseUrl;
	private int waitTime;
	private String dbhost;
	private WebDriver mDriver;

	private String messageNotSupport = "NotSupportedInfoWillGoesHere";
	private static PropertySettings instance = null;

	public static PropertySettings getInstance() {
		if(instance == null) {
			instance = new PropertySettings();
			instance.loadData();
		}
		return instance;
	}

	public void loadData() {
		try{
			prop = new Properties();
			prop.load(new FileInputStream(AppConstant.SETTING_PATH));

			this.baseUrl = prop.getProperty("url");
			this.waitTime = Integer.parseInt(prop.getProperty("waitTime"));
			this.browser = prop.getProperty("browser");
			this.browserList = parseBrowserList(this.browser);
			this.browser = this.browserList.get(0);
			this.dbhost = prop.getProperty("dbhost");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public Properties getProperties() {
		return prop;
	}

	public String getMessageNotSupport() {
		return messageNotSupport;
	}

	public String getDbhost() {
		return dbhost;
	}

	public int getWaitTime() {
		return waitTime;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public Map<Integer, String> getBrowserList() {
		return browserList;
	}

	private Map<Integer, String> parseBrowserList(String browsers) {
		Map<Integer, String> tmpBrowserList = new HashMap<Integer, String>();

		String [] temp = browsers.split(",");
		int i = 0;
		for(String browserString : temp) {
			tmpBrowserList.put(i, browserString.trim());
			i++;
		}
		return tmpBrowserList;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setWebDriver(WebDriver driver) {
		mDriver = driver;
	}

	public WebDriver getCurrentDriver() {
		return mDriver;
	}

}
