package com.f_secure.ui.jobOpeningPage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FindCareersPage extends PageObject {

    public static Target CareersPage = Target
            .the("Careers")
                .locatedBy("//*[@id=\"about\"]/li[4]/a");
}

