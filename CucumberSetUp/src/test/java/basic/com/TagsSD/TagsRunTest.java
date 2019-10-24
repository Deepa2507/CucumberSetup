package basic.com.TagsSD;
	

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(
		
		monochrome=true,
		//dryRun=false,
		//tags= {"@Im  portant"},					//All the tags from FF
		tags= {"@Smoke"},						//Only smoke tag
		//tags= {"@Smoke","@Regression"},		//And Condition
		//tags= {"@Smoke,@Regression"},		//OR Condition
		features= {"src/test/resources/basic/com/TagsFF/"},		//location of feature file
		glue= {"basic/com/TagsSD/"},					//location of step definition file
				
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report10.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport10.html"}
				
		
		)							

public class TagsRunTest				
{		

}