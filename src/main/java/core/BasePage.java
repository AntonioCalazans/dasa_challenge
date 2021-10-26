package core;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage extends Factory{

    public void mouseOver(WebElement element){
        Actions moveMouse = new Actions(getDriver());
        moveMouse.moveToElement(element).build().perform();
    }

    public void clickWebElement (WebElement element){
        element.click();
    }

    public void selectComboOption (WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void wait(WebElement element, int amountOfTimeInSeconds) {
        WebDriverWait wait = new WebDriverWait(getDriver(), amountOfTimeInSeconds);
        wait.until((ExpectedConditions.visibilityOf(element)));
    }

    public String getPageTitle() {
        return getDriver().getTitle();
    }

    public String getPageUrl(){
        return getDriver().getCurrentUrl();
    }

    public void quitBrowser() {
        getDriver().quit();
    }


}
