package DecoratorPatternExample;

// Implement the EmailNotifier class that sends notifications via email
public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending email notification: " + message);
    }
}
