package test.pages;
import test.util.PageObjectUtil;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.xpath.*;

public class IngresarPlacaPage extends LoginPage {
	
	
	private WebDriverWait wdw = null;
	private long wdwTimeOut = 300L;
	static String AuxPlaca="";
	
	PageObjectUtil pageObjectUtil = new PageObjectUtil();
	XpathCompletarPlaca xpathCompletarPlaca  = new XpathCompletarPlaca();
	
	
	protected WebDriverWait getWDW() {
		// return new WebDriverWait(getDriver(), wdwTimeOut, wdwPollingEvery);
		if (wdw == null) {
			// wdw = new WebDriverWait(getDriver(), 300L, 1L);
			wdw = new WebDriverWait(driver, wdwTimeOut, 1L);
		}

		return wdw;
	}
   
    public void ingresarUltimoDigito(String placa) {
    	AuxPlaca=placa;
    	pageObjectUtil.seleniumEscribirUntil(driver, getWDW() , xpathCompletarPlaca.txtUltimoDigPlaca, placa.substring(5,6),  null);
    	pageObjectUtil.tomarEvidencia(driver, AuxPlaca,"PlacaIngresada");
    }
    
    public void seleccionarContactar() {
    	pageObjectUtil.seleniumClickUntil(driver, getWDW(), xpathCompletarPlaca.btnContactar);
    	pageObjectUtil.tomarEvidencia(driver, AuxPlaca, "Contactar");
    }
    
    public void seleccionarAceptar() {
    	pageObjectUtil.seleniumClickUntil(driver, getWDW(), xpathCompletarPlaca.btnAceptar);
    }
    
    
    public String validarMensaje(String mensaje) {
    	
    
    	pageObjectUtil.tomarEvidencia(driver, AuxPlaca, "Contactado");
      	
    	String mensajeObtenido= "El proceso terminó correctamente.";
    	pageObjectUtil.sleep(5);
    	driver.quit();
    	return mensajeObtenido;
    }
}
