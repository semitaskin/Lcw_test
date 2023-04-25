import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage{

    By isOnBasketLocator = By.xpath("//span[contains(@class,'keep-shopping-label') and text()='Alışverişe Devam Et']");

    public BasketPage(WebDriver driver) {
        super(driver);
    }
    /**
     * Is on basket page
     *
     * @return boolean
     */
    public  boolean isOnBasketPage() {
        waitForVisibilityOfElement(isOnBasketLocator,2);
        return isDisplayed(isOnBasketLocator);
    }


}
