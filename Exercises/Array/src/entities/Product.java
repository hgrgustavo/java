package entities;

public class Product {
    private String product_name;
    private float product_price;

    // Getters
    public String getName() { return product_name; }
    public float getPrice() { return product_price; }

    // Setters
    public void setName(String product_name) {
        this.product_name = product_name;
    }
    public void setPrice(float product_price) {
        this.product_price = product_price;
    }

    // Constructor
    public Product(String n, float p) {
        setName(n);
        setPrice(p);
    }
}
