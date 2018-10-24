package com.nvztcrk.strategy.pattern;

public class Customer {
    private PaymentStrategy paymentStrategy;

    public Customer(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void changePaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void payBill(){
        paymentStrategy.pay();
    }
}