package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.BookData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.Book;
import tasks.*;

import java.util.List;

public class SearchDefinitions {


    @When("^he searches a book$")
    public void heSearchesABook(List<BookData>bookData)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.aBook(bookData));
    }

    @Then("^he finds this book$")
    public void heFindsThisBook(List<BookData> bookData)
    {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Book.wasFound(bookData)));
    }

    @And("^he closes the session$")
    public void heClosesTheSession()
    {
        OnStage.theActorInTheSpotlight().attemptsTo(Close.theSession());
    }
}
