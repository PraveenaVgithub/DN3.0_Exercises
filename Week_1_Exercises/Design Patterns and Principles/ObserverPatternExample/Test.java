package ObserverPatternExample;

public class Test {
    public static void main(String[] args) {
        // Create a StockMarket instance
        StockMarket stockMarket = new StockMarket();

        // Create observer instances
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        // Register observers
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Update stock price
        stockMarket.setStockPrice("100.00");

        // Deregister an observer
        stockMarket.deregisterObserver(webApp);

        // Update stock price again
        stockMarket.setStockPrice("120.00");
    }  
}
