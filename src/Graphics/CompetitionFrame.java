package Graphics;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class CompetitionFrame extends JFrame {


    public CompetitionFrame() {
        JFrame frame = new JFrame("Animal Competition");
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(80,80,80,80));
        panel.setLayout(new GridLayout(2,1));

        GridBagConstraints gbc = new GridBagConstraints();
        JButton button1 = new JButton("Button 1");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(button1, gbc);

        JButton button2 = new JButton("Button 2");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(button2, gbc);

        JButton button3 = new JButton("Button 3");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(button3, gbc);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Animal Competition");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CompetitionFrame();
            }
        });
    }

}