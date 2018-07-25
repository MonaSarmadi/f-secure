package com.f_secure.ui;

import com.f_secure.model.ForHomeItems;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class ForHomePhaseSection extends PageObject{

    public static final Target FOR_HOME = Target
            .the("for home")
            .locatedBy("//*[@id=\"frontpage_funnel\"]/div/div/div[2]/div/div[1]/a/div/h6");
    public static final Target F_SECURE_TOTAL = Target
            .the("fSecure total")
            .locatedBy("//*[@id=\"frontpage_funnel\"]/div/div/div[2]/div/div[1]/ul/li[1]/a");
    public static final Target F_SECURE_SAFE = Target
            .the("fSecure total")
            .locatedBy("//*[@id=\"frontpage_funnel\"]/div/div/div[2]/div/div[1]/ul/li[2]/a");
    public static final Target FREEDOM_VPN = Target
            .the("freedom vpn")
            .locatedBy("//*[@id=\"frontpage_funnel\"]/div/div/div[2]/div/div[1]/ul/li[3]/a");

    public static Target forHomePhaseSection(ForHomeItems forHomeItems) {
        return Target
                .the("ForHome Phase Section")
                .locatedBy("//section[@id='frontpage_funnel']//div//h5[contains(text(),'"

                        + forHomeItems.getItem() + "')]");
    }
}
