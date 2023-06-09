package Project2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShoppingCart {
    private static ShoppingCart instance;
    private List<String> cartItems;
    private double totalCost;

    //  Cart contructor
    private ShoppingCart() {
        cartItems = new ArrayList<>();
        totalCost = 0.0;
    }

    //  Get instance method
    public static ShoppingCart getInstance() {
        if (instance == null) {
            instance = new ShoppingCart();
        }
        return instance;
    }

    //  Add product to cart
    public void addProduct(String product) {
        cartItems.add(product);
        System.out.println(product);
    }

    //  Get list of cart items
    public List<String> getCartItems() {
        return cartItems;
    }
    
    // Get total cost
    public double getTotalCost(){
        return this.totalCost;
    }
    
    //  Set total cost
    public void setTotalCost(double cost){
        this.totalCost += cost;
    }
    
    // Method to extract price from string containing both name and price
    private double extractPriceFromString(String string){
        String pattern = "\\$([\\d.]+)";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(string);

        if (matcher.find()) {
            String priceStr = matcher.group(1);
            return Double.parseDouble(priceStr);
        }

    return 0.0;
    }

    // Calculate total cost of cart
    public double calculateTotalCost(){
        double total = 0.0;
        for (String item : cartItems){
            total += extractPriceFromString(item);
        }
        return total;
    }
    
    // Get product price from product name
    public double getProductPrice(String name){
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
