package Project2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class BrowseWindow extends JFrame{
    private JList<String> productList;
    private ProductManager products;
    private JButton addToCartButton;

    public BrowseWindow() {
        setTitle("Browse Products");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Creates model of products
        products = new ProductManager();
        // Create product list
        DefaultListModel<String> model = new DefaultListModel<>();
        for (Product product : products.getAllProducts()){
            model.addElement(product.getProductName() + " $" + product.getProductPrice());
        }
        
        
        
        productList = new JList<>(model);

        // Create add to cart button
        addToCartButton = new JButton("Add to Cart");
        addToCartButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedProduct = productList.getSelectedValue();

                // Add selected product to the shopping cart
                ShoppingCart cart = ShoppingCart.getInstance();
                cart.addProduct(selectedProduct);

                JOptionPane.showMessageDialog(BrowseWindow.this, selectedProduct + " added to cart.");
            }
        });

        // Add components to the browse window
        setLayout(new BorderLayout());
        add(new JScrollPane(productList), BorderLayout.CENTER);
        add(addToCartButton, BorderLayout.SOUTH);
    }
    
}
