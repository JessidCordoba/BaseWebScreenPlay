package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.LogoutPage;
import userinterface.MenuPage;

public class Close implements Task {
    public static Performable theSession()
    {
        return Tasks.instrumented(Close.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(MenuPage.LBL_USER),
                Click.on(LogoutPage.BTN_LOGOUT));
    }
}
