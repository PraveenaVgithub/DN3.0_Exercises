package ProxyPatternExample;

public class TestProxyPattern {
    public static void main(String[] args) {
        // Create a ProxyImage instance
        Image proxyImage = new ProxyImage("image1.jpg");

        // Display the image (loads from remote server on first display)
        proxyImage.display();

        // Display the image again (loads from cache)
        proxyImage.display();

        // Create another ProxyImage instance
        Image proxyImage2 = new ProxyImage("image2.jpg");

        // Display the image (loads from remote server on first display)
        proxyImage2.display();

        // Display the image again (loads from cache)
        proxyImage2.display();
    }
}
