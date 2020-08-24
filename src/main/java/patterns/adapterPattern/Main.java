package patterns.adapterPattern;

public class Main {
    public static void main(String[] args) {
        Translator translator = new EnglishTranslator(new Speech("I love Java"));
        translator.translate();
    }
}
