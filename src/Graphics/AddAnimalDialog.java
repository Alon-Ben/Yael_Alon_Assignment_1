package Graphics;

import javax.swing.*;
import Animals.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Animals.Animal.Gender;


public class AddAnimalDialog extends JDialog {
    private final JPanel global_panel;

    private final JPanel top_panel;
    private final JPanel center_panel;
    private final JPanel custom_panel;
    private final JPanel bottom_panel;



    private final JLabel t_tittle;

    //left---------------------------------------
    private final JLabel t_name;
    private final JLabel t_gender;
    private final JLabel t_weight;
    private final JLabel t_speed;
    private final JLabel t_medals;
    private final JLabel t_maxEnergy;
    private final JLabel t_energyPerMeter;

    //--Water
    private JLabel t_diveDept;

    private JLabel t_areaOfLiving;
    private JLabel t_foodType;
    private JLabel t_isWaterSweet;// 0 - Sea , 1 - Sweet

    //--Terra
    private JLabel t_breed;
    private JLabel t_castrated;
    private JLabel t_s_length;
    private JLabel t_poisonous;

    //--Air
    private JLabel t_wingspan;

    private JLabel t_altitudeOfFlight;
    private JLabel t_family;

    //right---------------------------------------
    private final JTextField t_name_format;
    private final JComboBox combo_gender;
    private final JTextField t_weight_format;
    private final JTextField t_speed_format;
    private final JComboBox combo_medals;
    private final JTextField t_maxEnergy_format;
    private final JTextField t_energyPerMeter_format;

    //--Water
    private JTextField t_diveDept_format;

    private JTextField t_areaOfLiving_format;
    private JTextField t_foodType_format;
    private JComboBox combo_isWaterSweet;

    //--Terr_format;
    private JTextField t_breed_format;
    private JComboBox combo_castrated;
    private JTextField t_s_length_format;
    private JComboBox combo_poisonous;

    //--Air_format;
    private JTextField t_wingspan_format;

    private JTextField t_altitudeOfFlight_format;
    private JTextField t_family_format;




    JButton b_Add;

    CompetitionFrame.ContainerAnimals containerAnimals;
    AnimalFamily animalFamily;
    AnimalType animalType;

    public AddAnimalDialog(CompetitionFrame.ContainerAnimals containerAnimals_temp, AnimalFamily animalFamily_temp, AnimalType animalType_temp)
    {
        this.containerAnimals = containerAnimals_temp;
        this.animalFamily = animalFamily_temp;
        this.animalType = animalType_temp;


        global_panel = new JPanel();
        global_panel.setLayout(new BorderLayout(5, 5));


        top_panel = new JPanel();
        top_panel.setLayout(new BorderLayout(5, 5));

        center_panel = new JPanel();
        center_panel.setLayout(new GridLayout(0,2, 1, 1));
        //center_panel.setSize(new Dimension(400, 575));

        bottom_panel = new JPanel();
        bottom_panel.setLayout(new BorderLayout(5, 5));

        custom_panel = new JPanel();
        custom_panel.setLayout(new GridLayout(0,2, 1, 1));


        t_tittle = new JLabel(
                "                             " +
                        "Enter the properties of an animal.");

        t_name = new JLabel("Name: ");
        t_name_format = new JTextField("");

        t_gender = new JLabel("Gender: ");
        combo_gender = new JComboBox(new String[]{"Male", "Female"});

        t_weight = new JLabel("Weight: ");
        t_weight_format = new JTextField("");

        t_speed = new JLabel("Speed: ");
        t_speed_format = new JTextField("");

        t_medals = new JLabel("Medals: ");
        combo_medals = new JComboBox(new String[]{"None", "Bronze", "Silver", "Gold"});

        t_maxEnergy = new JLabel("Max Energy: ");
        t_maxEnergy_format = new JTextField("");

        t_energyPerMeter = new JLabel("Energy Per Meter: ");
        t_energyPerMeter_format = new JTextField("");



        b_Add = new JButton("Add");

        //t_name          .setBounds(100, 80, 150, 40);
        //t_gender        .setBounds(100, 80, 150, 40);
        //t_weight        .setBounds(100, 80, 150, 40);
        //t_speed         .setBounds(100, 80, 150, 40);
        //t_medals        .setBounds(100, 80, 150, 40);
        //t_name_format   .setBounds(100, 80, 150, 40);
        //t_weight_format .setBounds(100, 80, 150, 40);
        //t_speed_format  .setBounds(100, 80, 150, 40);

        b_Add.addActionListener(new AddAnimalDialog.ButtonEventListener());






        //todo write on the switch cases and create animal objects array that competition panel add to paint animal

        switch (animalFamily) {
            case Water:

                t_diveDept = new JLabel("Dive Dept: ");
                t_diveDept_format = new JTextField("");

                custom_panel.add(t_diveDept       );
                custom_panel.add(t_diveDept_format);

                switch (animalType) {
                    case Alligator:
                        t_areaOfLiving        = new JLabel("Area Of Living: ");
                        t_areaOfLiving_format = new JTextField("");

                        custom_panel.add(t_areaOfLiving       );
                        custom_panel.add(t_areaOfLiving_format);
                        break;

                    case Whale:
                        t_foodType        = new JLabel("Food Type: ");
                        t_foodType_format = new JTextField("");

                        custom_panel.add(t_foodType       );
                        custom_panel.add(t_foodType_format);
                        break;

                    case Dolphin:
                        t_isWaterSweet     = new JLabel("is Water Sweet: ");
                        combo_isWaterSweet = new JComboBox(new String[]{"No", "Yes"});

                        custom_panel.add(t_isWaterSweet     );
                        custom_panel.add(combo_isWaterSweet );
                        break;

                    default:
                        break;
                }
                break;



            case Terrestrial:
                switch (animalType) {

                    case Dog:
                        t_breed        = new JLabel("Breed: ");
                        t_breed_format = new JTextField("");

                        custom_panel.add(t_breed       );
                        custom_panel.add(t_breed_format);
                        break;

                    case Cat:
                        t_castrated        = new JLabel("is castrated: ");
                        combo_castrated = new JComboBox(new String[]{"No", "Yes"});

                        custom_panel.add(t_castrated       );
                        custom_panel.add(combo_castrated);
                        break;

                    case Snake:

                        t_s_length        = new JLabel("Snake length: ");
                        t_s_length_format = new JTextField("");

                        custom_panel.add(t_s_length       );
                        custom_panel.add(t_s_length_format);


                        t_poisonous        = new JLabel("is poisonous: ");
                        combo_poisonous = new JComboBox(new String[]{"No", "Yes"});

                        custom_panel.add(t_poisonous       );
                        custom_panel.add(combo_poisonous);
                        break;

                    default:
                        break;
                }
                break;

            case Air:

                t_wingspan        = new JLabel("Wingspan: ");
                t_wingspan_format = new JTextField("");

                custom_panel.add(t_wingspan       );
                custom_panel.add(t_wingspan_format);

                switch (animalType) {

                    case Eagle:
                        t_altitudeOfFlight        = new JLabel("Altitude Of Flight: ");
                        t_altitudeOfFlight_format = new JTextField("");

                        custom_panel.add(t_altitudeOfFlight       );
                        custom_panel.add(t_altitudeOfFlight_format);
                        break;

                    case Pigeon:
                        t_family        = new JLabel("Family: ");
                        t_family_format = new JTextField("");

                        custom_panel.add(t_family       );
                        custom_panel.add(t_family_format);
                        break;

                    default:
                        break;
                }
                break;

            default:
                //unreachable
                JOptionPane.showMessageDialog(null, "ERROR unreachable?","Error", JOptionPane.ERROR_MESSAGE);
                break;
        }






        top_panel.add(t_tittle, BorderLayout.CENTER);


        center_panel.add(t_name);
        center_panel.add(t_name_format);

        center_panel.add(t_gender);
        center_panel.add(combo_gender);

        center_panel.add(t_weight);
        center_panel.add(t_weight_format);

        center_panel.add(t_speed);
        center_panel.add(t_speed_format);

        center_panel.add(t_medals);
        center_panel.add(combo_medals);

        center_panel.add(t_maxEnergy);
        center_panel.add(t_maxEnergy_format);

        center_panel.add(t_energyPerMeter);
        center_panel.add(t_energyPerMeter_format);


        bottom_panel.add(custom_panel, BorderLayout.NORTH);
        bottom_panel.add(b_Add, BorderLayout.CENTER);




        //center_panel.add(t_medals);
        //center_panel.add(t_weight_format);

        global_panel.add(top_panel, BorderLayout.NORTH);
        global_panel.add(center_panel, BorderLayout.CENTER);
        global_panel.add(bottom_panel, BorderLayout.SOUTH);

        this.add(global_panel);




        this.setTitle("Add New Animal");
        //this.setBounds(150, 150, 400, 260);
        this.setMinimumSize(new Dimension(400,265));
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }



    private void printAnimal(){

        Gender temp_Gender = combo_gender.getSelectedItem().toString().equals("Female") ? Gender.FEMALE : (Gender.MALE);


        switch (animalFamily) {
            case Water:

                //String f = t_weight_format.getText();
                //double f2 = Double.parseDouble(t_weight_format.getText());

                switch (animalType) {
                    case Alligator:

                        containerAnimals.AddToContainer(
                                new Alligator(
                                        t_name_format.getText(),
                                        temp_Gender,
                                        Double.parseDouble(t_weight_format.getText()),
                                        Double.parseDouble(t_speed_format.getText()),
                                        null,
                                        Double.parseDouble(t_diveDept_format.getText()),
                                        t_areaOfLiving_format.getText(),
                                        Integer.parseInt(t_maxEnergy_format.getText()),
                                        Integer.parseInt(t_energyPerMeter_format.getText())) );

                        break;

                    case Whale:

                        containerAnimals.AddToContainer(
                                new Whale(
                                        t_name_format.getText(),
                                        temp_Gender,
                                        Double.parseDouble(t_weight_format.getText()),
                                        Double.parseDouble(t_speed_format.getText()),
                                        null,
                                        Double.parseDouble(t_diveDept_format.getText()),
                                        t_foodType_format.getText(),
                                        Integer.parseInt(t_maxEnergy_format.getText()),
                                        Integer.parseInt(t_energyPerMeter_format.getText())) );

                        break;

                    case Dolphin:

                        boolean isWaterSweet_bool = combo_isWaterSweet.getSelectedItem().toString().equals("No");

                        containerAnimals.AddToContainer(
                                new Dolphin(
                                        t_name_format.getText(),
                                        temp_Gender,
                                        Double.parseDouble(t_weight_format.getText()),
                                        Double.parseDouble(t_speed_format.getText()),
                                        null,
                                        Double.parseDouble(t_diveDept_format.getText()),
                                        isWaterSweet_bool,
                                        Integer.parseInt(t_maxEnergy_format.getText()),
                                        Integer.parseInt(t_energyPerMeter_format.getText())) );

                        break;

                    default:
                        break;
                }
                break;



            case Terrestrial:
                switch (animalType) {

                    case Dog:

                        containerAnimals.AddToContainer(
                                new Dog(
                                        t_name_format.getText(),
                                        temp_Gender,
                                        Double.parseDouble(t_weight_format.getText()),
                                        Double.parseDouble(t_speed_format.getText()),
                                        null,
                                        t_breed_format.getText(),
                                        Integer.parseInt(t_maxEnergy_format.getText()),
                                        Integer.parseInt(t_energyPerMeter_format.getText())) );

                        break;

                    case Cat:

                        boolean isCastrated_bool = combo_castrated.getSelectedItem().toString().equals("No");

                        containerAnimals.AddToContainer(
                                new Cat(
                                        t_name_format.getText(),
                                        temp_Gender,
                                        Double.parseDouble(t_weight_format.getText()),
                                        Double.parseDouble(t_speed_format.getText()),
                                        null,
                                        isCastrated_bool,
                                        Integer.parseInt(t_maxEnergy_format.getText()),
                                        Integer.parseInt(t_energyPerMeter_format.getText())) );
                        break;

                    case Snake:

                        boolean isPoisonous = combo_poisonous.getSelectedItem().toString().equals("No");

                        containerAnimals.AddToContainer(
                                new Snake(
                                        t_name_format.getText(),
                                        temp_Gender,
                                        Double.parseDouble(t_weight_format.getText()),
                                        Double.parseDouble(t_speed_format.getText()),
                                        null,
                                        isPoisonous,
                                        Double.parseDouble(t_s_length_format.getText()),
                                        Integer.parseInt(t_maxEnergy_format.getText()),
                                        Integer.parseInt(t_energyPerMeter_format.getText())) );
                        break;

                    default:
                        break;
                }
                break;


            case Air:

                switch (animalType) {

                    case Eagle:

                        containerAnimals.AddToContainer(
                                new Eagle(
                                        t_name_format.getText(),
                                        temp_Gender,
                                        Double.parseDouble(t_weight_format.getText()),
                                        Double.parseDouble(t_speed_format.getText()),
                                        null,
                                        Double.parseDouble(t_wingspan_format.getText()),
                                        Double.parseDouble(t_altitudeOfFlight_format.getText()),
                                        Integer.parseInt(t_maxEnergy_format.getText()),
                                        Integer.parseInt(t_energyPerMeter_format.getText())) );

                        break;

                    case Pigeon:

                        containerAnimals.AddToContainer(
                                new Pigeon(
                                        t_name_format.getText(),
                                        temp_Gender,
                                        Double.parseDouble(t_weight_format.getText()),
                                        Double.parseDouble(t_speed_format.getText()),
                                        null,
                                        Double.parseDouble(t_wingspan_format.getText()),
                                        t_family_format.getText(),
                                        Integer.parseInt(t_maxEnergy_format.getText()),
                                        Integer.parseInt(t_energyPerMeter_format.getText())) );

                        break;

                    default:
                        break;
                }
                break;

            default:
                //unreachable
                JOptionPane.showMessageDialog(null, "ERROR default","Error", JOptionPane.ERROR_MESSAGE);
                break;
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
                case "Add":
                    printAnimal();
                    custom_close();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Button not exists", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}

