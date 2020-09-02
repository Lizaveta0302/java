package internetShop.entity.order;

import internetShop.entity.bucket.Bucket;
import internetShop.entity.currency.ConvertCurrencyStrategy;

public interface Order {
    double pay(Bucket bucket, ConvertCurrencyStrategy convertCurrencyStrategy);
}
