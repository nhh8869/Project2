package Project2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RemoveProductWindow extends JFrame {
    private JTextField productNameField;
    private JButton addButton;

    //  Add product window
    public RemoveProductWindow() {
        setTitle("Remove Product");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create product name label and text field
        JLabel productNameLabel = new JLabel("Product Name:");
        productNameField = new JTextField(20);

        // Create add button
        addButton = new JButton("Remove");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String productName = productNameField.getText();

                // Remove the new product to the product list
                ProductManager productManager = new ProductManager();
                productManager.removeProduct(productName);
                
                JOptionPane.showMessageDialog(RemoveProductWindow.this, "Product removed successfully.");

                // Close the remove product window
                dispose();
            }
        });

        // Add components to the add product window
        setLayout(new GridLayout(4, 3));
        add(productNameLabel);
        add(productNameField);
        add(new JLabel());
        add(addButton);
    }
}
