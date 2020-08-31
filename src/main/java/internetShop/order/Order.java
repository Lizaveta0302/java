package internetShop.order;

import internetShop.bucket.Bucket;
import internetShop.currency.ConvertCurrencyStrategy;

public interface Order {
    double pay(Bucket bucket, ConvertCurrencyStrategy convertCurrencyStrategy);
}
