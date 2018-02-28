package allegro.search;

import allegro.pageObjects.pages.ExternalAndInternalDisksPage;
import allegro.pageObjects.pages.MainPage;
import config.Browser;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.PageScroller;

import static config.Browser.driver;
import static utils.PageScroller.scroleToPageTop;


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
        ExternalAndInternalDisksPage disksPage = goToDisksPage();
        setDiskSpaceFilter(disksPage);
        disksPage.productSorter.sortByPriceDesc();
    }

    private void setDiskSpaceFilter(ExternalAndInternalDisksPage disksPage) {
        disksPage.diskSpaceFilter.applyFilter(500, 1000);
        scroleToPageTop();
    }

    private ExternalAndInternalDisksPage goToDisksPage() {
        return mainPage.categoryMenu.openCategoryMenu().
                selectElectronicsCategory().
                selectComputers().
                selectDisksAndMemories().
                selectExternalAndInternalDiscks();
    }

    @AfterClass
    public static void closeBrowser(){
        driver.close();
        driver.quit();
    }
}
