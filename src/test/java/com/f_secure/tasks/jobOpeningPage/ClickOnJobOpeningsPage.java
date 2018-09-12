package com.f_secure.tasks.jobOpeningPage;

import com.f_secure.ui.careersPage.SubmenusCareerTab;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@Slf4j
public class ClickOnJobOpeningsPage implements Task {

    @Steps
    private SubmenusCareerTab submenusCareerTab;

    @Override
    @Step("{0} click on the job openings page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SubmenusCareerTab.JobOpeningsPage));

        log.info(actor.getName() + " click on the job openings page");
    }

    public static ClickOnJobOpeningsPage withTheAddressAlreadySet(){
        return instrumented(ClickOnJobOpeningsPage.class);
    }
}
