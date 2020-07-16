package test.pages;
import test.util.PageObjectUtil;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.xpath.XpathDetalleTipoAtencion;
import test.xpath.XpathResumenCaso;
import net.serenitybdd.core.Serenity;
import test.pages.IngresarPlacaPage;

public class ConfirmarTipoAtencionPage extends LoginPage {
	
	
	private WebDriverWait wdw = null;
	private long wdwTimeOut = 300L;
	String AuxPlaca= IngresarPlacaPage.AuxPlaca;
	
	
	PageObjectUtil pageObjectUtil = new PageObjectUtil();
	XpathDetalleTipoAtencion xpathDetalleTipoAtencion  = new XpathDetalleTipoAtencion();
	XpathResumenCaso xpathResumenCaso = new XpathResumenCaso();
	
	protected WebDriverWait getWDW() {
		// return new WebDriverWait(getDriver(), wdwTimeOut, wdwPollingEvery);
		if (wdw == null) {
			// wdw = new WebDriverWait(getDriver(), 300L, 1L);
			wdw = new WebDriverWait(driver, wdwTimeOut, 1L);
		}

		return wdw;
	}
   
    public void selTipoAtencion(String tipoAtencion, String tipoSiniestro) {
    	
    	System.out.println("tipoAtencion  " +tipoAtencion + "tipoSiniestro   " +tipoSiniestro );
    	pageObjectUtil.sleep(4);
    	pageObjectUtil.tomarEvidencia(driver, AuxPlaca,"Confirmar Atencion");
    	pageObjectUtil.seleniumClickUntil(driver, getWDW() , xpathResumenCaso.btnConfirmarAtencion);
    	pageObjectUtil.sleep(2);
    	pageObjectUtil.seleniumClickUntil(driver, getWDW() , xpathDetalleTipoAtencion.lstTipoAtencion);
    	pageObjectUtil.sleep(2);

    	
    	if(tipoAtencion.compareTo("Speed")==0)
    	pageObjectUtil.seleniumClickUntil(driver, getWDW() , xpathDetalleTipoAtencion.opcSpeed);
    	if(tipoAtencion.compareTo("Denuncia Policial")==0)
    	pageObjectUtil.seleniumClickUntil(driver, getWDW() , xpathDetalleTipoAtencion.opcDenunciaPolicial);
    	if(tipoAtencion.contains("Cons")==true)
    	pageObjectUtil.seleniumClickUntil(driver, getWDW() , xpathDetalleTipoAtencion.opcConsDanos);
    	if(tipoAtencion.compareTo("Desistimiento")==0)
    	pageObjectUtil.seleniumClickUntil(driver, getWDW() , xpathDetalleTipoAtencion.opcDesistimiento);
    	pageObjectUtil.sleep(2);
    	
    	
    	if(tipoSiniestro.compareTo("Choque")==0)
    	pageObjectUtil.seleniumClickUntil(driver, getWDW() , xpathDetalleTipoAtencion.chkChoque);
    	if(tipoSiniestro.compareTo("Robo parcial")==0)
    	pageObjectUtil.seleniumClickUntil(driver, getWDW() , xpathDetalleTipoAtencion.chkRoboPacial);
    	if(tipoSiniestro.compareTo("Robo total")==0)
    	pageObjectUtil.seleniumClickUntil(driver, getWDW() , xpathDetalleTipoAtencion.chkRoboTotal);
    	if(tipoSiniestro.compareTo("Otros")==0)
    	pageObjectUtil.seleniumClickUntil(driver, getWDW() , xpathDetalleTipoAtencion.chkOtros);
    	pageObjectUtil.tomarEvidencia(driver, AuxPlaca,"TipoAtencion-Ocurrencia");
    	pageObjectUtil.sleep(2);

    	
   	
    }
    
    public void seleConfirmarAtencion() {
    	pageObjectUtil.sleep(2);
    	pageObjectUtil.seleniumClickUntil(driver, getWDW() , xpathDetalleTipoAtencion.btnFinalizarAtencion);
    	pageObjectUtil.tomarEvidencia(driver, AuxPlaca,"FinalizarAtencion");
    	pageObjectUtil.sleep(4);
    	pageObjectUtil.seleniumClickUntil(driver, getWDW() , xpathDetalleTipoAtencion.btnAceptar);
    	
    	
    
    }

    public void validarFinalizarCaso() {
    	
    	pageObjectUtil.tomarEvidencia(driver, AuxPlaca,"PantallaPrincipalFinalizado");
    	System.out.println("CASO TERMINADO");
    	pageObjectUtil.sleep(10);
    	driver.quit();
    }

}



