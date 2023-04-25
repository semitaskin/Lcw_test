
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TestSteps extends BaseTest{
    HomePage homePage;
    CategoryPage categoryPage;
    ProductPage productPage;
    BasketPage basketPage;

    @Test
    @Order(1)
    public void goToPage (){
        homePage = new HomePage(driver);
        homePage.acceptCookies();
        Assertions.assertTrue(homePage.isOnHomePage() , "Not on home page.");
    }

    @Test
    @Order(2)
    public void selectCategory (){
        categoryPage = new CategoryPage(driver);
        homePage.goToCategory();
        Assertions.assertTrue(categoryPage.isOnCategoryPage(),"Not on category page.");
    }

    @Test
    @Order(3)
    public void goToProductPage (){
        productPage = new ProductPage(driver);
        categoryPage.goToProduct(2);
        Assertions.assertTrue(productPage.isOnProductPage() , "Not on product page.");
    }

    @Test
    @Order(4)
    public void addToBasket (){
        productPage.addProductToBasket(1);
        Assertions.assertTrue(productPage.isCountUp(),"product count did not up!");

    }

    @Test
    @Order(5)
    public void goToBasketPage (){
        basketPage = new BasketPage(driver);
        productPage.goToBasket();
        Assertions.assertTrue(basketPage.isOnBasketPage(), "not on basket page");

    }

    @Test
    @Order(6)
    public void goToHomePage (){
        homePage.goToHome();
        Assertions.assertTrue(homePage.isOnHomePage() , "Not on home page");

    }
}
