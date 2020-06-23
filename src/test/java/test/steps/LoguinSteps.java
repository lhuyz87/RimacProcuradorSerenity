package test.steps;


//import framework.utilities.CommonUtil;
//import framework.utilities.CucumberNewUtil;
//import framework.utilities.ExcelUtil;
//import test.pages.policy.*;
//import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import org.apache.poi.hssf.record.formula.functions.Product;
//import org.testng.Assert;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import test.pages.*;

public class LoguinSteps {
	
	LoginPage loginPage = new LoginPage();
	

    @Given("^accedo al sistema Rimac Procurador con ubicacion \"([^\"]*)\" cerca al cliente$")
    public void ingresamosRimacProcurador(String ubicacion) {
    	loginPage.accederRimacProcurador(ubicacion);
    	
    }

    @When("^ingreso usuario \"([^\"]*)\" y password \"([^\"]*)\"$")
    public void ingresarCrendeciales(String usuario, String password) {
    	loginPage.ingresarCredenciales(usuario, password);
        
    }
    
    @And("^selecciono opcion Ingresar$")
    public void seleccionarIngresar() {
    	loginPage.seleccionarIngresar();
        
    }

   
   
}
