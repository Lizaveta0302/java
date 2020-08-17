package main.patterns.SingletonPattern;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getObject("abc");
        Singleton singleton1 = Singleton.getObject("abcd");
        System.out.println(singleton.value);
        System.out.println(singleton1.value);
    }
}
