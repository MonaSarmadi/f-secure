package com.f_secure.ui.careersPage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SubmenusCareerTab extends PageObject {

    public static Target JobOpeningsPage = Target
            .the("Job Openings")
            .locatedBy("//*[@id=\"p4-section-subnav\"]/li[3]/ul/li[2]/a");

    public static Target FellowshipStories = Target
            .the("Fellowship Stories")
            .locatedBy("//*[@id=\"p4-section-subnav\"]/li[3]/ul/li[3]/a");
}
