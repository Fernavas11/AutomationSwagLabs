package com.sauce.demo.taks;

import com.sauce.demo.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static com.sauce.demo.userinterface.LoginUI.*;

public class Login implements Task {

    private User user;

    public Login(User user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getUsername()).into(LOG_USER),
                Enter.theValue(user.getPassword()).into(LOG_PASS),
                Click.on(BTN_SIGN_IN));

    }
    public static Login signIn (User user){

        return new Login(user);

    }


}

