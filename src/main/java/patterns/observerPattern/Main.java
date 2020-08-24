package patterns.observerPattern;

public class Main {
    public static void main(String[] args) {
        TVNews tvNews = new TVNews();
        TVNewsSubscriber sub1 = new TVNewsSubscriber();
        TVNewsSubscriber sub2 = new TVNewsSubscriber();

        tvNews.subscribe(sub1);
        tvNews.subscribe(sub2);

        tvNews.setNumber(1);
        System.out.println("sub1 " + sub1.getNumber());
        System.out.println("sub2 " + sub2.getNumber());

        tvNews.unsubscribe(sub1);
        tvNews.setNumber(2);

        System.out.println("sub1 " + sub1.getNumber());
        System.out.println("sub2 " + sub2.getNumber());

    }
}
