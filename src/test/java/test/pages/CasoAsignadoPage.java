package test.pages;
import test.util.PageObjectUtil;
import net.serenitybdd.core.Serenity;
import test.pages.IngresarPlacaPage;

import java.net.URL;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.xpath.XpathAsignacionCaso;

public class CasoAsignadoPage extends LoginPage {
	
	
	private WebDriverWait wdw = null;
	private long wdwTimeOut = 300L;
	String AuxPlaca= IngresarPlacaPage.AuxPlaca;
	PageObjectUtil pageObjectUtil = new PageObjectUtil();
	XpathAsignacionCaso xpathAsignacionCaso  = new XpathAsignacionCaso();

	
	protected WebDriverWait getWDW() {
		if (wdw == null) {
			wdw = new WebDriverWait(driver, wdwTimeOut, 1L);
		}

		return wdw;
	}
   
    public void seleccionarVerMapa() {
    	pageObjectUtil.sleep(5);
    	pageObjectUtil.seleniumClickUntil(driver, getWDW() , xpathAsignacionCaso.btnVerMapa);
    	pageObjectUtil.tomarEvidencia(driver, AuxPlaca,"VerMapa");
    }
}
