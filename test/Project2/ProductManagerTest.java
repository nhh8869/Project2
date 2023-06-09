package Project2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ProductManagerTest {

    private ProductManager productManager;

    @Before
    public void setup() {
        productManager = new ProductManager();
    }

    @Test
    public void testGetAllProducts() {
        List<Product> productList = productManager.getAllProducts();

        Assert.assertNotNull(productList);
        Assert.assertEquals(10, productList.size());
    }

    @Test
    public void testGetPriceFromList() {
        String productName = "Jeans";
        double expectedPrice = 35.0;

        double actualPrice = productManager.getPriceFromList(productName);

        Assert.assertEquals(expectedPrice, actualPrice, 0.001);
    }

    @Test
    public void testAddProduct() {
        Product product = new Product("Hat", 12.99);
        productManager.addProduct(product);

        List<Product> productList = productManager.getAllProducts();
        Assert.assertEquals(11, productList.size());
        Assert.assertTrue(productList.contains(product));
    }

    @Test
    public void testChangeProductName() {
        String productName = "Jeans";
        String newProductName = "Denim Jeans";

        productManager.changeProductName(productName, newProductName);

        List<Product> productList = productManager.getAllProducts();
        boolean found = false;
        for (Product product : productList) {
            if (product.getProductName().equals(newProductName)) {
                found = true;
                break;
            }
        }
        Assert.assertTrue(found);
    }

    @Test
    public void testChangeProductPrice() {
        String productName = "Jeans";
        double newProductPrice = 39.99;

        productManager.changeProductPrice(productName, newProductPrice);

        double updatedPrice = productManager.getPriceFromList(productName);
        Assert.assertEquals(newProductPrice, updatedPrice, 0.001);
    }

    @Test
    public void testRemoveProduct() {
        String productName = "Hat";

        productManager.removeProduct(productName);

        List<Product> productList = productManager.getAllProducts();
        boolean found = false;
        for (Product product : productList) {
            if (product.getProductName().equals(productName)) {
                found = true;
                break;
            }
        }
        Assert.assertFalse(found);
    }
}