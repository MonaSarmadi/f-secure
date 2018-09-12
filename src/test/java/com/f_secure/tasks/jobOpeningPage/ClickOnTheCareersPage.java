package com.f_secure.tasks.jobOpeningPage;

import com.f_secure.ui.homePage.FindCareersLinkInHomePage;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@Slf4j
public class ClickOnTheCareersPage implements Task{

    @Steps
    private FindCareersLinkInHomePage findCareersLinkInHomePage;

    @Override
    @Step("{0} click on the careers page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FindCareersLinkInHomePage.CareersLink));

        log.info(actor.getName() + " click on the careers page");
    }

    public static ClickOnTheCareersPage withTheAddressAlreadySet(){
        return instrumented(ClickOnTheCareersPage.class);
    }
}
