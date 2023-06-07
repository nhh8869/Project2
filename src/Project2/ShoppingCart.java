package Project2;

public class ShoppingCart {
    private static ShoppingCart instance;
    private List<String> cartItems;

    private ShoppingCart() {
        cartItems = new ArrayList<>();
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
}
