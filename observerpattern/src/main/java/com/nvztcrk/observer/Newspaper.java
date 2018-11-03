package com.nvztcrk.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Newspaper extends Observable {
    private static final Logger logger = LoggerFactory.getLogger(Newspaper.class);

    void notifyObservers() {
        for(Observer observer : this.getObservers()){
            observer.update();
            logger.info(observer.getClass() + " was updated.");
        }
    }
}
