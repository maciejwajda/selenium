package config;

import org.openqa.selenium.chrome.ChromeOptions;

public class DriverConfig {

    private static final String DRIVERS_PATH = "build/webdrivers/";
    private static final String OS = "windows";
    private static final String ARCH = "64bit";
    private static final String EXT = ".exe";

    public static ChromeOptions chromeConfig(){
        System.setProperty("webdriver.chrome.driver", DRIVERS_PATH + OS
                + "/googlechrome/" + ARCH + "/chromedriver" + EXT);
        return new ChromeOptions();
    }
}
