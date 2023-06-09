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
        
        // Create view cart button
        viewCartButton = new JButton("View Cart");
        viewCartButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShoppingCart cart = ShoppingCart.getInstance();
                List<String> cartItems = cart.getCartItems();

                //  String builder for message
                StringBuilder message = new StringBuilder();
                message.append("Cart Items:\n");
                for (String item : cartItems) {     //  Loop to add to string
                    message.append("- ").append(item).append("\n");
                }

                //  Shows message
                JOptionPane.showMessageDialog(CustomerWindow.this, message.toString());
            }
        });
        
        // Create Checkout button
        checkoutButton = new JButton("Checkout");   
        checkoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShoppingCart cart = ShoppingCart.getInstance();
                List<String> cartItems = cart.getCartItems();

                //  String builder for message
                StringBuilder message = new StringBuilder();
                message.append("Cart Items:\n");
                for (String item : cartItems) {     //  Loop to add to string
                    message.append("- ").append(item).append("\n");
                }
                
                // Add total cost to message
                message.append("Total Cost: $" + cart.calculateTotalCost());
                
                //  Shows message
                JOptionPane.showMessageDialog(CustomerWindow.this, message.toString());
                
                StringBuilder recipt = new StringBuilder();
                
                // Create recipt message and shows
                recipt.append("Order for: " + user.getUsername() + "\nEmail: " + user.getEmail() + "\nOrder Confirmed");
                JOptionPane.showMessageDialog(CustomerWindow.this, recipt);
            }
        });

        
        //  Add components
        setLayout(new FlowLayout());
        add(viewCartButton);
        add(checkoutButton);
    }
}
