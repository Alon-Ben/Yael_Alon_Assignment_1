package Graphics;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;


import Animals.Animal;
import Animals.Animal.Gender;
import Animals.Animal.Orientation;
import Animals.Pigeon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;



public class CompetitionFrame extends JFrame {
    private JPanel global_panel;

    private JMenuBar top_menu;
    private JPanel middle_panel;
    private JPanel bottom_panel;
    private JButton b_Competition, b_Add_Animal, b_Clear, b_Eat, b_Info, b_Exit;

    private AnimalFamily animalFamily;

    //private Background_Component background;
    private ContainerAnimals container;

    private CompetitionPanel competitionPanel;

    public static void main(String[] args) throws IOException {
        CompetitionFrame obj = new CompetitionFrame();
        obj.setVisible(true);
    }


    //public void paintComponent(Graphics g) { //TODO
    //    super.paintComponent(g);
    //    g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    //}

    public CompetitionFrame() throws IOException {

        container = new ContainerAnimals();


        //     ###_###------###_###
        //     |     Top Menu     |
        //     ###_###------###_###
        top_menu = new JMenuBar();

        JMenu m_file = new JMenu("File");
        JMenu m_help = new JMenu("Help");

        top_menu.add(m_file);
        top_menu.add(m_help);

        JMenuItem mOption_1_1 = new JMenuItem("Exit");
        JMenuItem mOption_2_1 = new JMenuItem("Help");

        mOption_1_1.addActionListener(new CompetitionFrame.ButtonEventListener());
        mOption_2_1.addActionListener(new CompetitionFrame.ButtonEventListener());


        m_file.add(mOption_1_1);
        m_help.add(mOption_2_1);


        //     ###_###------------------------###_###
        //     |     Middle - Competition Panel     |
        //     ###_###------------------------###_###
        middle_panel = new JPanel(); // middle_panel is the CompetitionPanel
        //middle_panel.setLayout(new OverlayLayout(middle_panel));
        //middle_panel.setLayout(new GridLayout(1,1));
        //middle_panel.setLayout(new BorderLayout());
        //middle_panel.setLayout(new GridBagLayout());
        //middle_panel.setLayout(null);

        competitionPanel = CompetitionPanel.createAndShowGUI(middle_panel, this, container.images_arr);




//
//
//        JFrame frame = new JFrame("LayeredPaneDemo2");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JComponent newContentPane = new LayeredPaneDemo2();
//        //newContentPane.setOpaque(true); //content panes must be opaque
//        this.add(newContentPane);
//        this.pack();
//        this.setVisible(true);
//
//
//
//        middle_panel.setPreferredSize(new Dimension(1190,920));
//        //middle_panel.setBounds(70, 70, 1190, 920);
//        middle_panel.setBounds(new Rectangle(70, 70, 1190, 920));
//        middle_panel.setBorder(BorderFactory.createTitledBorder( "middle_panel Border"));
//
//
//        background = new Background_Component("src/Assets/competitionBackground.png");
//        //middle_panel.add(background);
//        //middle_panel.add(background);
//        middle_panel.add(background, 1, 0);
//        //background.setLocation();
//        background.setLayout(null);
//        background.setLocation(0, 0);
//        //middle_panel.moveToBack(background);
//
//        Image_Component image_component = new Image_Component("src/Assets/competitionBackground.png");
//        middle_panel.add(image_component, 0, 0);
//        background.setLocation(400, 400);

        //middle_panel.setVisible(true);


        //middle_panel.setOpaque( false );

//
//        middle_panel.setX(100);
//        middle_panel.setY(100);

        //ImageIcon img1 = null;
        //try {
        //    img1 = new ImageIcon("src/Assets/eagle1.png");
        //}
        //catch (Exception e){
        //    e.printStackTrace();
        //}
//        middle_panel.printNewAnimal(img1,1);
//
//        middle_panel.setX(10);
//        middle_panel.setY(10);


//
//        ImageIcon img2 = null;
//        try {
//            img2 = new ImageIcon("src/Assets/eagle2.png");
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        middle_panel.printNewAnimal(img2,2);
//
//        //middle_panel.setX(90);
//        //middle_panel.setY(90);
//
//
//        ImageIcon img3 = null;
//        try {
//            img3 = new ImageIcon("src/Assets/eagle3.png");
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        middle_panel.printNewAnimal(img3,3);
//
//        //middle_panel.setX(190);
//        //middle_panel.setY(190);
//





        //middle_panel.add(new JLabel(img2));



//        ImageIcon img = null;
//
//        try {
//            img = new ImageIcon("src/Assets/competitionBackground.png");
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }

        //middle_panel.add(new JLabel(img), BorderLayout.CENTER);


        //middle_panel.add(new AnimalPanels());

        //middle_panel.add(new JLabel(img));




        //printNewAnimal( img)


        //middle_panel.printNewAnimal(img);








        //     ###_###----------###_###
        //     |     Bottom Panel     |
        //     ###_###----------###_###
        b_Competition = new JButton("Competition");
        b_Add_Animal  = new JButton("Add Animal");
        b_Clear       = new JButton("Clear");
        b_Eat         = new JButton("Eat");
        b_Info        = new JButton("Info");
        b_Exit        = new JButton("Exit");

        bottom_panel = new JPanel();
        bottom_panel.setLayout(new GridLayout(1,6, 1, 1));

        bottom_panel.add(b_Competition);
        bottom_panel.add(b_Add_Animal);
        bottom_panel.add(b_Clear);
        bottom_panel.add(b_Eat);
        bottom_panel.add(b_Info);
        bottom_panel.add(b_Exit);

        b_Competition.addActionListener(new CompetitionFrame.ButtonEventListener());
        b_Add_Animal .addActionListener(new CompetitionFrame.ButtonEventListener());
        b_Clear      .addActionListener(new CompetitionFrame.ButtonEventListener());
        b_Eat        .addActionListener(new CompetitionFrame.ButtonEventListener());
        b_Info       .addActionListener(new CompetitionFrame.ButtonEventListener());
        b_Exit       .addActionListener(new CompetitionFrame.ButtonEventListener());//{public void actionPerformed(ActionEvent e){System.exit(0);}};


        //     ###_###----###_###
        //     |     Global     |
        //     ###_###----###_###
        this.setTitle("Competition");
        //this.setBounds(70, 70, 1190, 920);
        this.setBounds(280, 30, 1206, 948);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //this.setResizable(false);

        //top_menu.setBackground(Color.white);
        //bottom_panel.setBackground(Color.white);


        this.add(top_menu, BorderLayout.NORTH); //connect menu to frame


        global_panel = new JPanel(); // main panel
        global_panel.setLayout(new BorderLayout());

        global_panel.add(middle_panel, BorderLayout.NORTH); //sub-panel of global_panel
        global_panel.add(bottom_panel, BorderLayout.SOUTH);  //sub-panel of global_panel

        this.add(global_panel);

        //this.pack();
        this.setVisible(true);
    }

    private void custom_close(){
        this.dispose();
    }

    private void tryRedirrect(){
        if (animalFamily != null){
            ChooseAninalFrame ca_frame = new ChooseAninalFrame(container, animalFamily);
            ca_frame.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Please choose the animal family first. \n\n tip:\n\t Press a button: [Competition]",
                    "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void tryOpenCompetition(){
        if (animalFamily == null){
            CompTypeSelectionFrame ctsf_frame = new CompTypeSelectionFrame(this);
            ctsf_frame.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Sorry, you have already chose an animal family. \n\n tip:\n\t Now press a button: [Add Animal]",
                    "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void setAnimalFamily(AnimalFamily a){
        if (animalFamily == null){
            animalFamily = a;
        }
    }


    public void openInfoTable(){
        TableFrame info_frame = new TableFrame();
    }

    class ButtonEventListener implements ActionListener {

        public void actionPerformed(ActionEvent e){

            String command = e.getActionCommand();

            switch (command) {
                case "Competition":
                    tryOpenCompetition();
                    break;
                case "Add Animal":
                    tryRedirrect();
                    break;
                case "Clear":
                    JOptionPane.showMessageDialog(null, "Clear", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
                case "Eat": //Todo
                    competitionPanel.custom_move1();
                    competitionPanel.custom_move2();
                    competitionPanel.custom_move3();
                    //JOptionPane.showMessageDialog(null, "Eat", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
                case "Info":
                    openInfoTable();
                    break;
                case "Exit":
                    custom_close();
                    System.exit(0); //if there another frames opened
                    break;
                case "Help":
                    JOptionPane.showMessageDialog(null, "Home Work 2 \n GUI", "Message", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Button not exists", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }



//    public void printing(){
//
//        ImageIcon img1 = null;
//        try {
//            img1 = new ImageIcon("src/Assets/eagle1.png");
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        middle_panel.printNewAnimal(img1,1);
//
//        middle_panel.setX(10);
//        middle_panel.setY(10);
//
//
//
//        ImageIcon img2 = null;
//        try {
//            img2 = new ImageIcon("src/Assets/eagle2.png");
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        middle_panel.printNewAnimal(img2,2);
//
//        //middle_panel.setX(90);
//        //middle_panel.setY(90);
//
//
//        ImageIcon img3 = null;
//        try {
//            img3 = new ImageIcon("src/Assets/eagle3.png");
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        middle_panel.printNewAnimal(img3,3);
//
//        //middle_panel.setX(190);
//        //middle_panel.setY(190);
//    }

//    public Image_Component setBackground(String path) throws IOException {
//        this.background = new Image_Component(path);
//        return this.background;
//    }

    class ContainerAnimals {
        private Animal[] animals_arr;
        private JLabel[] images_arr;
        private int animals_count;

        ContainerAnimals(){
            animals_arr = new Animal[30];
            images_arr = new JLabel[30];
            animals_count = 0;
        }

        public void AddToContainer(Animal a){
            ++animals_count;

            this.animals_arr[animals_count] = a;
            this.images_arr[animals_count] =  new JLabel( a.getImg(Orientation.EAST));

            competitionPanel.addJLabel(this.images_arr[animals_count]);

            //System.out.println(a.toString());
            a.makeSound();
            //animal_arr[animal_count].drawObject();
            //printing();
        }

        public Animal GetAnimal(int i){
            return animals_arr[i];

        }
    }
}