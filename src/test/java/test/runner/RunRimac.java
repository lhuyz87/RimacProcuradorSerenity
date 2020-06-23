package test.runner;

import org.junit.Test;
import org.junit.runner.RunWith;
import test.util.ExcelUtilPropio;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(RunPersonalizar.class)
//@CucumberOptions(features = { "src/test/resources/features/" },  tags = {"@FinalizarAtencion"}, glue = { "rimac" })


public class RunRimac 
{
	
	@RunBefore
	public static void previo() {
	ExcelUtilPropio.getInstancia().escribirFeatures();
	}
// This class will be empty 
}