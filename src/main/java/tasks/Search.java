package tasks;

import models.BookData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import userinterface.MenuPage;

import java.util.List;

public class Search implements Task
{
    private String bookName;

    public Search(String bookName) {
        this.bookName = bookName;
    }

    public static Performable aBook(List<BookData> bookName)
    {
        return Tasks.instrumented(Search.class,bookName.get(0).getBookName());
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.wasAbleTo(Enter.theValue(bookName).into(MenuPage.TXT_SEARCH).thenHit(Keys.ENTER));
    }
}
