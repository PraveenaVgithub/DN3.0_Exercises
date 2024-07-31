package ObserverPatternExample;

// Implement the StockMarket class that maintains a list of observers
import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers;
    @SuppressWarnings("unused")
    private String stockPrice;

    public StockMarket() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void setStockPrice(String stockPrice) {
        this.stockPrice = stockPrice;
        notifyObservers("Stock price updated: " + stockPrice);
    }
}
