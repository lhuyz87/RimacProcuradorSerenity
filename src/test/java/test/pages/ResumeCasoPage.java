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
		// return new WebDriverWait(getDriver(), wdwTimeOut, wdwPollingEvery);
		if (wdw == null) {
			// wdw = new WebDriverWait(getDriver(), 300L, 1L);
			wdw = new WebDriverWait(driver2, wdwTimeOut, 1L);
		}

		return wdw;
	}
   
    public void selConfirmarTipoAtencion() {
    	pageObjectUtil.sleep(4);
    	pageObjectUtil.seleniumClickUntil(driver2, getWDW() , xpathResumenCaso.btnConfirmarAtencion);
    	Serenity.takeScreenshot();
    }
}
