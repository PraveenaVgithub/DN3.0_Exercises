package ProxyPatternExample;

// Implement the RealImage class that loads an image from a remote server
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromRemoteServer(fileName);
    }

    private void loadFromRemoteServer(String fileName) {
        System.out.println("Loading " + fileName + " from remote server...");
        // Simulate loading time
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(fileName + " loaded from remote server.");
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
