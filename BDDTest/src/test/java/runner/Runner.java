package runner;

import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;

//@RunWith(Cucumber.class)
//@CucumberOptions(tags="@sample", format= {"pretty","html:reoprts"}, features= {"C:\\SeleniumWorkspace\\BDDTest\\src\\test\\resources\\Feature"}, glue= {"testCases"})

@RunWith(ExtendedCucumber.class)

@CucumberOptions(
        features = {"C:\\SeleniumWorkspace\\BDDTest\\src\\test\\resources\\Feature"},
        tags = {"@sample"},
        glue = {"testCases"}, 
        plugin = {"html:target/81", "json:target/81/cucumber.json","pretty:target/81/cucumber-pretty.txt","usage:target/81/cucumber-usage.json", "junit:target/81/cucumber-results.xml" })

@ExtendedCucumberOptions(
        jsonReport = "target/81/cucumber.json",
        jsonUsageReport = "target/81/cucumber-usage.json",
        usageReport = true,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        overviewChartsReport = true,
        pdfPageSize = "A4 Landscape",
        toPDF = true,
        outputFolder = "target/81",
        retryCount = 0)

public class Runner {

}
