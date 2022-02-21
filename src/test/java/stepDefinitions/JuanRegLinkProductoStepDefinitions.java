package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import pageObjects.JuanregalaPages;
import steps.JuanRegLinkProductoStep;

public class JuanRegLinkProductoStepDefinitions {

    @Steps
    JuanRegLinkProductoStep linkProductoStep = new JuanRegLinkProductoStep();

    @Given("^quiero escoger un producto de la tienda virtual$")
    public void quieroEscogerUnProductoDeLaTiendaVirtual() {
        SeleniumWebDriver.chromeDrive("https://juanregala.com.co/");

    }

    @When("^Realizo click el producto de la tienda virtual$")
    public void realizoClickElProductoDeLaTiendaVirtual() {
        linkProductoStep.seleccionar();

    }

    @Then("^me muestra los resultados o descripcion del producto$")
    public void meMuestraLosResultadosODescripcionDelProducto() {
        linkProductoStep.validarTexto(JuanregalaPages.getLblBusqtexto(),"Llamativo Para Disfrutar En Compañía Especial.");
    }
}
