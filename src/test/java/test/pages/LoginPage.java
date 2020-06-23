package test.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import test.util.PageObjectUtil;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.xpath.XpathLogin;
import net.serenitybdd.core.pages.*;

public class LoginPage  extends PageObject{
	
//	public static AndroidDriver driver2;
	private WebDriverWait wdw = null;
	private long wdwTimeOut = 300L;
	protected AppiumDriver driver2;
	
	PageObjectUtil pageObjectUtil = new PageObjectUtil();
	XpathLogin xpathLogin  = new XpathLogin();



    public void accederRimacProcurador(String ubicacion) {
		
    	String coordenada[] = ubicacion.split(",");
    	coordenada[0] = coordenada[0].trim();
    	coordenada[1] = coordenada[1].trim();
    	File appDir = new File("src/test/resources/apps/app-release.apk");
   	try {
			System.out.println("Inicia la construccion");
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("usePrebuiltWDA", true);
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung Galaxy S10");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 7200);
		caps.setCapability(MobileCapabilityType.NO_RESET, false);
		caps.setCapability(MobileCapabilityType.FULL_RESET, true);
		caps.setCapability(MobileCapabilityType.APP, appDir.getAbsolutePath());
		caps.setCapability("appPackage","pe.com.rimac.geo.procurador");
		caps.setCapability("appActivity","pe.com.rimac.geo.procurador.Action.LoginActivity");
		caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
		
		System.out.println(" URL");
		URL url = new URL("http://192.168.1.13:4723/wd/hub");
		System.out.println(" INICIA DRIVER");
		
//		driver = new AppiumDriver<MobileElement>(url, caps);
//		driver2= new AndroidDriver(url, caps);
		driver2=  new AppiumDriver(url, caps);
		double longitud=Double.parseDouble(coordenada[0]);
		double latitud=-Double.parseDouble(coordenada[1])*-1;
		System.out.println(" longitud  " + longitud);
		System.out.println(" latitud  " + latitud);
		
		Location loc = new Location(longitud, latitud, 0);
		driver2.setLocation(loc);
//		driver.resetApp();

		}catch (Exception e) {
			System.out.println("Cause is: "  + e.getCause());
			System.out.println("Cause is: "  + e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}

    }
    
	protected WebDriverWait getWDW() {
		// return new WebDriverWait(getDriver(), wdwTimeOut, wdwPollingEvery);
		if (wdw == null) {
			// wdw = new WebDriverWait(getDriver(), 300L, 1L);
			wdw = new WebDriverWait(driver2, wdwTimeOut, 1L);
		}

		return wdw;
	}
    
    public void ingresarCredenciales(String usuario, String password) {
    	

		pageObjectUtil.seleniumEscribirUntil(driver2, getWDW() , xpathLogin.txtUsuario,usuario,null);
		pageObjectUtil.seleniumEscribirUntil(driver2, getWDW() , xpathLogin.txtpassword,password,null);
	
    	
    }
    
    public void seleccionarIngresar() {
    	pageObjectUtil.seleniumClickUntil(driver2, getWDW() , xpathLogin.btnIngresar);
    }
}
