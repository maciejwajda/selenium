package config;

import org.openqa.selenium.WebDriver;

public class Browser
{
    public static WebDriver driver;

    public Browser(WebDriver driver)
    {
        Browser.driver = driver;
    }
}
