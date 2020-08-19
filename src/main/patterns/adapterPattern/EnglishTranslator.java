package main.patterns.adapterPattern;

public class EnglishTranslator implements Translator {

    private Speech speech;

    public EnglishTranslator(Speech speech) {
        this.speech = speech;
    }

    @Override
    public void translate() {
        speech.transferToTranslator();
        speech.transferToCustomer();
    }
}
