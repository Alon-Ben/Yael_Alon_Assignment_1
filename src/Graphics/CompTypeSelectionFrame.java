package Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompTypeSelectionFrame extends JFrame {
    private JPanel selection_type_panel;
    private JButton b_Air;
    private JButton b_Water;
    private JButton b_Terre;

    private CompetitionFrame mainFrame;

    public CompTypeSelectionFrame(CompetitionFrame mainFrame)
    {
        this.mainFrame = mainFrame;


        selection_type_panel = new JPanel(); // middle_panel is the Competition Panel
        selection_type_panel.setLayout(new GridLayout(3,1, 20, 20));

        b_Air   = new JButton("Air");
        b_Water = new JButton("Water");
        b_Terre = new JButton("Terrestrial");

        b_Air.addActionListener(new CompTypeSelectionFrame.ButtonEventListener());
        b_Water.addActionListener(new CompTypeSelectionFrame.ButtonEventListener());
        b_Terre.addActionListener(new CompTypeSelectionFrame.ButtonEventListener());

        selection_type_panel.add(b_Air);
        selection_type_panel.add(b_Water);
        selection_type_panel.add(b_Terre);

        this.add(selection_type_panel);

        this.setTitle("Type Selection");
        this.setBounds(70, 70, 250, 250);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);

        this.setVisible(true);

    }

    private void custom_close(){
        this.dispose();
    }

    public class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            switch (command) {
                case "Air":
                    mainFrame.setAnimalFamily(AnimalFamily.Air);
                    custom_close();
                    break;
                case "Water":
                    mainFrame.setAnimalFamily(AnimalFamily.Water);
                    custom_close();
                    break;
                case "Terrestrial":
                    mainFrame.setAnimalFamily(AnimalFamily.Terrestrial);
                    custom_close();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Button not exists", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}
