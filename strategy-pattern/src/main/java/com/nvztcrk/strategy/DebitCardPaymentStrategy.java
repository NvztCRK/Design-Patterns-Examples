package com.nvztcrk.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DebitCardPaymentStrategy implements PaymentStrategy {
    private static final Logger LOGGER = LoggerFactory.getLogger(DebitCardPaymentStrategy.class);

    public void pay() {
        LOGGER.info("com.nvztcrk.strategy.pattern.Customer paid bill by using Debit Card!");
    }
}
