package com.f_secure.tasks.jobOpeningPage;

import com.f_secure.InMemoryListKey;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

import static com.f_secure.ui.jobOpeningPage.FindJobUsingDropDown.JOB_ADS_LIST;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RememberJobAdsForPoznan implements Task {

    @Override
    @Step("{0} is remembering the job ads list from the first page for poznan")
    public <T extends Actor> void performAs(T actor) {
        List<String> listOfJobAdsForFirstPageInPoznan = JOB_ADS_LIST.resolveAllFor(actor)
                .stream()
                .map(WebElementFacade::getWrappedElement)
                .map(WebElement::getText)
                .collect(Collectors.toList());
        actor.remember(InMemoryListKey.listofJobInPoznanKey.toString(), listOfJobAdsForFirstPageInPoznan);
    }

    public static RememberJobAdsForPoznan inMemory() {
        return instrumented(RememberJobAdsForPoznan.class);
    }
}