package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg); // calling parent constructor
        addExtraCheese();
        addExtraToppings();
    }
}
