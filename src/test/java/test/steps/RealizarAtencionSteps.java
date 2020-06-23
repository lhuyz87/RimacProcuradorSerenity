package test.steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertEquals;

//import org.apache.poi.hssf.record.formula.functions.Product;
import org.testng.Assert;



import test.pages.ConfirmarTipoAtencionPage;

public class RealizarAtencionSteps{
	

	ConfirmarTipoAtencionPage confirmarTipoAtencionPage = new ConfirmarTipoAtencionPage();

    
    @And("^selecciono tipo de atencion \"([^\"]*)\" y tipo de siniestro \"([^\"]*)\"$")
    public void selConfirmarTipoAtencion(String tipoAtencion, String tipoSiniestro) {
    	confirmarTipoAtencionPage.selTipoAtencion(tipoAtencion,tipoSiniestro );
        
    }
    
    @And("^selecciono finalizar atencion$")
    public void seleFinalizarAtencion() {
    	confirmarTipoAtencionPage.seleConfirmarAtencion();
        
    }
    
    @Then("^se debe mostrar la pagina principal$")
    public void validarFinalizarCaso() {
    	confirmarTipoAtencionPage.validarFinalizarCaso();
        
    }

    

   
   
}
