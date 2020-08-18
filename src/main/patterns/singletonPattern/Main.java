package main.patterns.singletonPattern;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getObject("obj");
        Singleton singleton1 = Singleton.getObject("obj2");
        System.out.println(singleton.value);
        System.out.println(singleton1.value);
    }
}
