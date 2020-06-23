package test.xpath;

public class XpathLogin {
	
	private static XpathLogin obj= null;
	
	public XpathLogin(){
		
	}

	public static XpathLogin getInstancia() {
		instanciar();
		return obj;
		
	}
	private synchronized static void instanciar() {
		if (obj == null) {
			obj = new XpathLogin();
		}
	}
	
	public final String btnPermitirGPS ="//*[@text='ALLOW']";
	public final String txtUsuario ="//*[@text='Usuario']";
	public final String txtpassword ="//*[@text='Contraseña']";
	public final String btnIngresar ="//*[@text='Ingresar']";
	
	
//	Thread.sleep(30000);


}
