package Project2;

public class User {
    private String username;
    private String password;
    private String email;
    
    //  Contructor
    public User(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }
    
    //  Get name
    public String getUsername(){
        return this.username;
    }
    
    // Get password
    public String getPassword(){
        return this.password;
    }
    
    //  Get email
    public String getEmail(){
        return this.email;
    }
    
    // Set name
    public void setUsername(String username){
        this.username = username;
    }
    
    //  Set password
    public void setPassword(String password){
        this.password = password;
    }
    
    // Set email
    public void setEmail(String email){
        this.email = email;
    }
    
    // String
    public String toString(){
        return this.username + "\n" + this.email;
    }
}
