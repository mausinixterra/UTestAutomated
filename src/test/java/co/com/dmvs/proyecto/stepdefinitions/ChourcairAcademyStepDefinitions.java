package co.com.dmvs.proyecto.stepdefinitions;

import co.com.dmvs.proyecto.questions.Answer;
import co.com.dmvs.proyecto.task.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChourcairAcademyStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Mauricio wanted to register on the UTest platform$")
    public void thatMauricioWantedToRegisterOnTheUTestPlatform() {
        OnStage.theActorCalled("Mauricio").wasAbleTo(OpenUp.thePage());
    }

    @When("^you enter the data requested for registration$")
    public void youEnterTheDataRequestedForRegistration() {
        OnStage.theActorCalled("Mauricio").wasAbleTo((StepPersonal.onThePage()), (StepAddress.onThePage()), (StepDevices.onThePage()), (StepComplete.onThePage()));
    }

    @Then("^enter the passwords, accept terms and conditions and complete the registration$")
    public void enterThePasswordsAcceptTermsAndConditionsAndCompleteTheRegistration() {
        String question = null;
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
