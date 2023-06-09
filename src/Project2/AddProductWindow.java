package Project2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddProductWindow extends JFrame {
    private JTextField productNameField;
    private JTextField productPriceField;
    private JButton addButton;

    public AddProductWindow() {
        setTitle("Add Product");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create product name label and text field
        JLabel productNameLabel = new JLabel("Product Name:");
        productNameField = new JTextField(20);

        // Create product price label and text field
        JLabel productPriceLabel = new JLabel("Product Price:");
        productPriceField = new JTextField(20);

        // Create add button
        addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String productName = productNameField.getText();
                double productPrice = Double.parseDouble(productPriceField.getText());

                // Add the new product to the product list
                ProductManager productManager = new ProductManager();
                productManager.addProduct(new Product(productName, productPrice));
                
                JOptionPane.showMessageDialog(AddProductWindow.this, "Product added successfully.");

                // Close the add product window
                dispose();
            }
        });

        // Add components to the add product window
        setLayout(new GridLayout(3, 2));
        add(productNameLabel);
        add(productNameField);
        add(productPriceLabel);
        add(productPriceField);
        add(new JLabel());
        add(addButton);
    }
}
