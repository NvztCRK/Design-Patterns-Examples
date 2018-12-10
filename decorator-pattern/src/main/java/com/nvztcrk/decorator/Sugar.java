package com.nvztcrk.decorator;

public class Sugar extends BeverageDecorator {
    public Sugar(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    public Double cost() {
        return beverage.cost() + .05;
    }
}
