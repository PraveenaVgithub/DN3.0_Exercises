package StrategyPatternExample;

public class Test {
    public static void main(String[] args) {
        // Create a PaymentContext instance
        PaymentContext paymentContext = new PaymentContext(new CreditCardPayment());

        // Execute payment using credit card
        paymentContext.executePayment(100.00);

        // Change payment strategy to PayPal
        paymentContext.setPaymentStrategy(new PayPalPayment());

        // Execute payment using PayPal
        paymentContext.executePayment(200.00);
    }
}
