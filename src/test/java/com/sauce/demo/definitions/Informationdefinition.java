package com.sauce.demo.definitions;

import com.sauce.demo.models.Customer;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class Informationdefinition {

    @DataTableType
    public Customer setCustomer (Map<String, String> data) {
        Customer customer = new Customer();
        customer.setFirstname(data.get("firstname"));
        customer.setLastname(data.get("lastname"));
        customer.setPostalcode(data.get("postalcode"));

        return customer;
    }
}
