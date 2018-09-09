package com.f_secure.ui.homePage;

import com.f_secure.model.homePage.Country;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class CountrySelector extends PageObject {

    public static Target CountrySelectorIconAtTopPage = Target
            .the("Country selector icon at the top page")
            .locatedBy("//*[@id='frontpage_nav']/nav//div//ul//li[5][@class='country-selector p-b-xs-0 p-b-sm-0']");

    public static Target SelectCountry(Country country) {
        return Target
                .the("Select country name")
                .locatedBy("//*[@id=\"country-selector\"]/div/div/div[2]/div/div[2]//li//a[contains(text(),'"
                        + country.getName() + "')]");
    }

    public static Target CountrySelectorIconAtDownPage = Target
            .the("Country selector icon at the down page")
            .locatedBy("//*[@id=\"wrapper\"]/footer/div/div/div[2]/div[4]/div/button");

    public static Target ValueOfCountrySelectorIconAtDownPage = Target

                .the("Value of country selector icon at down page")
                .locatedBy("//*[@id='wrapper']/footer//div[@class='social-links country-selector-trigger']/button");
}

