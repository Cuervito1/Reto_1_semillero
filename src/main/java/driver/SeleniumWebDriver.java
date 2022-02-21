package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumWebDriver {
    public static WebDriver driver;
    public static void chromeDrive(String url){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");              // abrir maximizada la ventana
        options.addArguments("--ignore-certificate-errors");    //ignora alertas o mensajes emergentes
        options.addArguments("--disable-infobars");             //ignora alertas o mensajes emergentes
        options.addArguments("--incognito");                    // navegar en incognito

        driver = new ChromeDriver(options);                     //Para tomar las opciones del navegador
        driver.get(url);                                        //Especificar la url donde se va a navegar
    }
}
