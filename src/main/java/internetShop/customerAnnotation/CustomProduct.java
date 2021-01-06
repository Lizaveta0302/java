package internetShop.customerAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
public @interface CustomProduct {
    public enum Priority {
        POOR, MEDIUM, RICH
    }

    Priority priority() default Priority.MEDIUM;

    String createdBy() default "Customer";
}
