package Project2;

import org.junit.Assert;
import org.junit.Test;

public class ProductTest {

    @Test
    public void testGetProductName() {
        // Arrange
        Product product = new Product("T-Shirt", 15.0);

        // Act
        String productName = product.getProductName();

        // Assert
        Assert.assertEquals("T-Shirt", productName);
    }

    @Test
    public void testGetProductPrice() {
        // Arrange
        Product product = new Product("T-Shirt", 15.0);

        // Act
        double productPrice = product.getProductPrice();

        // Assert
        Assert.assertEquals(15.0, productPrice, 0.001);
    }

    @Test
    public void testSetProductName() {
        // Arrange
        Product product = new Product("T-Shirt", 15.0);

        // Act
        product.setProductName("Jeans");
        String productName = product.getProductName();

        // Assert
        Assert.assertEquals("Jeans", productName);
    }

    @Test
    public void testSetProductPrice() {
        // Arrange
        Product product = new Product("T-Shirt", 15.0);

        // Act
        product.setProductPrice(25.0);
        double productPrice = product.getProductPrice();

        // Assert
        Assert.assertEquals(25.0, productPrice, 0.001);
    }

}
