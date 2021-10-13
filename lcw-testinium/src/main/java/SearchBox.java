import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{

    By searchBoxLocator =By.xpath("//*[@class='search-box__input']");
    By submitButtonLocator = By.xpath("//*[@class='search-box__button']");

    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String pantolontext) {
        type(searchBoxLocator , pantolontext);
        click(submitButtonLocator);
        

    }
}
