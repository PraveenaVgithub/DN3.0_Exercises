package BuilderPatternExample;

public class BuilderPatternTest {
    public static void main(String[] args) {
        // Create a basic computer configuration
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i3")
                .setRAM(8)
                .setStorage(256)
                .setOperatingSystem("Windows 10")
                .build();

        // Create a gaming computer configuration
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM(32)
                .setStorage(1024)
                .setGraphicsCard("NVIDIA RTX 3080")
                .setOperatingSystem("Windows 11")
                .build();

        // Create a work computer configuration
        Computer workComputer = new Computer.Builder()
                .setCPU("AMD Ryzen 5")
                .setRAM(16)
                .setStorage(512)
                .setGraphicsCard("Integrated")
                .setOperatingSystem("Ubuntu 20.04")
                .build();

        // Print the configurations
        System.out.println(basicComputer);
        System.out.println(gamingComputer);
        System.out.println(workComputer);
    }
}

