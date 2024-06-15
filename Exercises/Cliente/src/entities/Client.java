package entities;

public class Client {
    private String name;
    private String address;
    private double revenue;

    // Getters
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    public double getRevenue() {
        return this.revenue;
    }

    // Setters
    public void setName(String n) {
        this.name = n;
    }
    public void setAddress(String a) {
        this.address = a;
    }
    public void setRevenue(double r) {
        this.revenue = r;
    }

    // Constructor
    public Client(String n, String a, double r) {
        setName(n);
        setAddress(a);
        setRevenue(r);

    }

    @Override // = public @interface Override {} -- Prioritized in compilation
    public String toString() {
        return "Client Name: "
                + getName()
                + " Client Address: "
                + getAddress()
                + " Client Revenue: "
                + getRevenue();
    }
}
