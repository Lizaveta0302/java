package patterns.структурные.adapterPattern.example1;

public class BankAdapter extends SberBank implements BelBank {

    @Override
    public void getBalance() {
        getBalanceSber();
    }

    public static void main(String[] args) {
        RusBank sber = new SberBank();
        BelBank belBank = new BelarusBank();
        BankAdapter adapter = new BankAdapter();
        adapter.getBalance();
    }
}
