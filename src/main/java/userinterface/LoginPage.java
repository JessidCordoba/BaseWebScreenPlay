package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject
{
    public static final Target TXT_USERNAME= Target.the("campo de texto para escribir usuario").located(By.name("usuario"));
    public static final Target TXT_PASSWORD= Target.the("campo de texto para escribir contrasena").located(By.name("contrasena"));
    public static final Target BTN_LOGIN= Target.the("boton para autenticarse").located(By.xpath("/html/body/app-root/div/app-login/div/div/div/div[.]/app-iniciar-sesion/div/div[.]/div[.]/div/form/div[.]/button"));
}
