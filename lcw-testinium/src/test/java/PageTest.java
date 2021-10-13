import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;



@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PageTest {
    WebDriver driver;

    @BeforeAll

   public void setup(){
    WebDriverManager.chromedriver().setup();
    driver.get("https://www.lcwaikiki.com/tr-TR/TR");
    driver.manage().window().maximize();
    }

    public static void main(String[] args) {
    }
}
