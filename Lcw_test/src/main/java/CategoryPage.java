import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage extends BasePage{

    By isOnCategoryLocator = By.id("svg_1");
    By productLocator = By.cssSelector(".product-card__title");

    public CategoryPage(WebDriver driver) {
        super(driver);
    }
    /**
     * Go to product
     */
    public void goToProduct(int i){
        findAll(productLocator).get(i).click();
    }
    /**
     * Go to product
     *
     * @return boolean
     */
    public boolean isOnCategoryPage() {
        return isDisplayed(isOnCategoryLocator);
    }
}
