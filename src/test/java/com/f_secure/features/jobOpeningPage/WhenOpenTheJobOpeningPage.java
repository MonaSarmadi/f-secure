package com.f_secure.features.jobOpeningPage;

import com.f_secure.HoverMouse;
import com.f_secure.Maximise;
import com.f_secure.tasks.jobOpeningPage.ClickOnJobOpeningsPage;
import com.f_secure.tasks.jobOpeningPage.ClickOnTheCareersPage;
import com.f_secure.tasks.homePage.OpenTheHomePage;
import com.f_secure.ui.careersPage.FindTabsInCareersPage;
import com.f_secure.ui.careersPage.SubmenusCareerTab;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class WhenOpenTheJobOpeningPage {

    @Managed
    private WebDriver browser;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that (.*) has open the f secure Home Page$")
    public void thatMonaHasOpenTheFSecureHomePage(String actorName){
        theActorCalled(actorName)
                .can(BrowseTheWeb.with(browser))
                .can(Maximise.driver(browser).toFullScreen())
                .attemptsTo(OpenTheHomePage.withTheAddressAlreadySet());
    }

    @Then("^(.*) click on Careers link$")
    public void monaClickOnCareersLink(String actorName) {
        WebElement element = browser.findElement(By.xpath("//*[@id=\"about\"]/li[4]/a"));
        ((JavascriptExecutor) browser).executeScript("arguments[0].scrollIntoView(true);", element);
        theActorCalled(actorName)
                .attemptsTo(ClickOnTheCareersPage.withTheAddressAlreadySet());
    }

    @Then("^(.*) mouse hover on careers tab and click on job openings item$")
    public void monaMouseHoverOnCareersTabAndClickOnJobOpeningsItem(String actorName) {
        theActorCalled(actorName)
                .attemptsTo(HoverMouse.over(FindTabsInCareersPage.CareersTab));
        theActorCalled(actorName)
                .attemptsTo(HoverMouse.over(SubmenusCareerTab.JobOpeningsPage));
        theActorCalled(actorName)
                .attemptsTo(ClickOnJobOpeningsPage.withTheAddressAlreadySet());
    }

    @After()
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            Serenity.takeScreenshot();
        }
    }
}
