package com.f_secure.features;

import com.f_secure.HoverMouse;
import com.f_secure.model.ForBusinessItems;
import com.f_secure.questions.generic_questions.IsDisplayed;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static com.f_secure.ui.ForBusinessPhaseSection.FOR_Business;
import static com.f_secure.ui.ForBusinessPhaseSection.forBusinessPhaseSection;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class WhenDragMouseOnForBusinessItem {

    @Managed
    private WebDriver browser;

    @Then("^(.*) verify that For BUSINESS item is visible$")
    public void monaVerifyThatForBUSINESSItemIsVisible(String actorName){
        theActorCalled(actorName).should(seeThat(IsDisplayed.theElement(FOR_Business)));

    }

    @When("^(.*) drag mouse pointer on For BUSINESS item$")
    public void monaDragMousePointerOnForBUSINESSItem(String actorName){
        theActorCalled(actorName).attemptsTo(HoverMouse.over(FOR_Business));

    }

    @Then("^(.*) should only see items containing 'Protection Service for Business', " +
            "'F Secure Rapid Detection & Response Service' and 'F-Secure Rapid Detection & Response'$")
    public void monaShouldOnlySeeItemsInForBusiness(String actorName){
        theActorCalled(actorName).should(seeThat(IsDisplayed.theElement(forBusinessPhaseSection(ForBusinessItems
                .Protection_Service_for_Business))));
        theActorCalled(actorName).should(seeThat(IsDisplayed.theElement(forBusinessPhaseSection(ForBusinessItems
                .F_Secure_Rapid_DetectionResponse_Service))));
        theActorCalled(actorName).should(seeThat(IsDisplayed.theElement(forBusinessPhaseSection(ForBusinessItems
                .F_Secure_Rapid_DetectionResponse))));
    }
}
