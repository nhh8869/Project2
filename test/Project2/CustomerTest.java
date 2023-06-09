package Project2;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void testCustomerInitialization() {
        // Create a customer
        Customer customer = new Customer("John", "password123", "john@example.com");

        // Check if the customer's username, password, and email are set correctly
        Assert.assertEquals("John", customer.getUsername());
        Assert.assertEquals("password123", customer.getPassword());
        Assert.assertEquals("john@example.com", customer.getEmail());
    }

    @Test
    public void testCustomerSetters() {
        // Create a customer
        Customer customer = new Customer("John", "password123", "john@example.com");

        // Set new values for username, password, and email
        customer.setUsername("JohnDoe");
        customer.setPassword("newpassword456");
        customer.setEmail("john.doe@example.com");

        // Check if the new values are set correctly
        Assert.assertEquals("JohnDoe", customer.getUsername());
        Assert.assertEquals("newpassword456", customer.getPassword());
        Assert.assertEquals("john.doe@example.com", customer.getEmail());
    }
}