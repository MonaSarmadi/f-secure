package com.f_secure.features.homePage;

import com.f_secure.questions.homePage.CheckValueOfGlobalIcon;
import com.f_secure.tasks.homePage.ChooseCountry;
import com.f_secure.tasks.homePage.ClickOnCountrySelectorIcon;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import static com.f_secure.ui.homePage.CountrySelector.CountrySelectorIconAtDownPage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class WhenVerifyForCountrySelectorIcon {

    @Managed
    private WebDriver browser;

    @When("^(.*) choose her country from country selector icon$")
    public void monaChooseHerCountryFromCountrySelectorIcon(String actorName){
        theActorCalled(actorName).attemptsTo(ClickOnCountrySelectorIcon.withTheAddressAlreadySet());
        theActorCalled(actorName).attemptsTo(ChooseCountry.withTheAddressAlreadySet());
    }

    @Then("^(.*) should see her country name in the bottom of the page$")
    public void monaShouldSeeHerCountryNameInTheBottomOfThePage(String actorName){
        WebElement element = browser.findElement(By.xpath(CountrySelectorIconAtDownPage.getCssOrXPathSelector()));
        ((JavascriptExecutor) browser).executeScript("arguments[0].scrollIntoView(true);", element);
        theActorCalled(actorName).should(seeThat(CheckValueOfGlobalIcon.textValue(), Matchers.equalTo("France")));
    }
}
