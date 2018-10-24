package com.nvztcrk.strategy.pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        LOGGER.info("Waiter brings POS!");
        Customer customer = new Customer(new DebitCardPaymentStrategy());
        customer.payBill();
        LOGGER.info("Waiter brings just bill!");
        customer.changePaymentStrategy(new CashPaymentStrategy());
        customer.payBill();
        LOGGER.info("Waiter brings bill and com.nvztcrk.strategy.pattern.Customer ask that may I pay with Cryto Coins?!");
        customer.changePaymentStrategy(new CryptoCoinPaymentStrategy());
        customer.payBill();

        //with JAVA 8
        LOGGER.info("Waiter brings POS!");
        customer.changePaymentStrategy(() -> LOGGER.info("com.nvztcrk.strategy.pattern.Customer paid bill by using Debit Card!"));
        customer.payBill();

    }
} 