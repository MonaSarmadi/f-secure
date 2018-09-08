package com.f_secure.tasks.jobOpeningPage;

import com.f_secure.ui.jobOpeningPage.FindJobOpeningsPage;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@Slf4j
public class ClickOnJobOpenningsPage implements Task {

    @Steps
    private FindJobOpeningsPage findJobOpeningsPage;

    @Override
    @Step("{0} click on the job openings page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FindJobOpeningsPage.JobOpeningsPage));

        log.info(actor.getName() + " click on the job openings page");
    }

    public static ClickOnJobOpenningsPage withTheAddressAlreadySet(){
        return instrumented(ClickOnJobOpenningsPage.class);
    }
}
