package com.f_secure.tasks;

import com.f_secure.ui.FSecureJobOpeningPage;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@Slf4j
public class OpenTheJobOpeningPage implements Task {

    @Steps
    private FSecureJobOpeningPage fSecureJobOpeningPage;

    @Override
    @Step("{0} opens the job opening page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn()
                .the(fSecureJobOpeningPage));

        log.info(actor.getName() + " opened the f-secure job opening page");
    }

    public static OpenTheJobOpeningPage withAddressAlreadySet(){
        return instrumented(OpenTheJobOpeningPage.class);
    }
}
