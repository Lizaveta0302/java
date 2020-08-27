package internetShop;

public class NotFoodCategory implements Category {
    private String lifeTime;

    public NotFoodCategory(String lifeTime) {
        this.lifeTime = lifeTime;
    }

    public String getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(String lifeTime) {
        this.lifeTime = lifeTime;
    }

    @Override
    public String toString() {
        return "NotFoodCategory{" +
                "lifeTime='" + lifeTime + '\'' +
                '}';
    }
}
