package com.f_secure.features.jobOpeningPage;

import com.f_secure.model.jobPeningPage.City;
import com.f_secure.questions.dropdown.CheckIfQualityEngineer;
import com.f_secure.questions.dropdown.DropDownMenu;
import com.f_secure.questions.list.CurrentPage;
import com.f_secure.tasks.jobOpeningPage.RememberJobAdsForPoznan;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.f_secure.ui.jobOpeningPage.FindJobUsingDropDown.dropDownJobCityName;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class WhenFindQualityEngineerJobTitle {

    @Managed
    private WebDriver browser;

    @Then("^(.*) verify poznan from drop down menu is visible$")
    public void shouldVerifyPoznanFromDropDownMenuIsVisible(String actorName){
        theActorCalled(actorName).should(seeThat(DropDownMenu.isVisible()));
    }

    @When("^(.*) clicks poznan from drop down list$")
    public void shouldClicksPoznanFromDropDownList(String actorName){
        WebElement element = browser.findElement(By.xpath(dropDownJobCityName(City.POZNAN).getCssOrXPathSelector()));
        JavascriptExecutor executor = (JavascriptExecutor)browser;
        executor.executeScript("arguments[0].click();", element);
        theActorCalled(actorName).should(seeThat(CurrentPage.textValue(),Matchers.is("1")));
        theActorCalled(actorName).attemptsTo(RememberJobAdsForPoznan.inMemory());
    }

    @Then("^(.*) verify quality engineer exist$")
    public void shouldVerifyQualityEngineerExist(String actorName){
        theActorCalled(actorName).should(seeThat(CheckIfQualityEngineer.exist()));
    }
}
