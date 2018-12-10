package com.nvztcrk.decorator;

public abstract class BeverageDecorator extends Beverage{
    public Beverage beverage;
    public abstract String getDescription();

    public Size getSize(){
        return beverage.getSize();
    }
}
