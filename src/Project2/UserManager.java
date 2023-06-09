package Project2;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> userList;
    
    //  Constructor creates a cutomer and admin user
    public UserManager(){
        userList = new ArrayList<>();
        userList.add(new Admin("Will", "password", "will@store.com"));
        userList.add(new Customer("Customer Test", "test", "test@test.com"));
    }
    
    //  Contructor for new user
    public UserManager(String username, String password, String email){
        for (User user : userList){
            if (user.getUsername() != username){
                userList.add(new User(username, password, email));
            }
        }
    }
    
    //  User authentication 
    public User userAuth(String username, String password){
        for (User user : userList){
            if (user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }
    
    //  Deletes a user
    public void deleteUser(String username){
        for (User user : userList){
            if (user.getUsername() == username){
                userList.remove(user);
            }
        }
    }
}
