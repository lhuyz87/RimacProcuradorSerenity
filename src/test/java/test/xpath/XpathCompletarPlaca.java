package test.xpath;

public class XpathCompletarPlaca {
	
	private static XpathCompletarPlaca obj= null;
	
	public XpathCompletarPlaca(){
		
	}

	public static XpathCompletarPlaca getInstancia() {
		instanciar();
		return obj;
		
	}
	private synchronized static void instanciar() {
		if (obj == null) {
			obj = new XpathCompletarPlaca();
		}
	}
	

	public final String txtUltimoDigPlaca ="//*[@resource-id='pe.com.rimac.geo.procurador:id/placa6']";
	public final String btnContactar ="//*[@text='Contactar']";
	public final String btnAceptar ="//*[@text='ACEPTAR']";
	public final String msjContactado ="//*[@text='El proceso terminó correctamente.']";

	
	
//	Thread.sleep(30000);


}
