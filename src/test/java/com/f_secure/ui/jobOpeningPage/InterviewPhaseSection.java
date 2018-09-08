package com.f_secure.ui.jobOpeningPage;

import com.f_secure.model.jobPeningPage.InterviewPhase;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class InterviewPhaseSection extends PageObject {
    public static Target interviewPhaseLabel(InterviewPhase interviewPhase) {
        return Target
                .the("Interview Phase Label")
                .locatedBy("//section[@class='p-b-3']//a[contains(text(),'"
                        + interviewPhase.getLabel() + "')]");
    }

    public static Target getContentOfSelectedPhase(InterviewPhase interviewPhase) {
        return Target
                .the("Interview Phase Content")
                .locatedBy("//div[@id='"
                        + interviewPhase.getContent() + "']");
    }
}
