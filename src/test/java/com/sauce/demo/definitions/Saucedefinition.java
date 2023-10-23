package com.sauce.demo.definitions;

import com.sauce.demo.models.User;
import com.sauce.demo.questions.TheValue;
import com.sauce.demo.taks.Login;
import com.sauce.demo.utils.Jsonfile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;


import java.util.List;

import static com.sauce.demo.drivers.Driver.chrome;
import static com.sauce.demo.userinterface.LoginResponse.*;
import static com.sauce.demo.userinterface.PayUI.MSJ_TKY;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class Saucedefinition {

    @Given("that the {string} is on the login page")
    public void thatTheIsOnTheLoginPage(String actor) {
        theActorCalled(actor).whoCan(BrowseTheWeb.with(chrome(Jsonfile.getValue("url"))));
    }

    @When("the user enters valid credentials")
    public void theUserEntersValidCredentials(List<User> users) {
        theActorInTheSpotlight().attemptsTo(Login.signIn(users.get(0)));

    }

    @Then("the user should see {string}")
    public void theUserShouldSee(String mensaje) {
        theActorInTheSpotlight().should(seeThat(TheValue.ofText(MSJ_TKY), equalTo(mensaje)));

    }

    @When("the user leaves the username and password fields empty")
    public void theUserLeavesTheUsernameAndPasswordFieldsEmpty(List<User> users) {
        theActorInTheSpotlight().attemptsTo(Login.signIn(users.get(0)));
    }

    @Then("the user should see an error message {string}")
    public void theUserShouldSeeAnErrorMessage(String msj) {
        theActorInTheSpotlight().should(seeThat(TheValue.ofText(EMP_RESP), equalTo(msj)));

    }

    @When("the user enters credentials")
    public void theUserEntersCredentials(List<User> users) {
        theActorInTheSpotlight().attemptsTo(Login.signIn(users.get(0)));
    }

    @Then("the user should see an error message indicating {string}")
    public void theUserShouldSeeAnErrorMessageIndicating(String mesj) {

        theActorInTheSpotlight().should(seeThat(TheValue.ofText(NO_MATCH), equalTo(mesj)));

    }
}
