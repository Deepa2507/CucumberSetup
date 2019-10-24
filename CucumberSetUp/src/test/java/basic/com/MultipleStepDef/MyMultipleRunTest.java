package basic.com.MultipleStepDef;
	

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(
		
		monochrome=true,
		//dryRun=false,
		
		features= {"src/test/resources/basic/com/MultipleFeatureFile/"},		//location of feature file
		glue= {"basic/com/MultipleStepDef/"},					//location of step definition file
				
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report6.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport6.html"}
		
		)							

public class MyMultipleRunTest				
{		

}