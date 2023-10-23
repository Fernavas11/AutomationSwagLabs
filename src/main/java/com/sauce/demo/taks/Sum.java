package com.sauce.demo.taks;

import com.sauce.demo.interactions.WaitTime;
import com.sauce.demo.userinterface.PayUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;


public class Sum implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        JavascriptExecutor js = (JavascriptExecutor) actor.usingAbilityTo(BrowseTheWeb.class).getDriver();
        js.executeScript("window.scrollBy(0, 400);");

        actor.attemptsTo(WaitTime.forSeconds(1));

        double totalItems= Double.parseDouble(PayUI.TOT_ITEM.resolveFor(actor).getText().replace("Item total: $",""));

        double tax= Double.parseDouble(PayUI.TAX.resolveFor(actor).getText().replace("Tax: $",""));

        String suma = String.valueOf(totalItems + tax);

        actor.remember("suma",suma);

    }

    public static Sum ofTheItems(){

        return new Sum();
    }
}
