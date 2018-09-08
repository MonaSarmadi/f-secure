package com.f_secure.features.homePage;

import com.f_secure.HoverMouse;
import com.f_secure.Maximise;
import com.f_secure.model.homePage.ForHomeItems;
import com.f_secure.questions.generic_questions.IsDisplayed;
import static com.f_secure.ui.homePage.ForHomePhaseSection.FOR_HOME;
import static com.f_secure.ui.homePage.ForHomePhaseSection.forHomePhaseSection;
import com.f_secure.tasks.homePage.OpenTheHomePage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class WhenDragMouseOnForHomeItem {

    @Managed
    private WebDriver browser;

    @Given("^that (.*) has open the f secure Home page$")
    public void thatMonaHasOpenTheFSecureHomePage(String actorName) {
        theActorCalled(actorName)
                .can(BrowseTheWeb.with(browser))
                .can(Maximise.driver(browser).toFullScreen())
                .attemptsTo(OpenTheHomePage.withTheAddressAlreadySet());
    }

    @Then("^(.*) verify that For Home item is visible$")
    public void monaVerifyThatForHomeItemIsVisible(String actorName) {
        theActorCalled(actorName).should(seeThat(IsDisplayed.theElement(FOR_HOME)));
    }

    @When("^(.*) drag mouse pointer on For Home item$")
    public void monaDragMousePointerOnForHomeItem(String actorName){
        theActorCalled(actorName).attemptsTo(HoverMouse.over(FOR_HOME));
    }

    @Then("^(.*) see For Home items contain F-SECURE TOTAL , F-SECURE SAFE and FREEDOM VPN$")
    public void monaSeeForHomeItemsContainFSECURETOTALFSECURESAFEAndFREEDOMVPN(String actorName){
        theActorCalled(actorName).should(seeThat(IsDisplayed.theElement(forHomePhaseSection(ForHomeItems
                .F_SECURE_TOTAL))));
        theActorCalled(actorName).should(seeThat(IsDisplayed.theElement(forHomePhaseSection(ForHomeItems
                .F_SECURE_SAFE))));
        theActorCalled(actorName).should(seeThat(IsDisplayed.theElement(forHomePhaseSection(ForHomeItems
                .FREEDOM_VPN))));
    }
}
