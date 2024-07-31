package AdapterPatternExample;

public class AdapterClass {
    
}
// Adaptee class 1
class PayPal {
    public void makePayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

// Adaptee class 2
class Stripe {
    public void charge(double amount) {
        System.out.println("Processing Stripe payment of $" + amount);
    }
}

// Adaptee class 3
class Square {
    public void processTransaction(double amount) {
        System.out.println("Processing Square payment of $" + amount);
    }
}

