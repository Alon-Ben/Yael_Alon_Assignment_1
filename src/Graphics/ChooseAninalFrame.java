package Graphics;


import Animals.Animal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseAninalFrame extends JFrame {
    private JPanel global_panel;


    private JLabel t_tittle;
    private JComboBox combo_box;
    JButton b_Add;

    AnimalFamily animalFamily;
    CompetitionFrame.ContainerAnimals containerAnimals;

    public ChooseAninalFrame(CompetitionFrame.ContainerAnimals containerAnimals_temp, AnimalFamily temp)
    {
        this.containerAnimals = containerAnimals_temp;
        this.animalFamily = temp;

        global_panel = new JPanel();
        global_panel.setLayout(new BorderLayout(5, 5));


        t_tittle = new JLabel("       " +
                "Please choose the animal.");

        String[] options = null;//= new String[]{"ERROR"};

        switch (animalFamily){
            case Air:
                options = new String[]{"Eagle", "Pigeon"};
                break;
            case Water:
                options = new String[]{"Alligator", "Dolphin", "Whale"};
                break;
            case Terrestrial:
                options = new String[]{"Cat", "Dog", "Snake"};
                break;
        }

        combo_box = new JComboBox(options);//todo


        b_Add = new JButton("Continue");
        b_Add.addActionListener(new ChooseAninalFrame.ButtonEventListener());


        global_panel.add(t_tittle, BorderLayout.NORTH);
        global_panel.add(combo_box, BorderLayout.CENTER);
        global_panel.add(b_Add, BorderLayout.SOUTH);

        this.add(global_panel);


        this.setTitle("Choose Animal");
        this.setBounds(150, 150, 250, 150);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    private void redirrect(){

        AddAnimalDialog aad_frame;

        if(animalFamily == AnimalFamily.Air){
            if (combo_box.getSelectedItem().toString().equals("Eagle")){
                aad_frame = new AddAnimalDialog(containerAnimals, animalFamily, AnimalType.Eagle);
            }
            else if (combo_box.getSelectedItem().toString().equals("Pigeon")){
                aad_frame = new AddAnimalDialog(containerAnimals, animalFamily, AnimalType.Pigeon);
            }

        }
        else if(animalFamily == AnimalFamily.Water){
            if (combo_box.getSelectedItem().toString().equals("Alligator")){
                aad_frame = new AddAnimalDialog(containerAnimals, animalFamily, AnimalType.Alligator);
            }
            else if (combo_box.getSelectedItem().toString().equals("Dolphin")){
                aad_frame = new AddAnimalDialog(containerAnimals, animalFamily, AnimalType.Dolphin);
            }
            else if (combo_box.getSelectedItem().toString().equals("Whale")){
                aad_frame = new AddAnimalDialog(containerAnimals, animalFamily, AnimalType.Whale);
            }

        }
        else if(animalFamily == AnimalFamily.Terrestrial){
            if (combo_box.getSelectedItem().toString().equals("Cat")){
                aad_frame = new AddAnimalDialog(containerAnimals, animalFamily, AnimalType.Cat);
            }
            else if (combo_box.getSelectedItem().toString().equals("Dog")){
                aad_frame = new AddAnimalDialog(containerAnimals, animalFamily, AnimalType.Dog);
            }
            else if (combo_box.getSelectedItem().toString().equals("Snake")){
                aad_frame = new AddAnimalDialog(containerAnimals, animalFamily, AnimalType.Snake);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR aad_frame","Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void custom_close(){
        this.dispose();
    }

    public class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            switch (command) {
                case "Continue":
                    redirrect();
                    custom_close();
                    //JOptionPane.showMessageDialog(null, "Button Add", "Add", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Button not exists", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}
