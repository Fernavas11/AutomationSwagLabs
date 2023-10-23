package com.sauce.demo.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class CustomerUI {

    public static final Target ERROR_PC = Target.the("Error postal code").locatedBy("//h3[@data-test='error' and contains(text(), 'Error: Postal Code is required')]");
    public static final Target ERROR_FN = Target.the("Error firstname").locatedBy("//h3[@data-test='error' and contains(text(), 'Error: First Name is required')]");
    public static final Target ERROR_LN = Target.the("Error lastname").locatedBy("//h3[@data-test='error' and contains(text(), 'Error: Last Name is required')]");

}
