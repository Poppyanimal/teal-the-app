import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class TransactionPanel extends JPanel {
    private JLabel balanceLabel;
    private JPanel transactionsList;
    private double balance = 0.0;
    private List<Transaction> transactions;
    private List<String> categories;

    public TransactionPanel() {
        transactions = new ArrayList<>();
        categories = new ArrayList<>(List.of("Food", "Rent", "Utilities", "Leisure"));

        setLayout(new BorderLayout());

        // Title and Balance
        JLabel titleLabel = new JLabel(" Transactions ", SwingConstants.CENTER);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 25));
        balanceLabel = new JLabel(" Balance: $" + String.format("%.2f", balance), SwingConstants.LEFT);
        balanceLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));

        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.add(titleLabel, BorderLayout.NORTH);
        headerPanel.add(balanceLabel, BorderLayout.WEST);

        // Add New Transaction Button
        JButton addTransactionButton = new JButton(" Add New Transaction ");
        addTransactionButton.addActionListener(new AddTransactionAction());
        headerPanel.add(addTransactionButton, BorderLayout.EAST);

        // Filter by time dropdown
        JComboBox<String> timeFilter = new JComboBox<>(new String[]{"Last 30 days", "Month", "Year"});
        JPanel filterPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        filterPanel.add(new JLabel("Recent Transactions"));
        filterPanel.add(timeFilter);

        // Recent transactions list panel
        transactionsList = new JPanel();
        transactionsList.setLayout(new BoxLayout(transactionsList, BoxLayout.Y_AXIS));
        transactionsList.setBackground(Color.WHITE);
        transactionsList.setPreferredSize(new Dimension(550, 450));

        // Scrollable transaction list
        JScrollPane scrollPane = new JScrollPane(transactionsList, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        //scrollPane.setPreferredSize(new Dimension(600, 500));

        // Ensure scroll pane resizes dynamically
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        // Add components to main panel
        add(headerPanel, BorderLayout.NORTH);
        add(filterPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        // Add initial blank placeholders
        addPlaceholderTransactions(5);
    }

    // Method to add placeholders
    private void addPlaceholderTransactions(int count) {
        transactionsList.removeAll();  // Clear the existing list
        for (int i = 0; i < count; i++) {
            JPanel transactionPanel = new JPanel();
            transactionPanel.setLayout(new BorderLayout());
            transactionPanel.setPreferredSize(new Dimension(600, 40));
            transactionPanel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

            JLabel placeholderLabel = new JLabel("No transaction data available", SwingConstants.LEFT);
            placeholderLabel.setForeground(Color.GRAY);
            transactionPanel.add(placeholderLabel, BorderLayout.CENTER);

            transactionsList.add(transactionPanel);
        }
        revalidate();
        repaint();
    }

    // Method to update balance label
    private void updateBalance() {
        balanceLabel.setText("Balance: $" + String.format("%.2f", balance));
    }

    // Action listener to add a new transaction
    private class AddTransactionAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Create dialog components
            JTextField dateField = new JTextField(10);
            JTextField descriptionField = new JTextField(20);
            JTextField amountField = new JTextField(10);

            // Category dropdown and "Add New Category" option
            JComboBox<String> categoryDropdown = new JComboBox<>(categories.toArray(new String[0]));
            categoryDropdown.addItem("Add New Category");

            // Panel for the dialog
            JPanel dialogPanel = new JPanel();
            dialogPanel.setLayout(new GridLayout(4, 2));
            dialogPanel.add(new JLabel("Date (MM/DD/YYYY):"));
            dialogPanel.add(dateField);
            dialogPanel.add(new JLabel("Description:"));
            dialogPanel.add(descriptionField);
            dialogPanel.add(new JLabel("Category:"));
            dialogPanel.add(categoryDropdown);
            dialogPanel.add(new JLabel("Amount:"));
            dialogPanel.add(amountField);

            // Event listener to handle "Add New Category" selection
            categoryDropdown.addActionListener(event -> {
                if ("Add New Category".equals(categoryDropdown.getSelectedItem())) {
                    String newCategory = JOptionPane.showInputDialog(null, "Enter new category name:");
                    if (newCategory != null && !newCategory.trim().isEmpty()) {
                        categories.add(newCategory);
                        categoryDropdown.insertItemAt(newCategory, categoryDropdown.getItemCount() - 1);
                        categoryDropdown.setSelectedItem(newCategory);  // Set the new category as selected
                    } else {
                        categoryDropdown.setSelectedIndex(0);  // Reset to the first option if cancelled
                    }
                }
            });

            // Custom dialog with OK and Cancel buttons
            int result = JOptionPane.showOptionDialog(null, dialogPanel, "Add New Transaction",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[]{"OK", "Cancel"}, "OK");

            if (result == JOptionPane.OK_OPTION) {
                try {
                    String date = dateField.getText();
                    String description = descriptionField.getText();
                    String category = (String) categoryDropdown.getSelectedItem();
                    double amount = Double.parseDouble(amountField.getText());

                    // Update balance
                    balance += amount;
                    updateBalance();

                    // Add transaction to list and refresh UI
                    Transaction transaction = new Transaction(date, description, category, amount);
                    transactions.add(transaction);
                    displayTransactions();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid amount entered. Please enter a valid number.");
                }
            }
        }
    }

    // Method to display transactions without replacing the list entirely
    private void displayTransactions() {
        // Create a new transaction panel for the latest transaction
        JPanel transactionPanel = new JPanel();
        transactionPanel.setLayout(new BorderLayout());
        transactionPanel.setPreferredSize(new Dimension(600, 40));
        transactionPanel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

        // Get the last added transaction
        Transaction transaction = transactions.get(transactions.size() - 1);
        JLabel transactionLabel = new JLabel(transaction.toString());
        transactionPanel.add(transactionLabel, BorderLayout.CENTER);

        // If there are placeholders, remove them and add the first real transaction
        if (transactionsList.getComponentCount() > 0) {
            transactionsList.removeAll();
        }

        // Add the new transaction
        transactionsList.add(transactionPanel);

        // Add the remaining transactions if any (to avoid clearing all)
        for (int i = 0; i < transactions.size() - 1; i++) {
            Transaction oldTransaction = transactions.get(i);
            JPanel oldTransactionPanel = new JPanel();
            oldTransactionPanel.setLayout(new BorderLayout());
            oldTransactionPanel.setPreferredSize(new Dimension(600, 40));
            oldTransactionPanel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            oldTransactionPanel.add(new JLabel(oldTransaction.toString()), BorderLayout.CENTER);
            transactionsList.add(oldTransactionPanel);
        }

        // Revalidate and repaint to reflect changes
        revalidate();
        repaint();

        // Ensure the scroll pane is scrolled to the bottom
        JScrollBar verticalScrollBar = ((JScrollPane) transactionsList.getParent().getParent()).getVerticalScrollBar();
        verticalScrollBar.setValue(verticalScrollBar.getMaximum());
    }

    // Inner class to represent a transaction
    public static class Transaction {
        private final String date;
        private final String description;
        private final String category;
        private final double amount;

        public Transaction(String date, String description, String category, double amount) {
            this.date = date;
            this.description = description;
            this.category = category;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return String.format("%s  |  %s  |  %s  |  $%.2f", date, description, category, amount);
        }
    }
}