package Project2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ProductManagementWindow extends JFrame{
    private JButton addProductButton;
    private JButton removeProductButton;
    
    //  Product management window
    public ProductManagementWindow() {
        setTitle("Product Management");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create add product button
        addProductButton = new JButton("Add Product");
        addProductButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the add product window
                AddProductWindow addProductWindow = new AddProductWindow();
                addProductWindow.show();
            }
        });
        
        //  Create remove product button
        removeProductButton = new JButton("Remove Product");
        removeProductButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the add product window
                //removeProductWindow removeProductWindow = new RemoveProduct();
                //removeProductWindow.show();
            }
        });

        // Add components to the product management window
        setLayout(new FlowLayout());
        add(addProductButton);
        add(removeProductButton);
    }
}
