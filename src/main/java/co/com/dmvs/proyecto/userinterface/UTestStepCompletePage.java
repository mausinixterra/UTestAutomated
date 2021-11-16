package co.com.dmvs.proyecto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestStepCompletePage extends PageObject {
    public static final Target INPUT_PASSWORD = Target.the("where we write the first name").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where we write the first name").located(By.id("confirmPassword"));
    public static final Target CLICK_BUTTON_TERM = Target.the("button to next page location").located(By.xpath("//label[contains(@class,'checkmark signup-consent__checkbox error')]"));
    public static final Target CLICK_BUTTON_POLICY = Target.the("button to next page location").located(By.xpath("//label[contains(@checkmark signup-consent__checkbox erro)]//span[contains(@class,'checkmark signup-consent__checkbox')]"));
    public static final Target CLICK_BUTTON_COMPLETE = Target.the("button to next page location").located(By.xpath("//span[contains(@class,'btn btn-blue')]"));
}
