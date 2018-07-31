package com.f_secure;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"classpath:features"}, format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
                glue = {"com.f_secure.features"})
public class Runner {
}
