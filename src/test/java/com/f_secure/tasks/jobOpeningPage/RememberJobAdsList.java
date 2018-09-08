package com.f_secure.tasks.jobOpeningPage;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.stream.Collectors;

import static com.f_secure.InMemoryListKey.listOfJobAdsFirstPage;
import static com.f_secure.ui.jobOpeningPage.FindJobUsingDropDown.JOB_ADS_LIST;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RememberJobAdsList implements Task {

    @Override
    @Step("{0} is remembering the job ads list from the first page")
    public <T extends Actor> void performAs(T actor) {
        List<String> listOfJobAdsForFirstPage = JOB_ADS_LIST.resolveAllFor(actor)
                .stream()
                .map(WebElementFacade::getWrappedElement)
                .map(WebElement::getText)
                .collect(Collectors.toList());
        actor.remember(listOfJobAdsFirstPage.toString(),listOfJobAdsForFirstPage);
    }

    public static RememberJobAdsList inMemory(){
        return instrumented(RememberJobAdsList.class);
    }
}
