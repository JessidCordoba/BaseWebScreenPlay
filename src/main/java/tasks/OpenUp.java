package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.NationalibraryPage;

public class OpenUp implements Task
{
    private NationalibraryPage nationalibraryPage;
    public static OpenUp thePageNationalibrary()
    {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Open.browserOn(nationalibraryPage));
    }
}
