package test.runner;


import org.junit.runner.RunWith;
import test.util.ExcelUtilPropio;
import cucumber.api.CucumberOptions;


@RunWith(RunPersonalizar.class)
//@CucumberOptions(features = { "src/test/resources/features" },  tags = {"@FinalizarAtencion"}, glue = { "test" })


public class RunRimac 
{
	
	@RunBefore
	public static void previo() {
	ExcelUtilPropio.getInstancia().escribirFeatures();
	}
// This class will be empty 
}