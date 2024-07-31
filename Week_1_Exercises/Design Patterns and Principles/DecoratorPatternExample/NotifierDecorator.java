package DecoratorPatternExample;

// Create an abstract decorator class that holds a reference to a Notifier object
public abstract class NotifierDecorator implements Notifier {
    private final Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        notifier.send(message);
    }
}
