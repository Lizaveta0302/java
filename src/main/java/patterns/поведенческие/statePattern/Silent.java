package patterns.поведенческие.statePattern;

public class Silent implements MobileAlertState {
    @Override
    public void alert(Context context) {
        System.out.println("Silent..");
    }
}
