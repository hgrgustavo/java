package entities;

public class Common {
    private String common_name;
    private Double common_price;


    
    // Get & Set
    public String getCommon_name() {
        return common_name;
    }
    public void setCommon_name(String common_name) {
        this.common_name = common_name;
    }

    public Double getCommon_price() {
        return common_price;
    }
    public void setCommon_price(Double common_price) {
        this.common_price = common_price;
    }
    
    
    // Constructor
    public Common(String common_name, Double common_price) {
        setCommon_name(common_name);
        setCommon_price(common_price);
    }
    
    public String priceTag() { return getCommon_name() + " $" + String.format("%.2f", getCommon_price()); }
}