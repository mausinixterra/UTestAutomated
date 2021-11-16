package co.com.dmvs.proyecto.task;

import co.com.dmvs.proyecto.userinterface.UTestStepPersonalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class StepPersonal implements Task {
    public static StepPersonal onThePage() {
        return Tasks.instrumented(StepPersonal.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestStepPersonalPage.JOIN_TODAY_BUTTON),
                Enter.theValue("Quest").into(UTestStepPersonalPage.INPUT_FIRST_NAME),
                Enter.theValue("Legends").into(UTestStepPersonalPage.INPUT_LAST_NAME),
                Enter.theValue("qlegends@hotmail.com").into(UTestStepPersonalPage.INPUT_EMAIL_ADDRESS),
                SelectFromOptions.byIndex(12).from(UTestStepPersonalPage.SELECT_BIRTH_MONTH),
                SelectFromOptions.byIndex(31).from(UTestStepPersonalPage.SELECT_BIRTH_DAY),
                SelectFromOptions.byIndex(11).from(UTestStepPersonalPage.SELECT_BIRTH_YEAR),
                Click.on(UTestStepPersonalPage.ENTER_BUTTON_NEXT)
        );

    }
}
