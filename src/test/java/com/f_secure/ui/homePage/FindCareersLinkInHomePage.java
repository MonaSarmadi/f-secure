package com.f_secure.ui.homePage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FindCareersLinkInHomePage extends PageObject {

    public static Target CareersLink = Target
            .the("Careers link in home page")
                .locatedBy("//*[@id=\"about\"]/li[4]/a");
}

