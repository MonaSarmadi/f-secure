package com.f_secure.ui;

import com.f_secure.model.City;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FindJobUsingDropDown extends PageObject {
    public static Target dropDownJobCityName(City city) {
        return Target
                .the("Drop down menu name")
                .locatedBy("//div//section[@class='m-y-2']//div//option[contains(text(),'"
                        + city.getName() + "')]");
    }

    public static final Target JOB_ADS_LIST = Target
            .the("Job Ads Active")
            .locatedBy("//div[@class='row']//div//article[@class='border-b p-b-2']");
}

