package test.xpath;

public class XpathDetalleTipoAtencion {
	
	private static XpathDetalleTipoAtencion obj= null;
	
	public XpathDetalleTipoAtencion(){
		
	}

	public static XpathDetalleTipoAtencion getInstancia() {
		instanciar();
		return obj;
		
	}
	private synchronized static void instanciar() {
		if (obj == null) {
			obj = new XpathDetalleTipoAtencion();
		}
	}
	
	public final String lstTipoAtencion ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner/android.view.ViewGroup";
	
	public final String opcSpeed ="//*[@text='Speed']";
	public final String opcDenunciaPolicial ="//*[@text='Denuncia Policial']";
	public final String opcConsDanos ="//*[@text='Constatación de daños']";
	public final String opcDesistimiento ="//*[@text='Desistimiento']";
	
	
	public final String chkChoque ="//*[@text='Choque']"; //speed , Denuncia Policial
	public final String chkRoboPacial ="//*[@text='Robo parcial']"; //Denuncia Policial
	public final String chkRoboTotal ="//*[@text='Robo total']";//Speed , Denuncia Policial
	public final String chkOtros ="//*[@text='Otros']";//speed, Denuncia Policial
	
	public final String btnFinalizarAtencion ="//*[@text='Finalizar atención']";
	public final String btnAceptar ="//*[@text='ACEPTAR']";
//	Thread.sleep(30000);


}
