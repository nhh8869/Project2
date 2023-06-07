package Project2;

public class ProductManager {
    private List<Product> productList;

    public ProductManager() {
        productList = new ArrayList<>();
        // Add some initial products
        productList.add(new Product("T-Shirt", 20.0));
        productList.add(new Product("Jeans", 50.0));
    }

    public List<Product> getAllProducts() {
        return productList;
    }
    
    public void addProduct(){
        
    }
    
    public void changeProductName(){
        
    }
    
    public void changeProductPrice(){
        
    }
    
    public void removeProduct(){
        
    }
}
