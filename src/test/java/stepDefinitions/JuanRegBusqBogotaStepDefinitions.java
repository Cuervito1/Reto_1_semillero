package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import steps.JuanRegBusqBogotaStep;

public class JuanRegBusqBogotaStepDefinitions {

    @Steps
    JuanRegBusqBogotaStep BusqBogotaStep = new JuanRegBusqBogotaStep();

    @Given("^me encuentro en la tienda virtual en los productos de Bogota$")
    public void meEncuentroEnLaTiendaVirtualEnLosProductosDeBogota() {
        SeleniumWebDriver.chromeDrive("https://juanregala.com.co/");

    }

    @When("^Hago click el producto de la tienda virtual$")
    public void hagoClickElProductoDeLaTiendaVirtual() {
        BusqBogotaStep.escoger();

    }

    @Then("^me muestra la descripcion del producto$")
    public void meMuestraLaDescripcionDelProducto() {

    }
}
