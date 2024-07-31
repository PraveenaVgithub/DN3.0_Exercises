package DecoratorPatternExample;

// Create a test class to demonstrate sending notifications via multiple channels using decorators
public class DecoratorPatternExample {
    public static void main(String[] args) {
        // Create an EmailNotifier instance
        Notifier emailNotifier = new EmailNotifier();

        // Decorate the EmailNotifier with SMSNotifierDecorator
        Notifier smsDecorator = new SMSNotifierDecorator(emailNotifier);

        // Decorate the SMSNotifierDecorator with SlackNotifierDecorator
        Notifier slackDecorator = new SlackNotifierDecorator(smsDecorator);

        // Send a notification using the decorated notifier
        slackDecorator.send("Hello, World!");
    }
}
