package patterns.структурные.bridgePattern;

public class CoffeeMachineRemoteController implements RemoteController {

    private Device coffeeMachineDevice;

    public CoffeeMachineRemoteController(Device coffeeMachineDevice) {
        this.coffeeMachineDevice = coffeeMachineDevice;
    }

    @Override
    public void turnOn() {
        coffeeMachineDevice.turnOn();
    }

    @Override
    public void turnOff() {
        coffeeMachineDevice.turnOff();
    }

    @Override
    public void increaseVolume() {
        coffeeMachineDevice.increaseVolume();
    }

    @Override
    public void decreaseVolume() {
        coffeeMachineDevice.decreaseVolume();
    }
}
