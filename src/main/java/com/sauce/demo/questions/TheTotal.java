package com.sauce.demo.questions;

import com.sauce.demo.userinterface.PayUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheTotal implements Question <String>{


    @Override
    public String answeredBy(Actor actor) {


        return (PayUI.PRICE_TOTAL.resolveFor(actor).getText().replace("Total: $",""));

    }

    public static TheTotal value(){
        return new TheTotal();
    }
}
