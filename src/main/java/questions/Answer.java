package questions;

import models.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.MenuPage;

public class Answer implements Question<Boolean> {

    public static Answer is()
    {
        return new Answer();
    }

    @Override
    public Boolean answeredBy(Actor actor)
    {
        boolean answer;
        String welcomeMessage=Text.of(MenuPage.LBL_WELCOME).viewedBy(actor).asString();
        if(welcomeMessage.equalsIgnoreCase(Constantes.MENSAJEBIENVENIDA))
        {
            answer=true;
        }
        else {
            answer=false;
        }
        return answer;
    }
}
