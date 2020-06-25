package test.util;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import jcifs.smb.NtlmPasswordAuthentication;
import jcifs.smb.SmbException;
import jcifs.smb.SmbFile;

import org.apache.poi.ss.usermodel.Sheet;
import test.util.ExcelUtilPropio;
import test.util.Variables;
import test.util.Constantes;
import test.util.Inout;
import test.util.ExcelUtil;

public class LeedDataDriven implements Inout {

	private ExcelUtilPropio excelUtilPropio = ExcelUtilPropio.getInstancia();

	// singleton
	private static LeedDataDriven obj = null;

	private LeedDataDriven() {
	}

	public static LeedDataDriven getInstancia() {
		instanciar();
		return obj;
	}

	private synchronized static void instanciar() {
		if (obj == null) {
			obj = new LeedDataDriven();
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	// singleton

	@Override
	public List<List<String>> leerDD(String hoja) throws Exception {
		List<List<String>> data = new ArrayList<List<String>>();
		List<String> reg = null;
		List<String> cabecera = null;
		String usar = "";
		String res = "";
		System.out.println("HOJAS " + hoja);
		//Se comenta  para usar file remoto
//		File file = new File(Variables.file_01);
		
		//Codigo para manejo de archivo remoto
    	NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication(Variables.dominioDP, Variables.usuarioDP, Variables.passwordDP);
    	SmbFile dir=null;
    	System.out.println("*********** " + Variables.file_remota);
    	try {
			dir = new SmbFile(Variables.file_remota, auth);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
//	  	try {
//			for (SmbFile f : dir.listFiles())
//			{
//			    System.out.println("NAME " +f.getName());
//			}
//		} catch (SmbException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
    	File file = new File(dir.getUncPath());
    	System.out.println("*********** " + file);
    	System.out.println("*********** " + file.getAbsolutePath());
    	
		
		

		if (file.isFile()) {
			FileInputStream fileInputStream = new FileInputStream(file);
			Workbook workbook = WorkbookFactory.create(fileInputStream);
			Sheet sheet = !hoja.isEmpty() ? workbook.getSheet(hoja) : workbook.getSheetAt(0);
			int ultimaFilaAfectada = sheet.getLastRowNum();
			int ultimaColumanaAfectada= sheet.getRow(0).getLastCellNum();
//			System.out.println("NOMBRE DE HOJA " + hoja);
//			System.out.println("ULTIMA FILA " + ultimaFilaAfectada);
//			System.out.println("Columna Afectada " + ultimaColumanaAfectada);
			for (int i = 0; i <= ultimaFilaAfectada; i++) {
				usar = sheet.getRow(i).getCell(0, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
				reg = new ArrayList<String>();
				reg.add(String.valueOf(i));
				if (usar.toUpperCase().equals(Constantes.usar)||usar.compareToIgnoreCase("USAR")==0) {
					
//					System.out.println("ROW  " + i + "USAR:    " + usar);
					for(int j=1; j<ultimaColumanaAfectada;j++) {
//					System.out.println("columna  " + j);	
					reg.add(sheet.getRow(i).getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue());
				
					}
					data.add(reg);
				}else {}
				
			}	
				
			excelUtilPropio.cerrarIn(fileInputStream);
			excelUtilPropio.cerrarWb(workbook);
		}

		return data;
	}

	@Override
	public void escribirDD(List<String> listaString, String id) throws Exception {
	}

	@Override
	public void escribirDD(String string, String id) throws Exception {
	}

	@Override
	public void escribirNuevoDD(List<String> listaString, int dataDriven) throws Exception {
	}

	@Override
	public void escribirNuevoDD(String string, int dataDriven) throws Exception {
	}
}
