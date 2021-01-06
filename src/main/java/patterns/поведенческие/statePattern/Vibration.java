package patterns.поведенческие.statePattern;

public class Vibration implements MobileAlertState {
    @Override
    public void alert(Context context) {
        System.out.println("Vibration..");
    }
}
