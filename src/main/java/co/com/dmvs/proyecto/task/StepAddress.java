package co.com.dmvs.proyecto.task;

import co.com.dmvs.proyecto.userinterface.UTestStepAddressPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class StepAddress implements Task {
    public static StepAddress onThePage() {
        return Tasks.instrumented(StepAddress.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                 Enter.theValue("Cali").into(UTestStepAddressPage.INPUT_CITY),
                 Enter.theValue("760042").into(UTestStepAddressPage.INPUT_ZIP),
                //Enter.theValue("Colombia").into(UTestStepTwoPage.SELECT_COUNTRY),
                //Click.on(UTestStepTwoPage.SELECT_COUNTRY),
                //SelectFromOptions.byVisibleText("Colombia").from(UTestStepTwoPage.SELECT_COUNTRY),
                //SelectFromOptions.byIndex(12).from(UTestStepTwoPage.INPUT_COUNTRY),
                //SelectFromOptions.byIndex(12).from(UTestStepTwoPage.SELECT_COUNTRY),
                //SelectFromOptions.byValue("Colombia").from(UTestStepTwoPage.SELECT_COUNTRY),
                Click.on(UTestStepAddressPage.ENTER_BUTTON_NEXT)
        );

    }
}
