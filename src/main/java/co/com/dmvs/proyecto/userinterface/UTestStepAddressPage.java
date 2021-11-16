package co.com.dmvs.proyecto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestStepAddressPage extends PageObject {
    public static final Target INPUT_CITY = Target.the("where we write the city").located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("where we write the number zip or postal code").located(By.id("zip"));
    public static final Target SELECT_COUNTRY = Target.the("where we select the country").located(By.name("countryId"));
    public static final Target INPUT_COUNTRY = Target.the("where we select the country").located(By.xpath("//input[contains(@class,'form-control ui-select-search ng-valid ng-touched ng-dirty ng-empty')]"));
    public static final Target ENTER_BUTTON_NEXT = Target.the("button to next page location").located(By.xpath("//a[contains(@class,'btn btn-blue pull-right')]"));
}
