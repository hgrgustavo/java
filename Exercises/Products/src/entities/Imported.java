package entities;
public class Imported extends Common {
    private Double customsFee;

    
    // Get & Set
    public Double getCustomsFee() {
        return customsFee;
    }
    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    
    
    // Constructor
    public Imported(String name, Double price, Double customsFee) {
        super(name, price);
        setCustomsFee(customsFee);
    }
    public Double totalPrice() { return getCommon_price() + getCustomsFee(); }
    public String priceTag() { return super.priceTag() + " (Price with customs fee: $" + String.format("%.2f", totalPrice()); }
}