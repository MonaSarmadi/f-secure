package com.f_secure.screenplay.questions.generic_questions;

import com.f_secure.screenplay.utilities.WrappedAnswer;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Presence;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

@Slf4j
public class IsDisplayed implements WrappedAnswer<Boolean> {
    private final Target target;

    public IsDisplayed(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //do nothing
    }

    @Override
    @Step("{0} has checked presence of '#target'")
    public Boolean answeredBy(Actor actor) {
        Boolean isDisplayed = Presence.of(target).viewedBy(actor).asBoolean();
        log.info(target.getName() + ": " + isDisplayed);
        return isDisplayed;
    }

    public static Question theElement(Target target){
        return Tasks.instrumented(IsDisplayed.class,target);
    }
}
