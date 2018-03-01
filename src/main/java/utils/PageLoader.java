package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static config.Browser.driver;
import static org.openqa.selenium.support.ui.ExpectedConditions.not;

public class PageLoader {

    public static void waitForLoad(WebElement el) {
        ExpectedCondition<Boolean> pageLoadCondition = d -> ((JavascriptExecutor) d).
                executeScript("return document.readyState").equals("complete");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(pageLoadCondition);
//        wait.until(not(ExpectedConditions.stalenessOf(el)));
    }
}
