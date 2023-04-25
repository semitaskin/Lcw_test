import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    By goToHomeLocator = By.cssSelector(".main-header-logo path:nth-child(2)");
    By isOnHomeLocator = By.className("abc");
    By categoryLocator = By.xpath("//a[contains(@href,'/tr-TR/TR/etiket/polo-yaka-tisort-erkek')]");
    By actionStepLocator = By.xpath("//a[contains(@class,'menu-header-item__title') and text()='ERKEK']");
    By cookiesLocator = By.xpath("//*[@id=\"cookieseal-banner\"]/div/button[3]");

    public HomePage(WebDriver driver) {
        super(driver);
    }
    /**
     * Go to category
     */
    public void goToCategory() {
        hover(actionStepLocator);
        waitForVisibilityOfElement(categoryLocator , 2);
        click(categoryLocator);
    }
    /**
     * Go to home
     */
    public void goToHome() {
        click(goToHomeLocator);
    }
    /**
     * Is on home page
     *
     * @return boolean
     */
    public boolean isOnHomePage (){
        waitForVisibilityOfElement(isOnHomeLocator,2);
        return isDisplayed(isOnHomeLocator);
    }
    /**
     * Accept cookies
     */
    public void acceptCookies(){
        click(cookiesLocator);
    }

}
