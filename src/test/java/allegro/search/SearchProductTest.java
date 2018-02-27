package allegro.search;

import allegro.pageObjects.pages.MainPage;
import config.Browser;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static config.Browser.driver;


public class SearchProductTest {

    private MainPage mainPage;

    @BeforeClass
    public static void setupWebdriver(){
        System.setProperty("webdriver.chrome.driver", "build/webdrivers/windows/googlechrome/64bit/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("webdriver.load.strategy", PageLoadStrategy.EAGER);
        WebDriver webdriver = new ChromeDriver(chromeOptions);

        webdriver.manage().window().maximize();
        new Browser(webdriver);
    }

    @Before
    public void openMainPage(){
        mainPage = new MainPage().navigate();
    }

    @Test
    public void search() {
        mainPage.openCategoryMenu().
                selectElectronicsCategory().
                selectComputers().
                selectDiscksAndMemories();
//        driver.findElement(
//                By.linkText("Kategorie")).
//                click();
//        driver.findElement(
//                By.xpath("//a[@data-analytics-click-value='Elektronika']")).
//                click();
//        driver.findElement(By.linkText("Komputery")).click();
//        driver.findElement(By.linkText("Dyski i pamięci przenośne")).click();
//        driver.findElement(By.linkText("Dyski zewnętrzne i przenośne")).click();
//        driver.findElement(By.xpath("//fieldset[descendant::span[text()='Pojemność dysku (GB)']]//input[@id='od']")).sendKeys("500");
//        driver.findElement(By.xpath("//fieldset[descendant::span[text()='Pojemność dysku (GB)']]//input[@id='do']")).sendKeys("1000");
//        driver.findElement(By.xpath("//fieldset[descendant::span[text()='Pojemność dysku (GB)']]//input[@id='do']")).submit();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0, 0)");
//        driver.findElement(By.xpath("//*[@id='opbox-listing-sort']/div/button")).click();
//        driver.findElement(By.xpath("//*[@id='opbox-listing-sort']//li[descendant::span[text()='cena']]//a[text()='od najwyższej']")).click();

    }

    @AfterClass
    public static void closeBrowser(){
        driver.close();
        driver.quit();
    }
}
