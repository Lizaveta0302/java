package patterns.структурные.bridgePattern;

public class CoffeeMachineDevice implements Device {

    @Override
    public void increaseVolume() {
        System.out.println("Increasing sound volume in coffee machine..");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Decreasing sound volume in coffee machine..");
    }

    @Override
    public void turnOn() {
        System.out.println("Coffee machine is turn on..");
    }

    @Override
    public void turnOff() {
        System.out.println("Coffee machine is turn off..");
    }
}
