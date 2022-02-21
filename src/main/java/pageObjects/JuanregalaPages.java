package pageObjects;

import org.openqa.selenium.By;

public class JuanregalaPages {
    private static By btnlinkproducto = By.linkText("Detalle Para Festejar");
    private static By txtBusqueda = By.xpath("//input[@id='woocommerce-product-search-field-0']");
    private static By btnBusqBogota = By.xpath("//a[@href='https://juanregala.com.co/bogota/' and @class='nav-top-link']");
    private static By btnProdBogota = By.linkText("Desayuno Consentidor");
    private static By lblBusqtexto = By.xpath("//p[contains(string(),'Llamativo Para Disfrutar En Compañía Especial.')]");


    public static By getLblBusqtexto() {
        return lblBusqtexto;
    }

    public static By getBtnBusqBogota() { return btnBusqBogota; }


    public static By getTxtBusqueda() {
        return txtBusqueda;
    }


    public static By getBtnProdBogota() { return btnProdBogota;
    }

    public static By getBtnlinkproducto() {
        return btnlinkproducto;
    }
}
