package internetShop.order;

import internetShop.bucket.Bucket;
import internetShop.currency.ConvertCurrencyStrategy;
import lombok.Data;

@Data
public class CachePayOrder implements Order {
    private double price;
    private ConvertCurrencyStrategy convertCurrencyStrategy;

    @Override
    public double pay(Bucket bucket, ConvertCurrencyStrategy convertCurrencyStrategy) {
        bucket.getProducts().forEach(e -> price += (e.getPrice() * convertCurrencyStrategy.convert()));
        return price;
    }
}
