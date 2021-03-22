package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MenuPage extends PageObject
{
    public static final Target LBL_WELCOME= Target.the("mensaje de bienvenida").located(By.xpath("/html/body/app-root/div/app-mi-cuenta/div[.]/div/div/div[.]/div/div/div[.]/div[.]/div/div[2]"));
    public static final Target TXT_SEARCH= Target.the("caja de texto para realizar busqueda").located(By.xpath("/html/body/app-root/app-header/header/div[.]/div/div/div[.]/div/div[.]/form/div[.]/input[2]"));
    public static final Target LBL_FOUNDBOOK= Target.the("resultado de busqueda").located(By.xpath("//*[@class='d-flex text--blue text--sm text--bold text--lh-1 book-title']"));
    public static final Target LBL_USER= Target.the("icono del nombre de usuario").located(By.xpath("/html/body/app-root/app-header/header/div[.]/div/div/div[.]/div/menu-login-header/div/div/div/a"));
}
