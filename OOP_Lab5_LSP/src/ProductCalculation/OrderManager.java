package ProductCalculation;
import java.util.*;

public class OrderManager {
    public ArrayList<Product> sortProducts(ArrayList<Product> products){
        ArrayList<Product> sorted_products = products;
        //sort according to the price
        for(int i=0;i<sorted_products.size();i++){
            for(int j=i+1;j<sorted_products.size();j++){
                if(products.get(i).calculateTotalPrice() > products.get(j).calculateTotalPrice()){
                    Collections.swap(sorted_products,i,j);
                }
            }
        }
        //sort according to the name
        for(int i=0;i<sorted_products.size();i++){
            for(int j=i+1;j<sorted_products.size();j++){
                if(products.get(i).calculateTotalPrice() == products.get(j).calculateTotalPrice()){
                    if( products.get(i).getProductName() .compareTo( products.get(j).getProductName()) >0){
                        Collections.swap(sorted_products,i,j);
                    }
                }
            }
        }
        //sort according to stock quantities
        for(int i=0;i<sorted_products.size();i++){
            for(int j=i+1;j<sorted_products.size();j++){
                if(products.get(i).calculateTotalPrice() == products.get(j).calculateTotalPrice() ){
                    if( products.get(i).getProductName() .compareTo( products.get(j).getProductName()) == 0){
                        if(products.get(i).getQuantity() < products.get(j).getQuantity()){
                            Collections.swap(sorted_products,i,j);
                        }
                    }
                }
            }
        }
        return sorted_products;
    }
}
