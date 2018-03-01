package allegro.search;

import allegro.products.Product;
import allegro.pageObjects.pages.ExternalAndInternalDisksPage;
import allegro.pageObjects.pages.MainPage;
import config.Browser;
import org.assertj.core.api.SoftAssertions;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

import static allegro.products.Product.ORDERED_BY_PRICE_DESC;
import static allegro.products.ProductParser.findAllProducts;
import static config.Browser.driver;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.PageScroller.scroleToPageTop;


public class SearchProductTest {

    private MainPage mainPage;
    private ExternalAndInternalDisksPage disksPage;
//    private List<Product> products;
    private static final int MIN_SIZE = 500;
    private static final int MAX_SIZE = 1000;

    @BeforeClass
    public static void setupWebdriver() {
        System.setProperty("webdriver.chrome.driver", "build/webdrivers/windows/googlechrome/64bit/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver webdriver = new ChromeDriver(chromeOptions);
        webdriver.manage().window().maximize();
        new Browser(webdriver);
    }

    @Before
    public void openMainPage() {
        mainPage = new MainPage().navigate();
    }

    @Test
    public void verifyFilteringAndPriceSorting() {
        //GIVEN
        goToDisksPage();
        //WHEN
        setDiskSpaceFilterTo(MIN_SIZE, MAX_SIZE);
        disksPage.productSorter.sortByPriceDesc();
        //THEM
        checkSortingAndFiltering(findAllProducts(disksPage.productsList));
    }

    private void checkSortingAndFiltering(List<Product> products) {
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(products).as("Products not sorted").isSortedAccordingTo(ORDERED_BY_PRICE_DESC);
        softly.assertThat(products).as("Size smaller then " + MIN_SIZE).
                allMatch( p -> p.getSize() >= MIN_SIZE);
        softly.assertThat(products).as("Size grater then " + MAX_SIZE).
                allMatch( p -> p.getSize() <= MAX_SIZE);
        softly.assertAll();
    }

    private void setDiskSpaceFilterTo(int from, int to) {
        disksPage.diskSpaceFilter.applyFilter(from, to);
        scroleToPageTop();
    }

    private void goToDisksPage() {
        disksPage = mainPage.categoryMenu.
                openCategoryMenu().
                selectElectronicsCategory().categoryMenu.
                selectComputers().categoryMenu.
                selectDisksAndMemories().categoryMenu.
                selectExternalAndInternalDisks();
    }

    @AfterClass
    public static void closeBrowser() {
        driver.close();
        driver.quit();
    }
}
