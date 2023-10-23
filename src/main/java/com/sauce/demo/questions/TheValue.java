package com.sauce.demo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class TheValue implements Question<String>{
    private Target target;
    public TheValue(Target target){
        this.target=target;
    }
    @Override
    public String answeredBy(Actor actor) {
        //actor.attemptsTo(WaitUntil.the(target, WebElementStateMatchers.isCurrentlyVisible()));

        return target.resolveFor(actor).getText();

    }

    public static TheValue ofText(Target target){
        return new TheValue(target);
    }
}

