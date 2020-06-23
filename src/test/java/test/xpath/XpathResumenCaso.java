package test.xpath;

public class XpathResumenCaso {
	
	private static XpathResumenCaso obj= null;
	
	public XpathResumenCaso(){
		
	}

	public static XpathResumenCaso getInstancia() {
		instanciar();
		return obj;
		
	}
	private synchronized static void instanciar() {
		if (obj == null) {
			obj = new XpathResumenCaso();
		}
	}
	
	public final String btnConfirmarAtencion ="//*[@text='Confirmar tipo de atención']";

	
//	Thread.sleep(30000);


}
