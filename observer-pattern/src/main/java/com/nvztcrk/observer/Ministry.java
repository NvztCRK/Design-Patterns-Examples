package com.nvztcrk.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ministry implements Observer {
    private static final Logger logger = LoggerFactory.getLogger(Ministry.class);

    public void update() {
        logger.info("News are hot for MINISTRY!");
    }
}
