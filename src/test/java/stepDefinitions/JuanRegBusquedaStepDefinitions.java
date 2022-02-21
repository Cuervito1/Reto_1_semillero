package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import steps.JuanRegBusquedaStep;

public class JuanRegBusquedaStepDefinitions {

    @Steps
    JuanRegBusquedaStep busquedaStep = new JuanRegBusquedaStep();

    @Given("^que me encuentro en el buscador de JuanRegala$")
    public void queMeEncuentroEnElBuscadorDeJuanRegala() {
        SeleniumWebDriver.chromeDrive("https://juanregala.com.co/");

    }

    @When("^llamo los datos de mi archivo Excel$")
    public void llamoLosDatosDeMiArchivoExcel() {
        busquedaStep.buscar();

    }

    @Then("^realiza la busqueda y muestra resultados$")
    public void realizaLaBusquedaYMuestraResultados() {

    }
}
