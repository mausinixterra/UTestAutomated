package co.com.dmvs.proyecto.task;

import co.com.dmvs.proyecto.userinterface.UTestStepCompletePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class StepComplete implements Task {


    private Object UTestCompletelPage;

    public static StepComplete onThePage() {
        return Tasks.instrumented(StepComplete.class );
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("62lR3sthdNcz").into(UTestStepCompletePage.INPUT_PASSWORD),
                Enter.theValue("62lR3sthdNcz").into(UTestStepCompletePage.INPUT_CONFIRM_PASSWORD),
                Click.on(UTestStepCompletePage.CLICK_BUTTON_TERM),
                Click.on(UTestStepCompletePage.CLICK_BUTTON_POLICY),
                Click.on(UTestStepCompletePage.CLICK_BUTTON_COMPLETE)
        );
    }
}
