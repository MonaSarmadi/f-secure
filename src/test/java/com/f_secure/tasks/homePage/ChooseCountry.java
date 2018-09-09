package com.f_secure.tasks.homePage;


import com.f_secure.model.homePage.Country;
import com.f_secure.ui.homePage.CountrySelector;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@Slf4j
public class ChooseCountry implements Task {

    @Steps
    private CountrySelector findCountry;

    @Override
    @Step("{0} choose the country")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(CountrySelector.SelectCountry(Country.FR)));

        log.info(actor.getName() + " choose France country");
    }

    public static ChooseCountry withTheAddressAlreadySet(){
        return instrumented(ChooseCountry.class);
    }

}
