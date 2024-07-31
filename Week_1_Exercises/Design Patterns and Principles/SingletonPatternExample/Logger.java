package SingletonPatternExample;
public class Logger {
    
    private static Logger myinstance;

   
    private Logger() {}

   
    public static Logger getInstance() {
        if (myinstance == null) {
           myinstance = new Logger();
        }
        return myinstance;
    }
    public void log(String message) {
        System.out.println("Logged: " + message);
    }
}