package helper;

public class Constants {

    public static final String CURRENT_DIR = System.getProperty("user.dir");
    public static final String CSV_FILE_PATH = CURRENT_DIR + "/data/";
    public static final String TEST_SUITE_XML = CURRENT_DIR + "/config/";
    public static final String SETTING_PATH = CURRENT_DIR + "/config/setting.conf";
    public static final String CHROME_DRIVER_MAC = CURRENT_DIR + "/driver/chromedriver";
    public static final String CHROME_DRIVER_WINDOWS = CURRENT_DIR + "/driver/chromedriver.exe";
    public static final String FIRE_FOX_DRIVER_MAC = CURRENT_DIR + "/driver/geckodriver";
    public static final String FIRE_FOX_DRIVER_WINDOWS = CURRENT_DIR + "/driver/geckodriver.exe";
    public static final String SCREEN_SHOT_DIR = CURRENT_DIR + "/screenshots/";
    public static long IMPLICIT_WAIT = 20;
    public static long PAGE_LOAD_TIMEOUT = 20;
}
