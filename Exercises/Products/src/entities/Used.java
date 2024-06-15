package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Used extends Common{
    private LocalDate manufactureDate;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");



    // Get & Set
    public LocalDate getManufactureDate() { return manufactureDate; }
    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }



    // Constructor
    public Used(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        setManufactureDate(manufactureDate);
    }



    // Methods
    public String priceTag() {
        return getCommon_name() + " (used) $" + String.format("%.2f", getCommon_price()) + " (Manufacture date: " + getManufactureDate().format(formatter) + ")";
    }
}
