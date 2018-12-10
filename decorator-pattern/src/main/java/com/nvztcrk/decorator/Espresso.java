package com.nvztcrk.decorator;

public class Espresso extends Beverage {
    public Espresso(){
        this.description = "Espresso Coffee";
    }

    public Double cost() {
        return 7.99;
    }
}
