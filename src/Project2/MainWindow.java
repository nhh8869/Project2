package Project2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame{
    private JButton loginButton;
    private JButton browseButton;
    
    public MainWindow(){
        setTitle("Will's Clothing Online Shopping Store");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //  Create login button
        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                LoginWindow loginWindow = new LoginWindow();
                loginWindow.show();
            }
        });
        
        //  Create Browse button
        browseButton = new JButton("Browse Products");
        browseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BrowseWindow browseWindow = new BrowseWindow();
                browseWindow.show();
            }
        });
        
        // Add to layout
        setLayout(new FlowLayout());
        add(loginButton);
        add(browseButton);
    }
}
