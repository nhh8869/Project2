package Project2;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> productList;

    //  Adds products to list in contructor
    public ProductManager() {
        productList = new ArrayList<>();
        // Add some initial products
        productList.add(new Product("T-Shirt", 15.0));
        productList.add(new Product("Jeans", 35.0));
        productList.add(new Product("Sweater", 50.0));
        productList.add(new Product("Dress", 25.0));
        productList.add(new Product("Cap", 10.0));
        productList.add(new Product("Trainers", 125.0));
        productList.add(new Product("Hoodie", 65.0));
        productList.add(new Product("Socks (4 pack)", 5));
        productList.add(new Product("Long Sleeve T", 10.0));
        productList.add(new Product("Polo", 15.0));
    }

    //  Get products 
    public List<Product> getAllProducts() {
        return productList;
    }
    
    //  Get price from product list using name
    public double getPriceFromList(String item){
        double x = 0.0;
        for (Product product : productList){
            if (product.getProductName().equals(item)){
                x = product.getProductPrice();
            }
        }
        return x;
    }
    
    //  Adds product
    public void addProduct(Product product){
        productList.add(product);
    }
    
    //  Changes name
    public void changeProductName(String productName, String newProductName){
        for (Product product : productList){
            if (product.getProductName().equals(productName)){
                product.setProductName(newProductName);
            }
        }
    }
    
    //  Changes price
    public void changeProductPrice(String productName, double newProductPrice){
        for (Product product : productList){
            if (product.getProductName().equals(productName)){
                product.setProductPrice(newProductPrice);
            }
        }
    }
    
    // Remove product
    public void removeProduct(String productName){
        for (Product product : productList){
            if (product.getProductName().equals(productName)){
                productList.remove(product);
            }
        }
    }
}
