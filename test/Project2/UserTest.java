package Project2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserTest {

    private User user;

    @Before
    public void setUp() {
        user = new User("john123", "password123", "john@example.com");
    }

    @Test
    public void testGetters() {
        // Assert
        Assert.assertEquals("john123", user.getUsername());
        Assert.assertEquals("password123", user.getPassword());
        Assert.assertEquals("john@example.com", user.getEmail());
    }

    @Test
    public void testSetters() {
        // Act
        user.setUsername("johnDoe");
        user.setPassword("newPassword");
        user.setEmail("john.doe@example.com");

        // Assert
        Assert.assertEquals("johnDoe", user.getUsername());
        Assert.assertEquals("newPassword", user.getPassword());
        Assert.assertEquals("john.doe@example.com", user.getEmail());
    }

    @Test
    public void testToString() {
        // Assert
        Assert.assertEquals("john123\njohn@example.com", user.toString());
    }
}