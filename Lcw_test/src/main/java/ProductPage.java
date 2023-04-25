import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{

    By addProductToBasketLocator = By.id("pd_add_to_cart");
    By basketLocator = By.xpath("//span[contains(@class,'dropdown-label')and text()='Sepetim']");
    By basketCountLocator = By.cssSelector(".badge-circle");
    By productSizeLocator = By.xpath("//a[not(contains(@class,'disabled')) and @data-tracking-label='BedenSecenekleri']");

    public ProductPage(WebDriver driver) {
        super(driver);
    }
    /**
     * Add product to basket
     */
    public void addProductToBasket(int i) {
        driver.navigate().refresh();
        driver.navigate().refresh();
        findAll(productSizeLocator).get(i).click();
        click(addProductToBasketLocator);
    }
    /**
     * Go to basket
     */
    public void goToBasket() {
        click(basketLocator);
    }
    /**
     * Is on product page
     *
     * @return boolean
     */
    public boolean isOnProductPage() {
        return isDisplayed(addProductToBasketLocator);
    }
    /**
     * Is basket count up
     *
     * @return boolean
     */
    public boolean isCountUp() {
        return getBasketCount() > 0;
    }
    /**
     * Get basket count
     *
     * @return int
     */
    private int getBasketCount(){
        waitForVisibilityOfElement(basketCountLocator,2);
        String count = find(basketCountLocator).getText();
        return Integer.parseInt(count);
    }
}
