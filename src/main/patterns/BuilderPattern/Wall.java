package main.patterns.BuilderPattern;

public class Wall {
    private String material;

    public Wall(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
