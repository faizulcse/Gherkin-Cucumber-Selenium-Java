package helper;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


public class PropertySettings {
	private PropertySettings(){
	}

	Properties prop = null;
	private Map<Integer, String> browserList;
	private String browser;
	private String baseUrl;
	private String creatorUser;
	private String creatorPass;
	private String mailFrom;
	private String user;
	private String pass;

	private String mailTo;
	private String mailPassword;
	private int waitTime;
	private int state;
	private boolean loged;
	private String testngxml;

	private String dbhost;
	private String reportTime; //yyyy-MM-dd-hh-mm-ss
	private String year;
	private String month;
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
			String filePath = AppConstant.SETTING_PATH;
			prop.load(new FileInputStream(filePath));

			this.state = 0;
			this.loged = false;
			this.baseUrl = prop.getProperty("url");
			this.creatorUser = prop.getProperty("creatorUser");
			this.creatorPass = prop.getProperty("creatorPass");
			this.user = prop.getProperty("user");
			this.pass = prop.getProperty("pass");

			this.mailFrom = prop.getProperty("mailfrom");
			this.mailPassword = prop.getProperty("mailpass");
			this.mailTo = prop.getProperty("mailto");

			this.testngxml = prop.getProperty("testngxml");
			this.waitTime = Integer.parseInt(prop.getProperty("waitTime"));
			this.browser = prop.getProperty("browser");
			this.browserList = parseBrowserList(this.browser);
			this.browser = this.browserList.get(0);
			this.dbhost = prop.getProperty("dbhost");

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
			//System.out.println(sdf.format(new Date()));
			this.reportTime = sdf.format(new Date());
			SimpleDateFormat ydf = new SimpleDateFormat("yyyy");
			this.year = ydf.format(new Date());
			SimpleDateFormat mdf = new SimpleDateFormat("MMMM");
			this.month = mdf.format(new Date());
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

	public String getReportTime() {
		return reportTime;
	}

	public String getYear() {
		return year;
	}

	public String getMonth() {
		return month;
	}

	public String getDbhost() {
		return dbhost;
	}

	public int getWaitTime() {
		return waitTime;
	}

	public String getUser() {
		return user;
	}

	public String getPass() {
		return pass;
	}

	public String getTestngxml() {
		return testngxml;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public boolean getLoged() {
		return loged;
	}

	public void setLoged(boolean loged) {
		this.loged = loged;
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

	public String getCreatorUser() {
		return creatorUser;
	}

	public String getCreatorPass() {
		return creatorPass;
	}

	public String getMailFrom() {
		return mailFrom;
	}

	public String getMailTo() {
		return mailTo;
	}

	public String getMailPassword() {
		return mailPassword;
	}

	public void print(){
		System.out.println(getBrowser());
		System.out.println(getBaseUrl());
		System.out.println(getCreatorUser());
		System.out.println(getCreatorPass());
		System.out.println(getMailFrom());
		System.out.println(getMailPassword());
		System.out.println(getMailTo());
	}

	public void setWebDriver(WebDriver driver) {
		mDriver = driver;
	}

	public WebDriver getCurrentDriver() {
		return mDriver;
	}

}
