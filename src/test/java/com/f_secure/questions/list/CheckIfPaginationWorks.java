package com.f_secure.questions.list;

import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

import static com.f_secure.InMemoryListKey.listOfJobAdsFirstPage;
import static com.f_secure.ui.jobOpeningPage.FindJobUsingDropDown.JOB_ADS_LIST;

@Slf4j
public class CheckIfPaginationWorks implements Question<Boolean> {
    private CheckIfPaginationWorks() {
    }

    @Override
    @Step("{0} is checking that pagination works fine")
    public Boolean answeredBy(Actor actor) {
        List<String> listOfJobAdsForFirstPage = actor.recall(listOfJobAdsFirstPage.toString());

        List<String> listOfJobAdsForSecondPage = JOB_ADS_LIST.resolveAllFor(actor)
                .stream()
                .map(WebElementFacade::getWrappedElement)
                .map(WebElement::getText)
                .collect(Collectors.toList());
        return !listOfJobAdsForFirstPage.equals(listOfJobAdsForSecondPage);
    }

    public static Question<Boolean> fine() {
        return new CheckIfPaginationWorks();
    }
}
