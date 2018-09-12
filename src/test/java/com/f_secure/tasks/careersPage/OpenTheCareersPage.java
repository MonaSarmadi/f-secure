package com.f_secure.tasks.careersPage;

import com.f_secure.ui.careersPage.CareersPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheCareersPage implements Performable {

    @Steps
    CareersPage careersPage;

    @Override
    @Step("{0} open the careers page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(careersPage));
    }

    public static OpenTheCareersPage withTheAddressAlreadySet(){
       return instrumented(OpenTheCareersPage.class);
    }
}
