package io.tpd.springbootcucumber.bagbasics;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
//@CucumberOptions(
//		features = "src/test/resources/features/bagbasics",        
//        glue = {"io.tpd.springbootcucumber.bagbasics"},
//        plugin = ("json:target/cucumber-reports/cucumber-test-report.json"),
//        monochrome= true,
//        dryRun= false
//		)
//public class BagCucumberIntegrationTest {
//}





@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/bagbasics",
		glue= {"io.tpd.springbootcucumber.bagbasics"},		
		plugin = { "pretty", "json:target/cucumber-reports/cucumber.json",
						"junit:target/cucumber-reports/cucumber.xml",
						"html:target/cucumber-reports"},
		monochrome = true
	)
public class BagCucumberIntegrationTest {
}