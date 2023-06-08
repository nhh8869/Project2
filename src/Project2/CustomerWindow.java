package Project2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CustomerWindow extends UserWindow{
    private JButton viewCartButton;
    private JButton checkoutButton;
    
    public CustomerWindow(Customer customer){
        super(customer);
        setTitle("Customer Window");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        viewCartButton = new JButton("View Cart");
        viewCartButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShoppingCart cart = ShoppingCart.getInstance();
                List<String> cartItems = cart.getCartItems();

                StringBuilder message = new StringBuilder();
                message.append("Cart Items:\n");
                for (String item : cartItems) {
                    message.append("- ").append(item).append("\n");
                }

                JOptionPane.showMessageDialog(CustomerWindow.this, message.toString());
            }
        });
        
        // Checkout button
        checkoutButton = new JButton("Checkout");   
        checkoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShoppingCart cart = ShoppingCart.getInstance();
                List<String> cartItems = cart.getCartItems();

                StringBuilder message = new StringBuilder();
                message.append("Cart Items:\n");
                for (String item : cartItems) {
                    message.append("- ").append(item).append("\n");
                }
                message.append("Total Cost: $" + cart.calculateTotalCost());
                
                JOptionPane.showMessageDialog(CustomerWindow.this, message.toString());
                
                StringBuilder recipt = new StringBuilder();
                recipt.append("Order for: " + user.getUsername() + "\nEmail: " + user.getEmail() + "\nOrder Confirmed");
                JOptionPane.showMessageDialog(CustomerWindow.this, recipt);
            }
        });

        setLayout(new FlowLayout());
        add(viewCartButton);
        add(checkoutButton);
    }
}
