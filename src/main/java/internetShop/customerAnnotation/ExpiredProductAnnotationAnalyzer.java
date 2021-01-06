package internetShop.customerAnnotation;

import internetShop.entity.Warehouse;
import internetShop.entity.category.Category;
import internetShop.entity.product.Product;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class ExpiredProductAnnotationAnalyzer {

    public static Boolean checkExpiredProduct(Product product, int count) {
        if (CustomAnnotationHandler.checkAnnotationValue(Warehouse.class, ExpiredProduct.class)) {
            return true;
        } else {
            String expiredDate = null;
            Date expiredDateProduct, nowDate;
            SimpleDateFormat sdf;
            try {
                if (!Objects.isNull(product) && count > 0) {
                    Class<Category> categoryClass = (Class<Category>) Class.forName(product.getBucket().getClass().getName());
                    Field[] fields = categoryClass.getDeclaredFields();
                    for (Field field : fields) {
                        field.setAccessible(true);
                        expiredDate = (String) field.get(product.getId());
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
}
