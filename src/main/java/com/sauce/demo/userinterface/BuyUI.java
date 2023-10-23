package com.sauce.demo.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class BuyUI {

    public static final Target FIL_OPTION = Target.the("filter option").locatedBy("//select[@class='product_sort_container']");
    public static final Target OR_OPTION = Target.the("order option low").locatedBy("//select[@class='product_sort_container']//option[@value='lohi']");
    public static final Target LOW_ART = Target.the("low article").locatedBy("//button[@id='add-to-cart-sauce-labs-onesie']");
    public static final Target FIL_OPTIO = Target.the("filter option").locatedBy("//select[@class='product_sort_container']");
    public static final Target OR_OPTIO = Target.the("order option higth").locatedBy("//select[@class='product_sort_container']//option[@value='hilo']");
    public static final Target HI_ART = Target.the("higth article").locatedBy("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
    public static final Target ANY_ART = Target.the("any article").locatedBy("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
    public static final Target SHOP_CART = Target.the("shopping cart").locatedBy("//div[@id='shopping_cart_container']");

    public static final Target REM_ART = Target.the("remove article").locatedBy("//button[@id='remove-sauce-labs-onesie']");
    public static final Target CHEKC_BUT = Target.the("checkout button").locatedBy("//button[@id='checkout']");



}
