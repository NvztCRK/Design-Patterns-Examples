package com.nvztcrk.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Observable newspaper = new Newspaper();
        newspaper.add(new Resident());
        newspaper.add(new Economist());
        newspaper.add(new Ministry());

        logger.info("Observers will be notified.");
        newspaper.notifyObservers();
    }
} 