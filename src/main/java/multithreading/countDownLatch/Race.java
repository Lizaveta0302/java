package multithreading.countDownLatch;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.util.concurrent.CountDownLatch;

public class Race {

    private static final CountDownLatch START = new CountDownLatch(8);

    private static final int TRACK_LENGTH = 500000;

    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= 5; i++) {
            int speed = (int) (Math.random() * 100 + 50);
            new Thread(new Car(i, speed)).start();
            Thread.sleep(1000);
        }

        Thread.sleep(1000);
        System.out.println("На старт!");
        START.countDown();
        Thread.sleep(1000);

        System.out.println("Внимание!");
        START.countDown();
        Thread.sleep(1000);

        System.out.println("Марш!");
        START.countDown();
        Thread.sleep(1000);
    }

    @AllArgsConstructor
    public static class Car implements Runnable {

        private final int carNumber;
        private final int speed;

        @SneakyThrows
        @Override
        public void run() {
            System.out.printf("Автомобиль №%d прибыл к стартовой прямой.. \n", carNumber);
            START.countDown();
            START.await();
            Thread.sleep(TRACK_LENGTH / speed);
            System.out.printf("Автомобиль №%d финишировал со скоростью %d \n", carNumber, speed);
        }
    }
}