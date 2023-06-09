package Project2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserManagerTest {

    private UserManager userManager;

    @Before
    public void setUp() {
        userManager = new UserManager();
    }

    @Test
    public void testUserAuth() {
        // Act
        User authenticatedUser = userManager.userAuth("Will", "password");

        // Assert
        Assert.assertNotNull(authenticatedUser);
        Assert.assertEquals("Will", authenticatedUser.getUsername());
        Assert.assertEquals("password", authenticatedUser.getPassword());
        Assert.assertEquals("will@store.com", authenticatedUser.getEmail());
    }

    @Test
    public void testUserAuth_InvalidCredentials() {
        // Act
        User authenticatedUser = userManager.userAuth("Will", "wrongPassword");

        // Assert
        Assert.assertNull(authenticatedUser);
    }

    @Test
    public void testDeleteUser() {
        // Act
        userManager.deleteUser("Customer Test");

        // Assert
        User deletedUser = userManager.userAuth("Customer Test", "test");
        Assert.assertNull(deletedUser);
    }
}