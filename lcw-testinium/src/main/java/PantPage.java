import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PantPage extends BasePage{

    By BreadCrumbLocator = By.xpath("//*[@class='breadcrumb']");
    public PantPage(WebDriver driver) {
        super(driver);
    }

    public Boolean İsonPantPage() {
        return isDisplayed(BreadCrumbLocator);
    }

    public void selectPant(int i) {

    }

}
