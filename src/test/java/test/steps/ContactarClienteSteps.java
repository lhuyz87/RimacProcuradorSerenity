package test.steps;


//import framework.config.Settings;
//import framework.utilities.CommonUtil;
//import framework.utilities.CucumberNewUtil;
//import framework.utilities.ExcelUtil;
//import test.pages.policy.*;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertEquals;

//import org.apache.poi.hssf.record.formula.functions.Product;
import org.testng.Assert;


import test.pages.CasoAsignadoPage;
import test.pages.IngresarPlacaPage;

public class ContactarClienteSteps{
	
	CasoAsignadoPage casoAsignadoPage = new CasoAsignadoPage();
	IngresarPlacaPage ingresarPlacaPage = new IngresarPlacaPage();

    
    @And("^selecciono opcion Ver Mapa$")
    public void seleccionarMapa() {
    	casoAsignadoPage.seleccionarVerMapa();
        
    }
    
    @And("^ingreso el ultimo digito de la placa \"([^\"]*)\"$")
    public void ingresarUltimoDigito(String placa) {
    	ingresarPlacaPage.ingresarUltimoDigito(placa);
    }
    
    @And("^selecciono opcion Confirmar$")
    public void seleccionarContactar() {
    	ingresarPlacaPage.seleccionarContactar();
    }
    
    @And("^selecciono Aceptar$")
    public void seleccionarAceptar() {
    	ingresarPlacaPage.seleccionarAceptar();
    }
    
    @Then("^se debe mostrar mensaje \"([^\"]*)\" satisfactorio$")
    public void validarMensaje(String mensaje) {
    	String mensajeObtenido = ingresarPlacaPage.validarMensaje(mensaje);
//    	assertEquals(mensaje,mensajeObtenido);
    }
    
    

   
   
}
