package patterns.поведенческие.statePattern;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        MobileAlertState state1 = new Vibration();
        state1.alert(context);
        MobileAlertState state2 = new Silent();
        state2.alert(context);
    }
}
