package config;

import org.openqa.selenium.chrome.ChromeOptions;

public class DriverConfig {

    private static final String DRIVERS_PATH = "build/webdrivers/";
    private static final String OS = "windows";

    public static ChromeOptions chromeConfig(){
        System.setProperty("webdriver.chrome.driver", DRIVERS_PATH + OS
                + "/googlechrome/64bit/chromedriver.exe");
        return new ChromeOptions();
    }
}
