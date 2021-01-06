package patterns.поведенческие.statePattern;

public class Context {

    MobileAlertState state;

    public Context() {
    }

    public MobileAlertState getState() {
        return state;
    }

    public void setState(MobileAlertState state) {
        this.state = state;
    }

}
