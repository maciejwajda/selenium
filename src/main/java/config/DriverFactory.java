package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static final String CHROME = "chrome";

    public static WebDriver getWebDriver(String webDriverType){
        WebDriver webDriver;
        if(webDriverType.equals(CHROME)){
            webDriver = setupChrome();
        }
        else {
            return null;
        }
        webDriver.manage().window().maximize();
        return webDriver;
    }

    private static WebDriver setupChrome(){
        return new ChromeDriver(DriverConfig.chromeConfig());
    }
}
