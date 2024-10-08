package ProductCalculation;
public class ElectronicProduct extends Product{

    public ElectronicProduct(String productType, String productName, int quantity, double unit_price) {
        super(productType, productName, quantity, unit_price);
        this.tax = 15/100;
    }
    
}
