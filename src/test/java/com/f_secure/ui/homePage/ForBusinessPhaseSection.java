package com.f_secure.ui.homePage;

import com.f_secure.model.homePage.ForBusinessItems;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ForBusinessPhaseSection extends PageObject{

    public static final Target FOR_Business = Target
            .the("for business")
            .locatedBy("//*[@id=\"frontpage_funnel\"]/div/div/div[2]/div/div[2]/a/div/h6");
    public static final Target Protection_Service_for_Business = Target
            .the("Protection Service for Business")
            .locatedBy("//*[@id=\"frontpage_funnel\"]/div/div/div[2]/div/div[2]/ul/li[1]/a/div/div/h5/b");
    public static final Target F_Secure_Rapid_DetectionResponse_Service = Target
            .the("F-Secure Rapid Detection & Response Service")
            .locatedBy("//*[@id=\"frontpage_funnel\"]/div/div/div[2]/div/div[2]/ul/li[2]/a/div/div/h5/b");
    public static final Target F_Secure_Rapid_DetectionResponse = Target
            .the("F-Secure Rapid Detection & Response")
            .locatedBy("//*[@id=\"frontpage_funnel\"]/div/div/div[2]/div/div[2]/ul/li[3]/a/div/div/h5/b");


    public static Target forBusinessPhaseSection(ForBusinessItems forBusinessItems) {
        return Target
                .the("ForBusiness Phase Section")
                .locatedBy("//section[@id='frontpage_funnel']//div//h5//b[contains(text(),'"

                        + forBusinessItems.getItem() + "')]");
    }
}
