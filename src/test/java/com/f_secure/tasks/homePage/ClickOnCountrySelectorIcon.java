package com.f_secure.tasks.homePage;

import com.f_secure.ui.homePage.FindCountry;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.screenplay.Tasks.instrumented;


@Slf4j
public class ClickOnCountrySelectorIcon implements Task {

    @Steps
    private FindCountry findCountry;

    @Override
    @Step("{0} click on the country selector icon")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FindCountry.countrySelectorIcon));
        log.info(actor.getName() + " click on the country selector icon");
        }

    public static ClickOnCountrySelectorIcon withTheAddressAlreadySet(){
        return instrumented(ClickOnCountrySelectorIcon.class);
    }
}
