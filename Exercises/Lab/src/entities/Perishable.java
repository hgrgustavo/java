package entities;

import java.time.LocalDate;

public class Perishable extends Product {
    private int[] expire = new int[3];

    // Getter & Setter
    public int[] getExpire() {
        return expire;
    }
    public void setExpire(int[] expire) {
        this.expire = expire;
    }

    // Constructor
    public Perishable(String description, Double value, int day, int month, int year) {
        super(description, value);
        if(LocalDate.now().isAfter(LocalDate.of(year, month, day))) {
            isExpired();

        }
    }

    // Methods
    public boolean isExpired() {
        System.out.print("\nProduct Expired!");
        return true;
    }
    public void applyDiscount(double percentage) {
        double newPrice;
        newPrice = getValue() - (getValue() * percentage / 100);
        System.out.print("\nProduct price with discount: $" + newPrice);
    }
    public String toString() {
        return " . . . DATA . . .  " +
                "\nDescription: " + getDescription() +
                "\nValue: $" + getValue();
    }
}