package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObjectRemovalTest {

    public static void main(String[] args) {
        List market = new ArrayList<>();
        StockExchange st1 = new StockExchange() {
            @Override
            public boolean isClosed() {
                return true;
            }
        };
        StockExchange st2 = new StockExchange() {
            @Override
            public boolean isClosed() {
                return true;
            }
        };
        StockExchange st3 = new StockExchange() {
            @Override
            public boolean isClosed() {
                return false;
            }
        };

        market.add(st1);
        market.add(st2);
        market.add(st3);

        Iterator marketIterator = market.iterator();

        while (marketIterator.hasNext()) {
            StockExchange exchange = (StockExchange) marketIterator.next();
            if (!exchange.isClosed()) {
                marketIterator.remove();
            }
        }

        market.stream().forEach(System.out::println);

    }
}

interface StockExchange {
    boolean isClosed();
}
