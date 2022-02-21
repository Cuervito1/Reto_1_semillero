package steps;

import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pageObjects.JuanregalaPages;
import utils.Excel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class JuanRegBusquedaStep {

    private void escribirMasEnter(By elemento, String texto){
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto, Keys.ENTER);
    }

    public static ArrayList<Map<String, String>> getLeerExcel() {
        return leerExcel;
    }

    private void limpiarTxt(By elemento){
        SeleniumWebDriver.driver.findElement(elemento).clear();
  }

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();

    @Step
    public void buscar(){
        try {
            leerExcel = Excel.leerXlsx("Busquedas.xlsx","Reto");
        }
        catch(IOException e){
        e.printStackTrace();
        }
        for (int i = 0; i < leerExcel.size(); i++) {
            escribirMasEnter(JuanregalaPages.getTxtBusqueda(), leerExcel.get(i).get("Busquedas"));
            limpiarTxt(JuanregalaPages.getTxtBusqueda());

        }

    }
}
