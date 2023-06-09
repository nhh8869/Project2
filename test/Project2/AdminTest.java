package Project2;

import org.junit.Assert;
import org.junit.Test;

public class AdminTest {

    @Test
    public void testAdminInitialization() {
        // Create an admin
        Admin admin = new Admin("Admin1", "admin123", "admin@example.com");

        // Check if the admin's username, password, and email are set correctly
        Assert.assertEquals("Admin1", admin.getUsername());
        Assert.assertEquals("admin123", admin.getPassword());
        Assert.assertEquals("admin@example.com", admin.getEmail());
    }

    @Test
    public void testAdminSetters() {
        // Create an admin
        Admin admin = new Admin("Admin1", "admin123", "admin@example.com");

        // Set new values for username, password, and email
        admin.setUsername("Admin2");
        admin.setPassword("newadmin456");
        admin.setEmail("admin2@example.com");

        // Check if the new values are set correctly
        Assert.assertEquals("Admin2", admin.getUsername());
        Assert.assertEquals("newadmin456", admin.getPassword());
        Assert.assertEquals("admin2@example.com", admin.getEmail());
    }
}