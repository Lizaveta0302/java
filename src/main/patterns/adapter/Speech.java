package main.patterns.adapter;

public class Speech {

    private String speech;

    public Speech(String speech) {
        this.speech = speech;
    }

    public void transferToTranslator() {
        System.out.println("речь передана переводчику");
    }

    public void transferToCustomer() {
        System.out.println("речь переведена заказчику.");
    }

}
