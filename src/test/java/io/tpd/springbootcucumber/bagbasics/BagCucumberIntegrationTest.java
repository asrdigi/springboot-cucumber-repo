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
@CucumberOptions(plugin = { "html:target/cucumber-html-report",
        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" },
        features = { "src/test/resources/features/bagbasics" },
        glue = { "io.tpd.springbootcucumber.bagbasics" })
public class BagCucumberIntegrationTest {
}