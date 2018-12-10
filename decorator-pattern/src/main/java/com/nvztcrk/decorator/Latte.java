package com.nvztcrk.decorator;

public class Latte extends Beverage {

    public Latte(){
        this.description = "Latte Coffee";
    }

    public Double cost() {
        return 10.9;
    }
}
