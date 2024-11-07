import javax.swing.*;
import java.awt.*;

class DashboardPanel extends JPanel {
    public DashboardPanel() {
        setLayout(new BorderLayout());
        JLabel welcomeLabel = new JLabel(" Welcome to Teal", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("SansSerif", Font.BOLD, 25));
        add(welcomeLabel, BorderLayout.CENTER);

        JLabel versionLabel = new JLabel(" v0.2b ", SwingConstants.CENTER);
        versionLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        add(versionLabel, BorderLayout.SOUTH);
    }
}
