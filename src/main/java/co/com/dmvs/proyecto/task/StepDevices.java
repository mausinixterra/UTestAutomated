package co.com.dmvs.proyecto.task;

import co.com.dmvs.proyecto.userinterface.UTestStepDevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class StepDevices implements Task {



    public static StepDevices onThePage() {
        return Tasks.instrumented(StepDevices.class );
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestStepDevicesPage.CLICK_BUTTON_NEXT)
        );
    }
}
