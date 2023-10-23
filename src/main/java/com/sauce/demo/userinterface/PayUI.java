package com.sauce.demo.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class PayUI {

    public static final Target TOT_ITEM = Target.the("total items").locatedBy("//div[@class='summary_subtotal_label']");

    public static final Target TAX = Target.the("tax").locatedBy("//div[@class='summary_tax_label']");

    public static final Target PRICE_TOTAL = Target.the("price total").locatedBy("//div[@class='summary_info_label summary_total_label']");

    public static final Target FIN_BT = Target.the("finish button").locatedBy("//button[@id='finish']");

    public static final Target MSJ_TKY = Target.the("message thank you").locatedBy("//h2[@class='complete-header']");

}
