package com.f_secure.ui.homePage;

import com.f_secure.model.homePage.Country;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class FindCountry extends PageObject {

    public static Target countrySelectorIcon = Target
            .the("Country selector icon")
            .locatedBy(
                    "//*[@id='frontpage_nav']/nav//div//ul//li[5][@class='country-selector p-b-xs-0 p-b-sm-0']");

    public static Target selectCountry(Country country) {
        return Target
                .the("Select country name")
                .locatedBy("//*[@id=\"country-selector\"]/div/div/div[2]/div/div[2]/div[2]/ul//li//a[contains(text(),'"
                        + country.getName() + "')]");
        }
}
