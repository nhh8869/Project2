package Project2;

public class Product {
    private String name;
    private double price;
    
    //  Contructor
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    // Get product name
    public String getProductName(){
        return this.name;
    }
    
    //  Get product price
    public double getProductPrice(){
        return this.price;
    }
    
    //  Set product name
    public void setProductName(String name){
        this.name = name;
    }
    
    // Set product price
    public void setProductPrice(double price){
        this.price = price;
    }
}
