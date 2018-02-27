package allegro.pageObjects;

import org.openqa.selenium.support.PageFactory;

import static config.Browser.driver;

public abstract class AbstractPageObject {

    public AbstractPageObject(){
        PageFactory.initElements(driver, this);
    }
}
