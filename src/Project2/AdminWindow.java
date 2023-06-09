package Project2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AdminWindow extends UserWindow{
    private JButton manageProductsButton;
    
    //  Admin window
    public AdminWindow(Admin admin) {
        super(admin);
        setTitle("Admin Window");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create manage products button
        manageProductsButton = new JButton("Manage Products");
        manageProductsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the product management window
                ProductManagementWindow productManagementWindow = new ProductManagementWindow();
                productManagementWindow.show();
            }
        });

        //  Add components
        setLayout(new FlowLayout());
        add(manageProductsButton);
    }
}
