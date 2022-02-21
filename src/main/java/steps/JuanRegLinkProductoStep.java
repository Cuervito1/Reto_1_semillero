package steps;

import driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import pageObjects.JuanregalaPages;

import static org.junit.Assert.assertEquals;

public class JuanRegLinkProductoStep {

    private void darClick(By elemento){
        SeleniumWebDriver.driver.findElement(elemento).click();
    }

    public void seleccionar(){
        darClick(JuanregalaPages.getBtnlinkproducto());
    }
    private String obtenerTexto(By elemento){
        return SeleniumWebDriver.driver.findElement(elemento).getText();
    }
    public void validarTexto(By elemento, String texto){
        assertEquals(obtenerTexto(elemento),texto);
    }

}
