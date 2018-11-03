package com.nvztcrk.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Economist implements Observer {
    private static final Logger logger = LoggerFactory.getLogger(Economist.class);

    public void update() {
        logger.info("News are hot for ECONOMIST!");
    }
}
