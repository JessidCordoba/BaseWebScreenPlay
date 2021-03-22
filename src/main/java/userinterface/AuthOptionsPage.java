package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AuthOptionsPage extends PageObject
{
    public static final Target BTN_MAILANDPASSWORD= Target.the("opcion de autenticacion con mail y contrasena").located(By.xpath("/html/body/app-root/div/app-login/div/div/div/div[.]/app-ingreso/div/div[.]/div/div[.]/a/div/div[.][contains(text(),'Ingresar con Mail y contrase')]"));
}
