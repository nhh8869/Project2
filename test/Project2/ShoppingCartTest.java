package Project2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ShoppingCartTest {

    private ShoppingCart shoppingCart;

    @Before
    public void setup() {
        shoppingCart = ShoppingCart.getInstance();
        shoppingCart.getCartItems().clear();
    }

    @Test
    public void testAddProduct() {
        shoppingCart.addProduct("T-Shirt $15.0");
        shoppingCart.addProduct("Jeans $35.0");

        List<String> cartItems = shoppingCart.getCartItems();

        Assert.assertEquals(2, cartItems.size());
        Assert.assertTrue(cartItems.contains("T-Shirt $15.0"));
        Assert.assertTrue(cartItems.contains("Jeans $35.0"));
    }

    @Test
    public void testCalculateTotalCost() {
        shoppingCart.addProduct("T-Shirt $15.0");
        shoppingCart.addProduct("Jeans $35.0");

        double totalCost = shoppingCart.calculateTotalCost();

        Assert.assertEquals(50.0, totalCost, 0.01);
    }

    @Test
    public void testGetProductPrice() {
        double tShirtPrice = shoppingCart.getProductPrice("T-Shirt");
        double jeansPrice = shoppingCart.getProductPrice("Jeans");

        Assert.assertEquals(15.0, tShirtPrice, 0.01);
        Assert.assertEquals(35.0, jeansPrice, 0.01);
    }
}