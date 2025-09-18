package ca.weblite.jdeployTemplateSwing;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;

import java.awt.*;
import java.awt.event.*;

import java.lang.management.ManagementFactory;

public class Main extends JFrame {

    private JPanel contentPanel;

    public Main() {
        // Window setup
        setTitle("EaglercraftX: " + ManagementFactory.getRuntimeMXBean().getName());
        setIconImage(Toolkit.getDefaultToolkit().getImage("icon32.png"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 140);
        setLocationRelativeTo(null); // Center window
        setResizable(false);
        setLayout(new BorderLayout());

        // Separator at the top
        add(new JSeparator(), BorderLayout.NORTH);

        // Content Panel
        contentPanel = new JPanel();
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPanel.setLayout(null);

        JLabel label = new JLabel("Launch RenderDoc and press OK to continue...");
        label.setBounds(10, 10, 265, 14);
        contentPanel.add(label);

        add(contentPanel, BorderLayout.CENTER);

        // Button Panel
        JPanel buttonPane = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        buttonPane.setBackground(Color.WHITE);

        JButton okButton = new JButton("OK");
        okButton.setPreferredSize(new Dimension(60, 20));
        okButton.setMargin(new Insets(0, 0, 0, 0));
        okButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "You pressed OK. Implement your logic here.");
        });
        buttonPane.add(okButton);
        getRootPane().setDefaultButton(okButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setPreferredSize(new Dimension(60, 20));
        cancelButton.setMargin(new Insets(0, 0, 0, 0));
        cancelButton.addActionListener(e -> {
            System.exit(0);
        });
        buttonPane.add(cancelButton);

        add(buttonPane, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main frame = new Main();
            frame.setVisible(true);
        });
    }
}
