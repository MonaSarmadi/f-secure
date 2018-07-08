package com.f_secure.features;

import com.f_secure.questions.dropdown.DropDownMenu;
import cucumber.api.java.en.Given;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class WhenFindQualityEngineerJobTitle {

    @Given("^(.*) verify poznan from drop down menu is visible$")
    public void shouldVerifyPoznanFromDropDownMenuIsVisible(String actorName){
        theActorCalled(actorName).should(seeThat(DropDownMenu.isVisible()));
    }

}
