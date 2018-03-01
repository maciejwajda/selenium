package allegro.pageObjects.components.filters;

import allegro.pageObjects.AbstractPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiskSizeFilter extends AbstractPageObject{

    @FindBy(xpath = "//fieldset[descendant::span[text()='Pojemność dysku (GB)']]//input[@id='od']")
    private WebElement from;
    @FindBy(xpath = "//fieldset[descendant::span[text()='Pojemność dysku (GB)']]//input[@id='do']")
    private WebElement to;

    public void applyFilter(Integer from, Integer to){
        this.from.sendKeys(from.toString());
        this.to.sendKeys(to.toString());
        this.to.submit();
    }
}
