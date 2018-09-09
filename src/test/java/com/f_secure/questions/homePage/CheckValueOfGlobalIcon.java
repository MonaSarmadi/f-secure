package com.f_secure.questions.homePage;


import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import com.f_secure.questions.generic_questions.GetTextValue;

import static com.f_secure.ui.homePage.CountrySelector.ValueOfCountrySelectorIconAtDownPage;

@Slf4j
public class CheckValueOfGlobalIcon implements Question<String> {

    private CheckValueOfGlobalIcon() {
    }

    @Override
    @Step("{0} is checking the value of global icon")
    public String answeredBy(Actor actor) {
        String globalIconTextValue = actor
                .asksFor(GetTextValue.fromTheElement(ValueOfCountrySelectorIconAtDownPage));
        log.info("Global icon text value is: " + globalIconTextValue);

        return globalIconTextValue;
    }

    public static Question<String> textValue() {
        return new CheckValueOfGlobalIcon();
    }
}

