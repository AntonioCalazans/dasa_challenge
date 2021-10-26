package pageObject;

import core.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class DasaPage extends Util {


    public DasaPage(){
        PageFactory.initElements(driver,this);
    }


    @FindBy(how = How.XPATH, using = "//a[@title='Somos Dasa']")
    private WebElement menuLink;


    @FindBy(how = How.LINK_TEXT, using = "Nossas Marcas")
    private WebElement clickNossaMarcaLink;

    public WebElement getMenuLink(){
        return this.menuLink;
    }

    public WebElement getClickNossaMarcaLink()  {
        return this.clickNossaMarcaLink;
    }

}

