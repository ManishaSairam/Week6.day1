package runner;

	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;
	import io.cucumber.testng.CucumberOptions.SnippetType;

	@CucumberOptions(features = "src/main/java/feature", glue = "step", monochrome = true, dryRun = false, snippets = SnippetType.CAMELCASE, publish = true)
	public class Runner extends AbstractTestNGCucumberTests
	{
		
	}


