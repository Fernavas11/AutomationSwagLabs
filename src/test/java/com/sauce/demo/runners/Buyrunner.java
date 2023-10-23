package com.sauce.demo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Buy.feature",
        glue = "com.sauce.demo.definitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = ""
)
public class Buyrunner {
}
