package com.f_secure.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FindTabsInAboutGlobalPage extends PageObject {

    public static final Target AboutUsTab = Target
            .the("AboutUsTab")
            .locatedBy("//*[@id=\"p4-section-subnav\"]/li[1]/a");

    public static final Target ContactUsTab = Target
            .the("ContactUsTab")
            .locatedBy("//*[@id=\"p4-section-subnav\"]/li[2]/a");

    public static final Target CareersTab = Target
            .the("CareerTab")
            .locatedBy("//*[@id=\"p4-section-subnav\"]/li[3]/a");

    public static final Target OurPatentsTab = Target
            .the("OurPatentsTab")
            .locatedBy("//*[@id=\"p4-section-subnav\"]/li[4]/a");

    public static final Target ForInvestorsTab = Target
            .the("ForInvestorsTab")
            .locatedBy("//*[@id=\"p4-section-subnav\"]/li[5]/a");

    public static final Target ForPressTab = Target
            .the("ForPressTab")
            .locatedBy("//*[@id=\"p4-section-subnav\"]/li[6]/a");
}
