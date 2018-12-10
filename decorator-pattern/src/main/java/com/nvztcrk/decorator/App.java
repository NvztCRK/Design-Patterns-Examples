package com.nvztcrk.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Beverage favoriteCoffee = new Espresso();
        logger.info("Favorite coffe is espresso!!");
        Milk withMilk = new Milk(favoriteCoffee);
        logger.info("Milk is added");
        Sugar sugar = new Sugar(withMilk);
        logger.info("Sugar is added");
        //System.out.println(sugar.getDescription());
        logger.info("Then, it is ready! ==> "+sugar.getDescription());
    }
}