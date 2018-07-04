package com.f_secure;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"classpath:features"},
                glue = {"com.f_secure.features"})
public class Runner {
}
