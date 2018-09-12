package com.f_secure.features.careersPage;

import com.f_secure.HoverMouse;
import com.f_secure.questions.generic_questions.IsDisplayed;
import com.f_secure.ui.careersPage.FindTabsInCareersPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static com.f_secure.ui.careersPage.SubmenusCareerTab.FellowshipStories;
import static com.f_secure.ui.careersPage.SubmenusCareerTab.JobOpeningsPage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class WhenVerifyForCareersSubmenus {

    @Managed
    private WebDriver browser;

    @When("^(.*) mouse hover on careers tab$")
    public void monaMouseOverOnCareersOnNavigationBar(String actorName){
        theActorCalled(actorName)
                .attemptsTo(HoverMouse.over(FindTabsInCareersPage.CareersTab));
    }

    @Then("^(.*) should see Job Opening and Fellowship Stories submenus$")
    public void monaShouldSeeJobOpeningAndFellowshipStoriesSubmenus(String actorName){
        theActorCalled(actorName).should(seeThat(IsDisplayed.theElement(JobOpeningsPage)));
        theActorCalled(actorName).should(seeThat(IsDisplayed.theElement(FellowshipStories)));
    }
}
