package com.sauce.demo.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sauce.demo.userinterface.BuyUI.*;

public class Buy implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(FIL_OPTION),
                Click.on(OR_OPTION),
                Click.on(LOW_ART),
                Click.on(FIL_OPTION),
                Click.on(OR_OPTIO),
                Click.on(HI_ART),
                Click.on(ANY_ART),
                Click.on(SHOP_CART),
                Click.on(REM_ART),
                Click.on(CHEKC_BUT));

    }

    public static Buy articule() {

        return new Buy();
    }
}
