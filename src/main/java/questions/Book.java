package questions;

import models.BookData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.MenuPage;
import static org.hamcrest.Matchers.equalTo;
import java.util.List;

public class Book implements Question<Boolean>
{
    private String bookDatos;

    public Book(String bookData)
    {
        this.bookDatos = bookData;
    }

    public static Book wasFound(List<BookData> bookData)
    {
        return new Book(bookData.get(0).getBookName());
    }

    @Override
    public Boolean answeredBy(Actor actor)
    {
        boolean result;
        actor.attemptsTo(Scroll.to(MenuPage.LBL_FOUNDBOOK));
        String nameBook= Text.of(MenuPage.LBL_FOUNDBOOK).viewedBy(actor).asString();
        if(nameBook.contains(bookDatos))
        {
            result=true;
        }
        else
        {
            result=false;
        }
        return result;
    }

}
