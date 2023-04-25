import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {
    WebDriverWait wait;
    WebElement element;
    protected WebDriver driver;
    Actions actions;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(By locator) {

        return driver.findElement(locator);
    }

    public void click(By locator){
        find(locator).click();
    }

    public boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

    public void hover (By locator){
        element = find(locator);
        actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }

    public void waitForVisibilityOfElement(By locator , int i){
        wait = new WebDriverWait(driver , i);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
