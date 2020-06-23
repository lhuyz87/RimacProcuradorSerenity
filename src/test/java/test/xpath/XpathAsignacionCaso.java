package test.xpath;

public class XpathAsignacionCaso {
	
	private static XpathAsignacionCaso obj= null;
	
	public XpathAsignacionCaso(){
		
	}

	public static XpathAsignacionCaso getInstancia() {
		instanciar();
		return obj;
		
	}
	private synchronized static void instanciar() {
		if (obj == null) {
			obj = new XpathAsignacionCaso();
		}
	}
	
	public final String btnVerMapa ="//*[@text='Ver mapa']";

	
//	Thread.sleep(30000);


}
