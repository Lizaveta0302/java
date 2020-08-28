package internetShop.currency;

public class USDCurrencyConvert implements ConvertCurrencyStrategy {

    private Currency currency = new USDCurrency(105, "usd", 2.7, 100);

    @Override
    public double convert() {
        return (currency.getCourse() * 0.2);
    }
}
