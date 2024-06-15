package entidades;

// All instances must be public, so they can be called from outside the package!
public class Product {
    public String product_name;
    public double product_price;
    public int product_quantity;

    public double totalValueInStock () {
        return product_price * product_quantity;
    }

    public void addProducts (int quantity) {
        product_quantity += quantity;
    }

    public void removeProducts(int quantity) {
        product_quantity -= quantity;
    }
    // Java standard method toString.
    public String toString() {
        return product_name
                + ", $"
                + String.format("%.2f",product_price)
                + ", "
                + product_quantity
                + " units, Total: $"
                + String.format("%.2f", totalValueInStock());
    }

    public Product (String name, double price, int quantity) {
        // Don't forget keyword 'this'
        this.product_name = name;
        this.product_price = price;
        this.product_quantity = quantity;
    }
    // Overloading
    public Product (String name, double price) {
        this.product_name = name;
        this.product_price = price;
    }
}
