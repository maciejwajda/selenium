package allegro.disks;

import allegro.pageObjects.pages.ExternalAndInternalDisksPage;
import allegro.pageObjects.pages.MainPage;
import allegro.products.Product;
import config.Browser;
import config.DriverFactory;
import org.assertj.core.api.SoftAssertions;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static allegro.products.Product.ORDERED_BY_PRICE_DESC;
import static allegro.products.ProductParser.findAllProducts;
import static config.Browser.driver;
import static utils.PageScroller.scrollToPageTop;


public class DiskFilteringAndSortingTest {

    private MainPage mainPage;
    private ExternalAndInternalDisksPage disksPage;
    private static final int MIN_SIZE = 500;
    private static final int MAX_SIZE = 1000;

    @BeforeClass
    public static void setupWebDriver() {
        new Browser(DriverFactory.getWebDriver(DriverFactory.CHROME));
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
        setDiskSizeFilterTo(MIN_SIZE, MAX_SIZE);
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

    private void setDiskSizeFilterTo(int from, int to) {
        disksPage.diskSizeFilter.applyFilter(from, to);
        scrollToPageTop();
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
