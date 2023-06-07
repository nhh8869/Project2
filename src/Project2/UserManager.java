package Project2;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> userList = new ArrayList<>();
    
    public UserManager(String username, String password, String email){
        for (User user : userList){
            if (user.getUsername() != username){
                userList.add(new User(username, password, email));
            }
        }
    }
    
    public User userAuth(String username, String password){
        for (User user : userList){
            if (user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }
    
    public void deleteUser(String username){
        for (User user : userList){
            if (user.getUsername() == username){
                userList.remove(user);
            }
        }
    }
    
}
