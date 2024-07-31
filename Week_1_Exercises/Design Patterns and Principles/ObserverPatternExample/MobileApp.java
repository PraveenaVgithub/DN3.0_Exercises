package ObserverPatternExample;

public class MobileApp implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Mobile App: " + message);
    }
}

