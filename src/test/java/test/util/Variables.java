package test.util;

public class Variables {

	// CB
	public static final String cbUser = "";
	public static final String cbPass = "";

	// data driven y otros archivos
	private static final String res = "src/test/resources/dataDriven/";
//	private static final String ruta = res + System.getProperty("user.name") + "/";
	private static final String ruta = res + "dataPool" + "/";
	// vida ley activos
	public static final String file_01 = ruta + "DataPrueba.xlsx";
	public static final String h01 = "01-RegistrarAtencion";
	
	//Ruta remota data
	private static final String RutaRemota = "smb://lap-reta/DataPool/RimacProcurador/";
	public static final String file_remota = RutaRemota + "DataPruebaMobile.xlsx";
	
	
	//ruta retota APK
	public static final String rutaApk = "smb://lap-jenkins/apps/app-release.apk";
	
	//credenciales
	
	public static final String dominio ="lap-jenkins"; 
	public static final String usuario = "administrador"; 
	public static final String password = "Lhuyz666"; 
	
	public static final String dominioDP ="lap-jenkins"; 
	public static final String usuarioDP = "administrador"; 
	public static final String passwordDP = "Lhuyz666"; 
	
	
}