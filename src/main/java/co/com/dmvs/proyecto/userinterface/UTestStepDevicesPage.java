package co.com.dmvs.proyecto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestStepDevicesPage extends PageObject {
    public static final Target CLICK_BUTTON_NEXT = Target.the("button to next page location").located(By.xpath("//a[contains(@class,'btn btn-blue pull-right')]"));
}
