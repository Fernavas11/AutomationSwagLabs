package com.sauce.demo.definitions;

import com.sauce.demo.models.Customer;
import com.sauce.demo.models.User;
import com.sauce.demo.questions.TheTotal;
import com.sauce.demo.questions.TheValue;
import com.sauce.demo.taks.*;
import com.sauce.demo.utils.Jsonfile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.hamcrest.core.IsEqual;

import java.util.List;

import static com.sauce.demo.drivers.Driver.chrome;
import static com.sauce.demo.userinterface.CustomerUI.*;
import static com.sauce.demo.userinterface.LoginResponse.EMP_RESP;
import static com.sauce.demo.userinterface.LoginResponse.SUCC_RESP;
import static com.sauce.demo.userinterface.PayUI.FIN_BT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class Buydefinition {

    @Given("the {string} is logged in with their credential")
    public void theIsLoggedInWithTheirCredential(String actor, List<User> users) {
        theActorCalled(actor).whoCan(BrowseTheWeb.with(chrome(Jsonfile.getValue("url"))));
        theActorInTheSpotlight().attemptsTo(Login.signIn(users.get(0)));
    }

    @When("the order,add cart,remove and complete the purchase")
    public void theOrderAddCartRemoveAndCompleteThePurchase(List<Customer> customers) {
        theActorInTheSpotlight().attemptsTo(
                Buy.articule(),
                Information.payment(customers.get(0)),
                Sum.ofTheItems());}
    @Then("the see a success message {string}")
    public void theSeeASuccessMessage(String mensaje) {
        String valorEsperado = (theActorInTheSpotlight().recall("suma").toString());
        theActorInTheSpotlight().should(seeThat(TheTotal.value(), IsEqual.equalTo(valorEsperado)));
        theActorInTheSpotlight().attemptsTo(Click.on(FIN_BT));
        theActorInTheSpotlight().should(seeThat(TheValue.ofText(SUCC_RESP), equalTo(mensaje)));
    }

    @When("the enter incomplete shipping information during checkout")
    public void theEnterIncompleteShippingInformationDuringCheckout(List<Customer> customers) {
        theActorInTheSpotlight().attemptsTo(
                Buy.articule(),
                Information.payment(customers.get(0)));
    }
    @Then("the see error message {string}")
    public void theSeeErrorMessage(String msj) {
        theActorInTheSpotlight().should(seeThat(TheValue.ofText(ERROR_PC), equalTo(msj)));

    }

    @Then("the see error with messages {string}")
    public void theSeeErrorWithMessages(String msj) {
        theActorInTheSpotlight().should(seeThat(TheValue.ofText(ERROR_FN), equalTo(msj)));

    }

    @Then("the see error messages {string}")
    public void theSeeErrorMessages(String msj) {
        theActorInTheSpotlight().should(seeThat(TheValue.ofText(ERROR_LN), equalTo(msj)));
    }


}
