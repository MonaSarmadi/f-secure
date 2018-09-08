package com.f_secure.questions.list;

import com.f_secure.questions.generic_questions.IsDisplayed;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

import static com.f_secure.ui.jobOpeningPage.JobOpeningListSection.NEXT_BUTTON_PAGINATION;
import static com.f_secure.ui.jobOpeningPage.JobOpeningListSection.PREVIOUS_BUTTON_PAGINATION;

@Slf4j
public class PaginationButton implements Question<Boolean> {
    private PaginationButton() {
    }

    @Override
    @Step("{0} is checking job opening list pagination")
    public Boolean answeredBy(Actor actor) {
        Boolean isPreviousButtonExist = actor
                .asksFor(IsDisplayed.theElement(PREVIOUS_BUTTON_PAGINATION));
        log.info("Is Previous Button Pagination Displayed: " + isPreviousButtonExist);
        Boolean isNextButtonExist = actor
                .asksFor(IsDisplayed.theElement(NEXT_BUTTON_PAGINATION));
        log.info("Is Next Button Pagination Displayed: " + isNextButtonExist);
        return isPreviousButtonExist && isNextButtonExist;
    }

    public static Question<Boolean> isVisible() {
        return new PaginationButton();
    }
}
