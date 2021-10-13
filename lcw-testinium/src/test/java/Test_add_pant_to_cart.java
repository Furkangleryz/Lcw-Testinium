import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_add_pant_to_cart {

    HomePage homePage;
    PantPage pantPage;
    PantDetailPage pantDetailPage;
    CartPage cartPage;

    @Test
    public void search_pant(){
        homePage.searchBox().search("pantolon");
        Assertions.assertTrue(pantPage.İsonPantPage(),
        "Pantolon sayfasında değilsin!");

    }
    @Test
    public void select_pant(){
        pantPage.selectPant(1);
        Assertions.assertTrue(pantDetailPage.İsonPantDetailPage(),
            "Pantolon detay sayfasında değilsin!");

    }
    @Test
    public void add_pant_to_cart(){
        pantDetailPage.addToCart();
        Assertions.assertTrue(homePage.isPantCountUp(),
        "Pantolon sayısı artmadı!");
    }
    @Test
    public void select_a_cart(){
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkIfpantAdded(),
        "Pantolon sepete eklenmedi");

    }
}
