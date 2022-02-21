package steps;


import driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import pageObjects.JuanregalaPages;

public class JuanRegBusqBogotaStep {

    private void hacerClick(By elemento){
            SeleniumWebDriver.driver.findElement(elemento).click();
    }

    public void escoger(){
        hacerClick(JuanregalaPages.getBtnBusqBogota());
        hacerClick(JuanregalaPages.getBtnProdBogota());



    }

}
