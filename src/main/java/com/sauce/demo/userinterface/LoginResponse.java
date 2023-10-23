package com.sauce.demo.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class LoginResponse {


    public static final Target SUCC_RESP = Target.the("successful response").locatedBy("//h2[@class='complete-header']");

    public static final Target EMP_RESP = Target.the("empty field ").locatedBy("//*[contains(text(), 'Epic sadface: Username is required')]");

    public static final Target NO_MATCH = Target.the("no matching answer").locatedBy("//*[contains(text(), 'Epic sadface: Username and password do not match any user in this service')]");
}
