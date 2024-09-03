package site.codesomething.springbootdemo.abstracts;

public abstract class Laptop {
    protected final String brand;
    protected final String model;

    public Laptop(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract String getBrand();
    public abstract String getModel();
}
