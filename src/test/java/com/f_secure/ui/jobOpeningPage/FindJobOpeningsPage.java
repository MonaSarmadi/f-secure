package com.f_secure.ui.jobOpeningPage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FindJobOpeningsPage extends PageObject {

    public static Target JobOpeningsPage = Target
            .the("JobOpenings")
            .locatedBy("//*[@id=\"p4-section-subnav\"]/li[3]/ul/li[2]/a");
}
