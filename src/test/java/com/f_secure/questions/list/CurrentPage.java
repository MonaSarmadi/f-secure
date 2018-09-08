package com.f_secure.questions.list;

import com.f_secure.questions.generic_questions.GetTextValue;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

import static com.f_secure.ui.jobOpeningPage.JobOpeningListSection.CURRENT_PAGE;

@Slf4j
public class CurrentPage implements Question<String> {
    private CurrentPage() {
    }

    @Override
    @Step("{0} is asserting that the current page is 1")
    public String answeredBy(Actor actor) {
        String currentPageTextValue = actor
                .asksFor(GetTextValue.fromTheElement(CURRENT_PAGE));
        log.info("Current page text value is: " + currentPageTextValue);

        return currentPageTextValue;
    }

    public static Question<String> textValue() {
        return new CurrentPage();
    }
}
