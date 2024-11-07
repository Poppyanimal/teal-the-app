import javax.swing.*;
import java.awt.*;

public class TealApp extends JFrame {

    private final JPanel mainContentPanel;

    public TealApp() {
        setTitle("Teal The App");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Sidebar panel with specified width
        JPanel sidebar = new JPanel();
        sidebar.setPreferredSize(new Dimension(200, 600)); // Set width to 200px
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setBackground(new Color(0, 204, 204)); // Teal color

        JLabel appName = new JLabel(" Teal The App ", SwingConstants.CENTER);
        appName.setFont(new Font("SansSerif", Font.BOLD, 20));
        appName.setAlignmentX(Component.CENTER_ALIGNMENT);
        sidebar.add(appName);

        // Adding space around buttons for padding
        JButton dashboardButton = createSidebarButton(" Dashboard ");
        JButton transactionButton = createSidebarButton(" Transaction ");
        JButton graphButton = createSidebarButton(" Graphs ");
        JButton addButton = createSidebarButton(" + ");

        // Add buttons to sidebar with spacing
        sidebar.add(Box.createVerticalStrut(150)); // Space above buttons
        sidebar.add(dashboardButton);
        sidebar.add(Box.createVerticalStrut(10)); // Space between buttons
        sidebar.add(transactionButton);
        sidebar.add(Box.createVerticalStrut(10));
        sidebar.add(graphButton);
        sidebar.add(Box.createVerticalStrut(10));
        sidebar.add(addButton);

        // Main content panel
        mainContentPanel = new JPanel(new CardLayout());
        mainContentPanel.add(new DashboardPanel(), "Dashboard");
        mainContentPanel.add(new TransactionPanel(), "Transaction");
        mainContentPanel.add(new GraphPanel(), "Graphs");

        // Action listeners to switch views
        dashboardButton.addActionListener(e -> showPanel("Dashboard"));
        transactionButton.addActionListener(e -> showPanel("Transaction"));
        graphButton.addActionListener(e -> showPanel("Graphs"));
        addButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Add New Feature"));

        // Add sidebar to the left side of the frame
        add(sidebar, BorderLayout.WEST);
        add(mainContentPanel, BorderLayout.CENTER);
    }

    private JButton createSidebarButton(String text) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setMaximumSize(new Dimension(180, 40)); // Set button size
        return button;
    }

    private void showPanel(String panelName) {
        CardLayout cl = (CardLayout) (mainContentPanel.getLayout());
        cl.show(mainContentPanel, panelName);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TealApp app = new TealApp();
            app.setVisible(true);
        });
    }
}