package utils;

import org.openqa.selenium.JavascriptExecutor;

import static config.Browser.driver;

public class PageScroller {

    public static void scroleToPageTop(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0)");
    }
}
