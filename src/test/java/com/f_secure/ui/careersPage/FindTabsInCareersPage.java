package com.f_secure.ui.careersPage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FindTabsInCareersPage extends PageObject {

    public static final Target AboutUsTab = Target
            .the("About Us Tab")
            .locatedBy("//*[@id=\"p4-section-subnav\"]/li[1]/a");

    public static final Target ContactUsTab = Target
            .the("ContactUsTab")
            .locatedBy("//*[@id=\"p4-section-subnav\"]/li[2]/a");

    public static final Target CareersTab = Target
            .the("Careers Tab")
            .locatedBy("//*[@id=\"p4-section-subnav\"]/li[3]/a");

    public static final Target OurPatentsTab = Target
            .the("Our Patents Tab")
            .locatedBy("//*[@id=\"p4-section-subnav\"]/li[4]/a");

    public static final Target ForInvestorsTab = Target
            .the("For Investors Tab")
            .locatedBy("//*[@id=\"p4-section-subnav\"]/li[5]/a");

    public static final Target ForPressTab = Target
            .the("For Press Tab")
            .locatedBy("//*[@id=\"p4-section-subnav\"]/li[6]/a");
}
