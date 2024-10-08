package ProductCalculation;
public abstract class Product {
    String productType;
    String productName;
    int quantity;
    double unit_price;
    int tax;

    public String getProductType() {
        return productType;
    }
    public void setProductType(String productType) {
        this.productType = productType;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getUnit_price() {
        return unit_price;
    }
    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public Product(String productType, String productName, int quantity, double unit_price) {
        this.productType = productType;
        this.productName = productName;
        this.quantity = quantity;
        this.unit_price = unit_price;
    }
    
    public double calculateTotalPrice(){
        double total_price = getUnit_price()*getQuantity();
        double total_price_with_tax = total_price + (total_price*tax);
        return total_price_with_tax; 
    }
}
