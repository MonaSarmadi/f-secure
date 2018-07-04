package com.f_secure.questions.generic_questions;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Presence;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@Slf4j
@AllArgsConstructor
public class IsDisplayed implements Question<Boolean>, Performable {
    private final Target target;

    @Override
    @Step("{0} has checked the presence of '#target'")
    public Boolean answeredBy(Actor actor) {
        Boolean isDisplayed = Presence.of(target).viewedBy(actor).asBoolean();
        log.info(target.getName() + ": " + isDisplayed);
        return isDisplayed;
    }

    public static Question<Boolean> theElement(Target target) {
        return instrumented(IsDisplayed.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    }
}
