package com.f_secure.questions.generic_questions;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Presence;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@Slf4j
@AllArgsConstructor
public class GetTextValue implements Question<String>, Performable {
    private final Target target;

    @Override
    @Step("{0} has retrieved text from web elements '#target'")
    public String answeredBy(Actor actor) {
        String targetTextValue = Text.of(target).viewedBy(actor).resolve();
        log.info("target element " + target.getName() + "has text fromWebElements: " + targetTextValue);
        return targetTextValue;
    }

    public static Question<String> fromTheElement(Target target) {
        return instrumented(GetTextValue.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    }
}
