package Project2;

public class AdminWindow extends UserWindow{
    private JButton manageProductsButton;
    
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

        setLayout(new FlowLayout());
        add(manageProductsButton);
    }
}
