package com.f_secure.tasks;

import com.f_secure.ui.FSecureHomePage;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@Slf4j
public class OpenTheHomePage implements Task{

    @Steps
    private FSecureHomePage fSecureHomePage;

    @Override
    @Step("{0} opens the home page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn()
                        .the(fSecureHomePage));

        log.info(actor.getName() + " opened the f-secure home page");
    }

    public static OpenTheHomePage withTheAddressAlreadySet(){
        return instrumented(OpenTheHomePage.class);
    }
}

