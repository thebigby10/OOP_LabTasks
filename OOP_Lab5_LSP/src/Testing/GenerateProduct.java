package Testing;
import java.util.ArrayList;
import ProductCalculation.*;

public class GenerateProduct {
    ArrayList<String> productTypes = new ArrayList<String>();
    ArrayList<String> productNames = new ArrayList<String>();
    ArrayList<Integer> quantities = new ArrayList<Integer>();
    ArrayList<Integer> unitPrices = new ArrayList<Integer>();
    ArrayList<Integer> taxes = new ArrayList<Integer>();

    Product product;
    //add random items in the products
    GenerateProduct(){
        productTypes.add("Electronic");
        productTypes.add("Clothing");
        productTypes.add("Furniture");

        productNames.add("iPhone");
        productNames.add("T-shirt");
        productNames.add("Desk");
        productNames.add("Laptop");
        productNames.add("Sofa");
        productNames.add("Chair");

        quantities.add(1);
        quantities.add(2);
        quantities.add(3);

        unitPrices.add(100);
        unitPrices.add(200);
        unitPrices.add(300); 
        
    }
    
}
