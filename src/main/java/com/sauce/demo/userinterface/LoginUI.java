package com.sauce.demo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {

    public static final Target LOG_USER = Target.the("Log user").locatedBy("//input[@id='user-name']");

    public static final Target LOG_PASS = Target.the("Log password").locatedBy("//input[@id='password']");

    public static final Target BTN_SIGN_IN = Target.the("Btn SIGN IN").locatedBy("//input[@id='login-button']");
}

