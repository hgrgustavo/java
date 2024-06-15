package entities;
public class Outsourced extends Employee {
    // Attributes
    private Double addCharge;



    // Getters & Setters
    public Double getAddCharge() { return addCharge; }
    public void setAddCharge(Double addCharge) { this.addCharge = addCharge; }



    // Constructors
    public Outsourced(String name, Integer hours, Double valuePerHour, Double addCharge) {
        super(name, hours, valuePerHour);
        setAddCharge(addCharge);
    }



    // Methods
    @Override
    public double payment() {
        return super.payment() + getAddCharge() * 1.1;
    }
}