package com.f_secure.features.jobOpeningPage;

import com.f_secure.questions.list.CheckIfPaginationWorks;
import com.f_secure.questions.list.CurrentPage;
import com.f_secure.questions.list.PaginationButton;
import com.f_secure.tasks.jobOpeningPage.RememberJobAdsList;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.f_secure.ui.jobOpeningPage.JobOpeningListSection.NEXT_BUTTON_PAGINATION_CLICKABLE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class WhenVerifyPaginationFunctionality {
    @Managed
    private WebDriver browser;
    @Given("^(.*) verify that pagination buttons are visible$")
    public void shouldVerifyThatPaginationButtonsAreVisible(String actorName) {
        theActorCalled(actorName).should(seeThat(PaginationButton.isVisible()));
    }

    @When("^(.*) clicks pagination button to see next 6 job ads$")
    public void shouldClicksPaginationButtonToSeeNext6JobAds(String actorName) {
        theActorCalled(actorName).attemptsTo(RememberJobAdsList.inMemory());
        //Chrome driver click issue
        WebElement element = browser.findElement(By.xpath(NEXT_BUTTON_PAGINATION_CLICKABLE));
        JavascriptExecutor executor = (JavascriptExecutor)browser;
        executor.executeScript("arguments[0].click();", element);
        theActorCalled(actorName).should(seeThat(CurrentPage.textValue(),Matchers.is("2")));
    }

    @Then("^(.*) see the next new job ads$")
    public void shouldSeeTheNextNewJobAds(String actorName) {

        theActorCalled(actorName).should(seeThat(CheckIfPaginationWorks.fine()));
    }
}
