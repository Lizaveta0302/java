package internetShop;

public class FoodCategory implements Category {

    private String expirationDate;

    public FoodCategory(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "FoodCategory{" +
                "expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
