package com.f_secure.questions.dropdown;

import com.f_secure.model.City;
import com.f_secure.questions.generic_questions.IsDisplayed;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.f_secure.ui.FindJobUsingDropDown.dropDownCityName;
@Slf4j
public class DropDownMenu implements Question<Boolean> {
    private DropDownMenu(){
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean isPoznanExist = actor
                .asksFor(IsDisplayed.theElement(dropDownCityName(City.POZNAN)));
        log.info("Is Poznan exist in drop down menu: " + isPoznanExist);
        return isPoznanExist;
    }

    public static Question<Boolean> isVisible() {
        return new DropDownMenu();
    }
}
