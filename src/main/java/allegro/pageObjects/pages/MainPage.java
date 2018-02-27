package allegro.pageObjects.pages;

import static config.Browser.driver;

public class MainPage extends AbstractPage{

    public static final String URL = "https://allegro.pl/";

    public <T>T navigate(Class<T> type){
        return this.navigate();
    }

    public <T>T navigate(){
        driver.get(URL);
        return (T)this;
    }
}
