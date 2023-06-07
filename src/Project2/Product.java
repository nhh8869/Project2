package Project2;

public class Product {
    private String name;
    private double price;
    
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    public String getProductName(){
        return this.name;
    }
    public double getProductPrice(){
        return this.price;
    }
    
    public void setProductName(String name){
        this.name = name;
    }
    
    public void setProductPrice(double price){
        this.price = price;
    }
}
