package stepDefinition;

import core.BasePage;
import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pageObject.DasaPage;
import pageObject.NossasMarcasPage;

import java.util.ArrayList;

import static core.Factory.getDriver;
import static org.testng.Assert.assertEquals;

public class DasaPageSteps extends BasePage {

    private DasaPage dasa;
    private NossasMarcasPage marcasLab;


    public DasaPageSteps(){
        super();
        dasa = new DasaPage();
        marcasLab = new NossasMarcasPage();
    }

    @Dado("^Eu abro o Browser e navego para Dasa website$")
    public void abrirBrowser() {
        getDriver().get("https://dasa.com.br/");
    }

    @Entao("^Eu checo se o site esta acessível$")
    public void verificarSiteAcessivel () {
        assertEquals(getPageTitle(), "Dasa - A maior rede de Saúde Integrada" );
    }

    @Quando("^Eu navego para menu Somos Dasa e opcao Nossas Marcas$")
    public void navegacaoPeloMenu ()  {
        wait(dasa.getMenuLink(), 10000);
        mouseOver(dasa.getMenuLink());
        clickWebElement(dasa.getClickNossaMarcaLink());
    }

    @Entao("^Eu listo os laboratorios de Sao Paulo$")
    public void listarLaboratorio () {
        wait(marcasLab.getNossasMarcasLink(), 10000);
        selectComboOption(marcasLab.getLocationComboLink(),"São Paulo");
        System.out.println("**Lista de Laboratorios**");
        for (WebElement labs : marcasLab.getListarLab()) {
            System.out.println(labs.getAttribute("href"));
        }
    }

    @Entao("^Eu clico no laboratorio DelboniAuriemo$")
    public void clicarLab () {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", marcasLab.getMoverElement());
        clickWebElement(marcasLab.getLabLink());
    }

    @Quando("^Eu valido o acesso a area do laboratorio")
    public void acessarAreaLab () {
        ArrayList<String> acessarLaboratorio = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(acessarLaboratorio.get(1));
        assertEquals(getPageUrl(),"https://delboniauriemo.com.br/");
        quitBrowser();
    }

}
