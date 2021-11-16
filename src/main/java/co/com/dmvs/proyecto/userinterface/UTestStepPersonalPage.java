package co.com.dmvs.proyecto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestStepPersonalPage extends PageObject {
    public static final Target JOIN_TODAY_BUTTON = Target.the("button that shows us the form to register").located(By.xpath("//a[contains(@class,'unauthenticated-nav-bar__sign-up')]"));
    public static final Target INPUT_FIRST_NAME = Target.the("where we write the first name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where we write the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL_ADDRESS = Target.the("where we write the email address").located(By.id("email"));
    public static final Target SELECT_BIRTH_MONTH = Target.the("where we select the month of the birthday date").located(By.id("birthMonth"));
    public static final Target SELECT_BIRTH_DAY = Target.the("where we select the day of the birthday date").located(By.id("birthDay"));
    public static final Target SELECT_BIRTH_YEAR = Target.the("where we select the year of the birthday date").located(By.id("birthYear"));
    public static final Target ENTER_BUTTON_NEXT = Target.the("button to next page location").located(By.xpath("//a[contains(@class,'btn btn-blue')]"));
}
