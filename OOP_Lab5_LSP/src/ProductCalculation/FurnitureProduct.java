package ProductCalculation;
public class FurnitureProduct extends Product{

    public FurnitureProduct(String productType, String productName, int quantity, double unit_price) {
        super(productType, productName, quantity, unit_price);
        this.tax = 8/100;
    }
    
}
