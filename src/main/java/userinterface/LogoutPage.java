package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject
{
    public static final Target BTN_LOGOUT= Target.the("boton para cerrar sesion").located(By.xpath("//*[@class='icon-close mr-2']"));
}
