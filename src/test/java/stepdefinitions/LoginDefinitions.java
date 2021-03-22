package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Constantes;
import models.UserData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import static org.hamcrest.Matchers.equalTo;
import tasks.*;

import java.util.List;

public class LoginDefinitions {
    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that the User want do login in the application$")
    public void thatTheUserWantDoLoginInTheApplication()
    {
        OnStage.theActorCalled(Constantes.ACTOR).wasAbleTo(OpenUp.thePageNationalibrary());
    }

    @When("^he enter credentials$")
    public void heEnterCredentials(List<UserData>userData)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.onThePage(userData));
    }

    @Then("^he must access the homepage$")
    public void heMustAccessTheHomepage(List<UserData>question)
    {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.is(),equalTo(question.get(0).getAnswer())));
    }
}
