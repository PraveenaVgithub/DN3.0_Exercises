package AdapterPatternExample;

public class AdapterPatternTest {
    public static void main(String[] args) {
        // Creating instances of Adaptee classes
        PayPal payPal = new PayPal();
        Stripe stripe = new Stripe();
        Square square = new Square();

        // Creating adapter instances
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPal);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);
        PaymentProcessor squareAdapter = new SquareAdapter(square);

        // Using the adapters to process payments
        payPalAdapter.processPayment(100.00);
        stripeAdapter.processPayment(200.00);
        squareAdapter.processPayment(300.00);
    }
}

