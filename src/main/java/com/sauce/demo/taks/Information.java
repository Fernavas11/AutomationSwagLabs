package com.sauce.demo.taks;

import com.sauce.demo.interactions.WaitTime;
import com.sauce.demo.models.Customer;
import com.sauce.demo.utils.Jsonfile;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.JavascriptExecutor;

import static com.sauce.demo.userinterface.CartUI.*;
import static com.sauce.demo.userinterface.CartUI.CONT_BUT;
import static com.sauce.demo.userinterface.PayUI.FIN_BT;

public class Information implements Task {

    private Customer customer;

    public Information(Customer customer) {
        this.customer = customer;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(customer.getFirstname()).into(FIELD_NAME),
                Enter.theValue(customer.getLastname()).into(FIELD_LN),
                Enter.theValue(customer.getPostalcode()).into(CODE_FIELD),
                Click.on(CONT_BUT));
    }


    public static Information payment(Customer customer){

        return new Information(customer);

    }
}
