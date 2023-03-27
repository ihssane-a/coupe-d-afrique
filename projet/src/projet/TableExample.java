package projet;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class TableExample extends JFrame {
    private JTable table;
    private DefaultTableModel model;
    private JButton addButton;
    private JButton removeButton;
    private JButton editButton;
    private String filePath = "data.txt";

    public TableExample() {
        super("Première journée");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create table model
        model = new DefaultTableModel();
        model.addColumn("équipe1");
        model.addColumn("score1");
        model.addColumn("score2");
        model.addColumn("équipe2");

        // Load data from file
        loadData();

        // Create table
        table = new JTable(model);

        // Create buttons
        addButton = new JButton("Ajouter");
        removeButton = new JButton("Supprimer");
        editButton = new JButton("Modifier");

        // Add action listeners
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add new row to table
                model.addRow(new Object[] {"", "", "", ""});
            }
        });
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Remove selected row from table
                int row = table.getSelectedRow();
                if (row != -1) {
                    model.removeRow(row);
                }
            }
        });
        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Edit selected row in table
                int row = table.getSelectedRow();
                if (row != -1) {
                    for (int i = 0; i < 4; i++) {
                        String value = JOptionPane.showInputDialog(TableExample.this, "Entrer la valeur de la colonne " + (i + 1));
                        model.setValueAt(value, row, i);
                    }
                }
            }
        });

        // Add components to frame
        add(new JScrollPane(table), BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        buttonPanel.add(editButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Add window listener to save data when window is closed
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                saveData();
            }
        });

        pack();
    }

    private void loadData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] rowData = line.split("\t");
                model.addRow(rowData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveData() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    writer.print(model.getValueAt(i, j));
                    if (j < model.getColumnCount() - 1) {
                        writer.print("\t");
                    }
                }
                writer.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TableExample().setVisible(true);
            }
        });
    }
}


