/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid;

/**
 *
 * @author fawad
 */
interface PaymentMethod {
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        // Payment logic for credit card
    }
}

class PaypalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        // Payment logic for PayPal
    }
}

