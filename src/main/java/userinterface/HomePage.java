package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject
{
    public static final Target BTN_MYACCOUNT= Target.the("boton para desplegar las opciones de sesion").located(By.xpath("/html/body/app-root/app-header/header/div[2]/div/div/div[2]/div/menu-login-header/div/div/div/button[contains(text(),'Mi cuenta')]"));
    public static final Target BTN_SIGNIN= Target.the("boton para cargar pantalla de autenticacion").located(By.xpath("/html/body/app-root/app-header/header/div[2]/div/div/div[2]/div/menu-login-header/div/div/div/div/a[1][contains(text(),'Iniciar Sesi')]"));
}
