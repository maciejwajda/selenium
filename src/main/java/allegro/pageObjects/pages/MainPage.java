package allegro.pageObjects.pages;

import utils.PageLoader;

import static config.Browser.driver;

public class MainPage extends AbstractPage{

    public static final String URL = "https://allegro.pl/";

    public MainPage navigate(){
        driver.get(URL);
        return this;
    }
}
