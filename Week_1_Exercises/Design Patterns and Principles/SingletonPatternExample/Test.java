package SingletonPatternExample;

public class Test {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First log message.");
        logger2.log("Second log message.");

        if (logger1 == logger2) {
            System.out.println("Test passed: logger1 and logger2 are the same instance.");
        } else {
            System.out.println("Test failed: logger1 and logger2 are not the same instance.");
        }
    }  
}
