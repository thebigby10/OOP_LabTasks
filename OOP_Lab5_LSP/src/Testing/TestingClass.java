package Testing;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import org.junit.*;
import ProductCalculation.*;

public class TestingClass {
    ArrayList<Product> products = new ArrayList<Product>();
    ArrayList<Product> sorted_products = new ArrayList<Product>();
    OrderManager manager = new OrderManager();
    public void addRandomProducts(){
    }

    // test 1
    @Test
    public void test1() {
        products.clear();
        sorted_products.clear();
        products.add(new ElectronicProduct("Electronics", "Phone", 2, 500.0));   // Total Price: 500 + 15% = 575.0
        products.add(new FurnitureProduct("Furniture", "Table", 5, 300.0));   // Total Price: 300 + 8% = 324.0
        products.add(new ClothingProduct("Clothing", "Shirt", 10, 50.0));      // Total Price: 50 + 10% = 55.0
        
        sorted_products = manager.sortProducts(products);
        
        assertEquals("Shirt", sorted_products.get(0).getProductName());
    }

    // test 2
    @Test
    public void test2() {
        products.clear();
        sorted_products.clear();
        products.add(new ElectronicProduct("Electronics", "Phone", 2, 500.0));   // Total Price: 575.0
        products.add(new ElectronicProduct("Electronics", "Camera", 2, 500.0));  // Total Price: 575.0
        products.add(new ElectronicProduct("Electronics", "Tablet", 2, 500.0));  // Total Price: 575.0

        sorted_products = manager.sortProducts(products);

        assertEquals("Camera", sorted_products.get(0).getProductName());
    }

    // test 3
    @Test
    public void test3() {
        products.clear();
        sorted_products.clear();
        products.add(new ElectronicProduct("Electronics", "Phone", 10, 500.0));  // Total Price: 575.0
        products.add(new ElectronicProduct("Electronics", "Phone", 5, 500.0));   // Total Price: 575.0
        products.add(new ElectronicProduct("Electronics", "Phone", 2, 500.0));   // Total Price: 575.0

        sorted_products = manager.sortProducts(products);

        assertEquals(2, products.get(0).getQuantity());
    }

    // test 4
    @Test
    public void test4() {
        products.clear();
        sorted_products.clear();
        products.add(new ElectronicProduct("Electronics", "Phone", 10, 500.0));  // Total Price: 575.0
        products.add(new FurnitureProduct("Furniture", "Table", 5, 300.0));      // Total Price: 324.0
        products.add(new ClothingProduct("Clothing", "Shirt", 10, 50.0));        // Total Price: 55.0
        products.add(new FurnitureProduct("Furniture", "Chair", 1, 300.0));      // Total Price: 324.0

        sorted_products = manager.sortProducts(products);

        assertEquals("Chair", products.get(0).getProductName());
    }

    // test 5
    @Test
    public void test_empty_list() {
        products.clear();
        sorted_products.clear();
        sorted_products = manager.sortProducts(products);

        assertEquals(sorted_products, products);
    }

    // test 6
    @Test
    public void test_one_item_list(){
        products.clear();
        sorted_products.clear();

        products.add(new ElectronicProduct("Electronics", "Phone", 10, 500.0));  // Total Price: 575.0
        
        sorted_products = manager.sortProducts(products);

        assertEquals(sorted_products, products);
    }

    // test 7
    public void quantity_different(){
        products.clear();
        sorted_products.clear();
        products.add(new ElectronicProduct("Electronics", "Phone", 2, 500.0));   // Total Price: 500 + 15% = 575.0
        products.add(new ElectronicProduct("Electronics", "Phone", 1, 500.0));   // Total Price: 575.0
        products.add(new ElectronicProduct("Electronics", "Phone", 0, 500.0));   // Total Price: 575.0

        sorted_products = manager.sortProducts(products);

        assertEquals(sorted_products.get(0), products.get(2));
    }

    // test 8
    public void name_different(){
        products.clear();
        sorted_products.clear();
        products.add(new ElectronicProduct("Electronics", "Phone", 2, 500.0));   // Total Price: 500 + 15% = 575.0
        products.add(new ElectronicProduct("Electronics", "Camera", 2, 500.0));  // Total Price: 575.0  
        products.add(new ElectronicProduct("Electronics", "Tablet", 2, 500.0));  // Total Price: 575.0

        sorted_products = manager.sortProducts(products);

        assertEquals(sorted_products.get(0), products.get(1));
    }
