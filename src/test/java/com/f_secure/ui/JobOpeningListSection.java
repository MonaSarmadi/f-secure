package com.f_secure.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class JobOpeningListSection extends PageObject {

    public static final Target PREVIOUS_BUTTON_PAGINATION = Target
            .the("Previous button pagination")
            .locatedBy("//div[@class='text-center']//ul//li[@class='active']//span[@class='current prev']");
    public static final Target NEXT_BUTTON_PAGINATION = Target
            .the("Next button pagination")
            .locatedBy("//div[@class='text-center']//ul//li//a[@class='page-link next']");
    public static final String NEXT_BUTTON_PAGINATION_CLICKABLE =
            "//div[@class='text-center']//ul//li//a[@class='page-link next']";
    public static final Target CURRENT_PAGE = Target
            .the("Current Page")
            .locatedBy("//div[@class='text-center']//ul//li[@class='active']//span[@class='current']");
}
