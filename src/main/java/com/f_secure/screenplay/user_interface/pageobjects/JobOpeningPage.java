package com.f_secure.screenplay.user_interface.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class JobOpeningPage extends PageObject {

    public final static Target NEXT_BUTTON_PAGINATION = Target.the("Drop down button")
            .locatedBy("//*[@id=\"p_p_id_56_INSTANCE_C7guYZjcAQo6_\"]/div/div/div/div[1]/section/div/div[1]/div/div/div/button/span[2]/span");
}