package tasks;

import models.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.AuthOptionsPage;
import userinterface.HomePage;
import userinterface.LoginPage;

import java.util.List;

public class Login implements Task
{
    private String user;
    private String password;

    public Login(String user, String password)
    {

        this.user = user;
        this.password = password;
    }

    public static Login onThePage(List<UserData> userData)
    {
        return Tasks.instrumented(Login.class,userData.get(0).getUser(), userData.get(0).getPassword());
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.wasAbleTo(Click.on(HomePage.BTN_MYACCOUNT),
                Click.on(HomePage.BTN_SIGNIN),
                Click.on(AuthOptionsPage.BTN_MAILANDPASSWORD),
                Enter.theValue(user).into(LoginPage.TXT_USERNAME),
                Enter.theValue(password).into(LoginPage.TXT_PASSWORD),
                Click.on(LoginPage.BTN_LOGIN));
    }
}
