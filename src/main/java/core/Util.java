package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import static core.Factory.getDriver;
import static core.Factory.killDriver;

public class Util extends BasePage{

    protected WebDriver driver;
    protected WebDriverWait wait = new WebDriverWait(getDriver(), 30);

    public Util(){
        this.driver = getDriver();
    }

    public static void closeDriver(){
        killDriver();
    }
}
