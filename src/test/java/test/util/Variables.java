package test.util;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Variables {

	
	//NombreArchivoDP
	public static final String archivoDP= "DataPruebaMobile";
	// CB
	public static final String cbUser = "";
	public static final String cbPass = "";

	// data driven y otros archivos
	private static final String res = "src/test/resources/dataDriven/";
	private static final String ruta = res + "dataPool" + "/";
	// vida ley activos
	public static final String file_01 = ruta + archivoDP.concat(".xlsx");
	public static final String h01 = "01-RegistrarAtencion";
	

	//Capabilities de la aplicación
	
	public static final String platName = "Android";
	public static final String platVersion = "9";
	public static final String devName = "Samsung Galaxy S10";
	public static final String appPackage = "pe.com.rimac.geo.procurador";
	public static final String appActivity = "pe.com.rimac.geo.procurador.Action.LoginActivity";
	
	
	//Servidor APPIUM
	
	public static final String serAppium= "http://192.168.1.9:4723/wd/hub";
	
	
	//Ruta remota data
//	public static final String RutaRemota = "smb://172.26.40.137/DataPuebaAutomatizacion/Proy_RimacProcurador/dataPool/";
//	public static final String file_remota = RutaRemota + archivoDP.concat(".xlsx");

	
	//ruta remota APK
//	public static final String rutaApk = "smb://172.26.40.137/DataPuebaAutomatizacion/Proy_RimacProcurador/Recursos/app-release.apk";
//	public static final String testrutaApk = "smb://172.26.40.137/DataPuebaAutomatizacion/Proy_RimacProcurador/Recursos/";
	
	
	//Ruta remota data lap reta
	public static final String RutaRemota = "smb://lap-jenkins/RimacProcurador/dataPool/";
	public static final String file_remota = RutaRemota + archivoDP.concat(".xlsx");

//	ruta remota APK lap reta
	public static final String rutaApk = "smb://lap-jenkins/RimacProcurador/apps/app-release.apk";
	public static final String testrutaApk = "smb://lap-jenkins/apps/";
	
	
//	dataeEvidencia
	public static final String rutaEvidencia = "src/evidencias/";
	
	
	//credenciales
	
//	public static final String dominio ="rimac"; 
//	public static final String usuario = "lperaltq"; 
//	public static final String password = "Sistemas2042."; 
//	
//	public static final String dominioDP ="rimac"; 
//	public static final String usuarioDP = "lperaltq"; 
//	public static final String passwordDP = "Sistemas2042."; 
	
	
	
	//credenciales lap reta
	
	public static final String dominio ="lap-jenkins"; 
	public static final String usuario = "administrador"; 
	public static final String password = "Lhuyz666"; 
	
	public static final String dominioDP ="lap-jenkins"; 
	public static final String usuarioDP = "administrador"; 
	public static final String passwordDP = "Lhuyz666"; 
}