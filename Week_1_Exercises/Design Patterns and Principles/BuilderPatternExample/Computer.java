package BuilderPatternExample;

public class Computer {
    // Attributes of the Computer class
    private String CPU;
    private int RAM;
    private int storage;
    private String graphicsCard;
    private String operatingSystem;

    // Private constructor to enforce the use of the Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
    }

    // Getters for the attributes
    public String getCPU() { return CPU; }
    public int getRAM() { return RAM; }
    public int getStorage() { return storage; }
    public String getGraphicsCard() { return graphicsCard; }
    public String getOperatingSystem() { return operatingSystem; }

    // Static nested Builder class
    public static class Builder {
        // Same attributes as Computer class
        private String CPU;
        private int RAM;
        private int storage;
        private String graphicsCard;
        private String operatingSystem;

        // Methods to set each attribute and return the builder object
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        // Method to build and return a Computer object
        public Computer build() {
            return new Computer(this);
        }
    }

    // Optionally, override the toString() method for better output readability
    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + "GB, Storage=" + storage + "GB, GraphicsCard=" + graphicsCard
                + ", OS=" + operatingSystem + "]";
    }
}

