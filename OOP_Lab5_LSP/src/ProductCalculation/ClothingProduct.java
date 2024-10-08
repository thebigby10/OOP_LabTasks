package ProductCalculation;
public class ClothingProduct extends Product{ 

    public ClothingProduct(String productType, String productName, int quantity, double unit_price) {
        super(productType, productName, quantity, unit_price);
        this.tax = 10/100;
    }
    
}
