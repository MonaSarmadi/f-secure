package com.f_secure.features;

import com.f_secure.model.InterviewPhase;
import com.f_secure.questions.generic_questions.IsDisplayed;
import cucumber.api.java.en.Given;

import static com.f_secure.ui.InterviewPhaseSection.getContentOfSelectedPhase;
import static com.f_secure.ui.InterviewPhaseSection.interviewPhaseLabel;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class WhenVerifyTheInterviewPhaseSection {

    @Given("^(.*) verify that interview phase label is visible$")
    public void verifyThatInterviewPhaseLabelIsVisible(String actorName) {
        theActorCalled(actorName).should(seeThat(IsDisplayed.theElement(interviewPhaseLabel(InterviewPhase.INTERVIEWS))));
    }

    @SuppressWarnings("unchecked")
    @Given("^(.*) verify that interview phase content is visible$")
    public void verifyThatInterviewPhaseContentIsVisible(String actorName) {
        theActorCalled(actorName).should(seeThat(IsDisplayed.theElement(getContentOfSelectedPhase(InterviewPhase.INTERVIEWS))));
    }
}
