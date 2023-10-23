package com.sauce.demo.definitions;

import com.sauce.demo.models.User;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.Map;

public class Generaldefinition {

    @Before
    public void setup() {
        OnStage.setTheStage(Cast.ofStandardActors());

    }

    @DataTableType
    public User setUser(Map<String, String> data) {
        User user = new User();
        user.setUsername(data.get("username"));
        user.setPassword(data.get("password"));

        return user;
    }

}