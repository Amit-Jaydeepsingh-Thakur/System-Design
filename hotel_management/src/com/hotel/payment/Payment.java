package com.hotel.payment;

public interface Payment {
    boolean creditCardPayment();
    boolean debitCardPayment();
    boolean cashPayment();
}
