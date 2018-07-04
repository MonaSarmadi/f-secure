package com.f_secure.features;

import com.f_secure.Maximise;
import com.f_secure.tasks.OpenTheJobOpeningPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class WhenOpenTheJobOpeningPage {

    @Managed
    private WebDriver browser;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that (.*) has open the f secure job opening page$")
    public void thatMarkHasOpenTheFSecureJobOpeningPage(String actorName) {
        theActorCalled(actorName)
                .can(BrowseTheWeb.with(browser))
                .can(Maximise.driver(browser).toFullScreen())
                .attemptsTo(OpenTheJobOpeningPage.withAddressAlreadySet());
    }

    @After()
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            Serenity.takeScreenshot();
        }
    }
}
