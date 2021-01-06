package patterns.структурные.bridgePattern;

public class RemoteControlApplication {

    public static void main(String[] args) {
        RemoteController remoteController = new CoffeeMachineRemoteController(new CoffeeMachineDevice());

        remoteController.turnOn();
        remoteController.increaseVolume();
        remoteController.decreaseVolume();
        remoteController.turnOff();

    }
}
