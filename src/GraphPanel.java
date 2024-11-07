import javax.swing.*;
import java.awt.*;

class GraphPanel extends JPanel {
    public GraphPanel() {
        setLayout(new BorderLayout());
        JLabel titleLabel = new JLabel("Graphs", SwingConstants.CENTER);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 25));
        add(titleLabel, BorderLayout.NORTH);

        // Placeholder for graph components
    }
}
