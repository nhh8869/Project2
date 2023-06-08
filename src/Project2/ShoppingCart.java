package Project2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private static ShoppingCart instance;
    private List<String> cartItems;
    private double totalCost;

    private ShoppingCart() {
        cartItems = new ArrayList<>();
        totalCost = 0.0;
    }

    public static ShoppingCart getInstance() {
        if (instance == null) {
            instance = new ShoppingCart();
        }
        return instance;
    }

    public void addProduct(String product) {
        cartItems.add(product);
    }

    public List<String> getCartItems() {
        return cartItems;
    }
    
    public double getTotalCost(){
        return this.totalCost;
    }
    
    public Product getProduct(String name){
        ProductManager pm = new ProductManager();
        for (Product product : pm.getAllProducts()){
            if (product.getProductName().equals(name)){
                return product;
            }
        }
        return null;
    }
    
    /*
    public String getProductName(String name){
        for (String names : cartItems){
            if (names.equals(name)){
                return names;
            }
        }
        return null;
    }*/

    public double calculateTotalCost(){
        double total = 0.0;
        
        for (String item : cartItems){
            Product p = getProduct(item);
            double itemPrice = p.getProductPrice();
            total += itemPrice;
        }
        return total;
    }
    
    private double getProductPrice(String name){
        ProductManager productM = new ProductManager();
        List<Product> productList = productM.getAllProducts();
        
        for (Product product : productList){
            if (product.getProductName().equalsIgnoreCase(name)){
                return product.getProductPrice();
            }
        }
        return 0.0;
    }
}
