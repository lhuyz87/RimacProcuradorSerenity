package test.pages;


import test.util.PageObjectUtil;
import net.serenitybdd.core.Serenity;

import org.openqa.selenium.support.ui.WebDriverWait;
import test.xpath.XpathResumenCaso;

public class ResumeCasoPage extends LoginPage {
	
	
	private WebDriverWait wdw = null;
	private long wdwTimeOut = 300L;
	
	PageObjectUtil pageObjectUtil = new PageObjectUtil();
	XpathResumenCaso xpathResumenCaso  = new XpathResumenCaso();

	
	protected WebDriverWait getWDW() {
		if (wdw == null) {
			wdw = new WebDriverWait(driver, wdwTimeOut, 1L);
		}

		return wdw;
	}
   
    public void selConfirmarTipoAtencion() {
    	pageObjectUtil.sleep(4);
    	pageObjectUtil.seleniumClickUntil(driver, getWDW() , xpathResumenCaso.btnConfirmarAtencion);
    	Serenity.takeScreenshot();
    }
}
