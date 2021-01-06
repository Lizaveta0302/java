package internetShop.customerAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class CustomAnnotationHandler {
    public static Boolean checkAnnotationValue(Class<? extends Object> entity, Class<? extends Annotation> annotationClass) {
        ArrayList<Method> methods = new ArrayList<>();
        try {
            for (Method method : entity.getMethods()) {
                if (annotationClass.isAnnotation()) {
                    if (method.isAnnotationPresent(annotationClass)) {
                        try {
                            methods.add(method);
                            //ExpiredProduct methodAnnotation = (ExpiredProduct) method.getAnnotation(annotationClass);
                            return true;
                        } catch (Throwable ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
