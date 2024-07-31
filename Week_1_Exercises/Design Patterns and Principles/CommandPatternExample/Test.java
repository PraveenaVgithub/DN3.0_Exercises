package CommandPatternExample;

public class Test {
    public static void main(String[] args) {
        // Create a Light instance
        Light light = new Light();

        // Create command instances
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        // Create a RemoteControl instance
        RemoteControl remoteControl = new RemoteControl();

        // Set the command to turn on the light
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();

        // Set the command to turn off the light
        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();
    } 
}
