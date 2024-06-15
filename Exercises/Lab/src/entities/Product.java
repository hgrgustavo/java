package entities;

public class Product {
    private int quantity, id;
    private double value;
    private String description, photo;

    // Getters & Setters
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    // Constructor
    public Product(String description, double value) {
        setDescription(description);
        setValue(value);
    }

    // Methods
    public String toString() {
        return  " . . . DATA . . . " +
                "\nDescription: " + getDescription() +
                "\nValue: " + getValue();
    }
}
