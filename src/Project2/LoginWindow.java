package Project2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginWindow extends JFrame{
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    
    public LoginWindow() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);
        
        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);
                
                UserManager authenticator = new UserManager();
                User user = authenticator.userAuth(username, password);

                if (user != null) {
                    // Create a user-specific window based on their role
                    UserWindow userWindow;
                    if (user instanceof Customer) {
                        userWindow = new CustomerWindow((Customer) user);
                    } else if (user instanceof Admin) {
                        userWindow = new AdminWindow((Admin) user);
                    } else {
                        // Handle other user roles
                        return;
                    }
                    userWindow.show();
                } else {
                    JOptionPane.showMessageDialog(LoginWindow.this, "Invalid credentials. Please try again.");
                }
            }
        });
        setLayout(new GridLayout(3, 2));
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel());
        add(loginButton);
    }
}
