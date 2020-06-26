package test.util;

public class Variables {

	
	//NombreArchivoDP
	public static final String archivoDP= "DataPruebaMobile";
	// CB
	public static final String cbUser = "";
	public static final String cbPass = "";

	// data driven y otros archivos
	private static final String res = "src/test/resources/dataDriven/";
//	private static final String ruta = res + System.getProperty("user.name") + "/";
	private static final String ruta = res + "dataPool" + "/";
	// vida ley activos
	public static final String file_01 = ruta + archivoDP.concat(".xlsx");
	public static final String h01 = "01-RegistrarAtencion";
	
	
	
	//Ruta remota data
	public static final String RutaRemota = "smb://192.168.1.13/DataPool/RimacProcurador/";
	public static final String file_remota = RutaRemota + archivoDP.concat(".xlsx");
	
	
	//ruta retota APK
	public static final String rutaApk = "smb://lap-jenkins/apps/app-release.apk";
	
	//credenciales
	
	public static final String dominio ="lap-jenkins"; 
	public static final String usuario = "administrador"; 
	public static final String password = "Lhuyz666"; 
	
	public static final String dominioDP ="192.168.1.13"; 
	public static final String usuarioDP = "RimacJenkins"; 
	public static final String passwordDP = "Rimac2020."; 
	
	
}