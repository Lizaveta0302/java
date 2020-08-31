package internetShop.customerAnnotation;

import internetShop.Warehouse;
import internetShop.category.Category;
import internetShop.product.Product;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class ExpiredProductAnnotationAnalyzer {

    public static Boolean checkExpiredProduct(Product product, int count) {
        if (checkAnnotationValue()) {
            return true;
        } else {
            String expiredDate = null;
            Date expiredDateProduct, nowDate;
            SimpleDateFormat sdf;
            try {
                if (!Objects.isNull(product) && count > 0) {
                    Class<Category> categoryClass = (Class<Category>) Class.forName(product.getCategory().getClass().getName());
                    Field[] fields = categoryClass.getDeclaredFields();
                    for (Field field : fields) {
                        field.setAccessible(true);
                        expiredDate = (String) field.get(product.getCategory());
                    }
                    sdf = new SimpleDateFormat("yyyy-MM-dd");
                    expiredDateProduct = sdf.parse(expiredDate);
                    nowDate = sdf.parse(sdf.format(new Date()));
                    if (expiredDateProduct.after(nowDate)) {
                        return true;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    private static Boolean checkAnnotationValue() {
        try {
            Class<Warehouse> warehouseClass = Warehouse.class;
            for (Method method : warehouseClass.getMethods()) {
                if (method.isAnnotationPresent(ExpiredProduct.class)) {
                    try {
                        ExpiredProduct methodAnnotation = method.getAnnotation(ExpiredProduct.class);
                        return methodAnnotation.enabled();
                    } catch (Throwable ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
