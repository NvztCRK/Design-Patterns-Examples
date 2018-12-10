package com.nvztcrk.decorator;

public class Milk extends BeverageDecorator {
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public Double cost() {
        return beverage.cost() + .10;
    }
}
