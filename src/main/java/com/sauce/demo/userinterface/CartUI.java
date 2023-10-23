package com.sauce.demo.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class CartUI {



    public static final Target FIELD_NAME = Target.the("field name").locatedBy("//input[@id='first-name']");

    public static final Target FIELD_LN = Target.the("lastname field").locatedBy("//input[@id='last-name']");

    public static final Target CODE_FIELD = Target.the("code field").locatedBy("//input[@id='postal-code']");

    public static final Target CONT_BUT = Target.the("continue button").locatedBy("//input[@id='continue']");

}
