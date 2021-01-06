package internetShop.customerAnnotation;

import lombok.SneakyThrows;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomProductAnnotationAnalyzer {

    private static final Logger LOGGER = Logger.getLogger(CustomProductAnnotationAnalyzer.class.getName());
    private static Handler consoleHandler = new ConsoleHandler();
    private static Annotation annotation;

    @SneakyThrows
    public static void checkCustomProduct(Object product) {
        LOGGER.addHandler(consoleHandler);
        consoleHandler.setLevel(Level.ALL);
        Class<? extends Object> productClass = Class.forName(product.getClass().getName());
        if (CustomAnnotationHandler.checkAnnotationValue(product.getClass(), CustomProduct.class)) {
            Field fatField = productClass.getDeclaredField("fatContent");
            if (!fatField.canAccess(product)) {
                fatField.setAccessible(true);
            }
            for (Field field : productClass.getFields()) {
                if (!field.canAccess(product)) {
                    field.setAccessible(true);
                }
                if (field.getName().equals("createdBy")) {
                    annotation = productClass.getAnnotation(CustomProduct.class);
                    field.set(product, ((CustomProduct) annotation).createdBy().concat(" by custom"));
                    LOGGER.info(field.get(product).toString().toUpperCase());
                    LOGGER.info(((CustomProduct) annotation).priority().toString().concat(((CustomProduct) annotation).createdBy().toUpperCase()));
                }
            }
            if (fatField.getInt(product) > 2 && productClass.getAnnotation(CustomProduct.class).priority().toString().equals("MEDIUM")) {
                LOGGER.info("HandMadeProduct is right..");
            } else {
                LOGGER.info("HandMadeProduct is not compatible..");
            }
            LOGGER.info("HandMadeProduct is customer.." + productClass.getAnnotation(CustomProduct.class).createdBy());
        } else {
            LOGGER.info("HandMadeProduct is not customer..");
        }
    }
}
