package com.f_secure.questions.dropdown;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

import java.util.List;
import java.util.function.Predicate;

import static com.f_secure.InMemoryListKey.listofJobInPoznanKey;

public class CheckIfQualityEngineer implements Question<Boolean> {

    private static final String QUALITY_ENGINEER = "Quality Engineer";

    private CheckIfQualityEngineer() {
    }

    @Override
    @Step("{0} is checking that if quality engineer exist")
    public Boolean answeredBy(Actor actor) {
        List<String> listOfJobAdsForFirstPageInPoznan = actor.recall(listofJobInPoznanKey.toString());
        return listOfJobAdsForFirstPageInPoznan
                .stream()
                .anyMatch(forQualityEngineer());
    }

    private Predicate<String> forQualityEngineer() {
        return str -> str.trim().contains(QUALITY_ENGINEER);
    }

    public static Question<Boolean> exist() {
        return new CheckIfQualityEngineer();
    }
}
