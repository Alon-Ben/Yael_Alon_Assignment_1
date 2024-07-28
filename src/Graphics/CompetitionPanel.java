package Graphics;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import static java.awt.GridBagConstraints.*;
import static javax.imageio.ImageIO.read;

public class CompetitionPanel extends JPanel
        implements ActionListener, MouseMotionListener {

    private JLayeredPane layeredPane;
    private JLabel[] array_labels;
    private JLabel backLabel;
    private int count;

    private CompetitionFrame competitionFrame;
    private GridBagConstraints cons;



    public CompetitionPanel() throws IOException {
        array_labels = new JLabel[31];

        layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(1180, 840));
        layeredPane.setLayout(new GridBagLayout());
        layeredPane.addMouseMotionListener(this);


        backLabel = new JLabel(new ImageIcon(read(new File("src/Assets/competitionBackground.png"))));


        cons = new GridBagConstraints(0,0,1,1,0,0,CENTER,BOTH,new Insets(0,0,0,0),0,0);

        layeredPane.add(backLabel, cons  ,0);
        count = -1;

        add(layeredPane);
    }

    static CompetitionPanel createAndShowGUI(JPanel middle_panel, CompetitionFrame competitionFrame, JLabel[] array_labels) throws IOException {
        CompetitionPanel newContentPane = new CompetitionPanel();

        //newContentPane.setOpaque(true); //content panes must be opaque
        middle_panel.add(newContentPane);

        newContentPane.competitionFrame = competitionFrame;
        newContentPane.array_labels = array_labels;

        middle_panel.setVisible(true);
        return newContentPane;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
        array_labels[0].setLocation(e.getX()-array_labels[0].getWidth()/2,
                e.getY()-array_labels[0].getHeight()/2);

        array_labels[1].setLocation(e.getX()-array_labels[1].getWidth()/2 + 50,
                e.getY()-array_labels[1].getHeight()/2 + 50 );

        array_labels[2].setLocation(e.getX()-array_labels[2].getWidth()/2 - 50,
                e.getY()-array_labels[2].getHeight()/2 - 50 );
    }



    public void custom_move1() {
        array_labels[0].setLocation(((int) array_labels[0].getLocation().getX()) - 15,
                (int) array_labels[0].getLocation().getY() + 15);
    }

    public void custom_move2() {
        array_labels[1].setLocation( ((int) array_labels[1].getLocation().getX()) + 10,
                ((int) array_labels[1].getLocation().getY()) );
    }

    public void custom_move3() {
        array_labels[2].setLocation( ((int) array_labels[2].getLocation().getX()) - 10,
                ((int) array_labels[2].getLocation().getY()) );

        array_labels[3].setLocation( ((int) array_labels[3].getLocation().getX()) ,
                ((int) array_labels[3].getLocation().getY()) + 10);
    }



    public void mouseDragged(MouseEvent e) {} //do nothing


    public void addJLabel(JLabel animal_label) {

//        try {   //check
//          animal_label = new JLabel(new ImageIcon(read(new File("src/Assets/cat1W.png"))));
//        }
//        catch (IOException e) { System.out.println("Cannot load image"); }
////        layeredPane.setOpaque(false);
//

//        ++count;
//        array_labels[count] = animal_label;
//        int temp = count;
////        layeredPane.add(dukeLabel, cons, 0);
////        dukeLabel.setLocation(110,50);
//        layeredPane.add(animal_label, cons, 0);
//        animal_label.setLocation(50,150);




        layeredPane.removeAll();
        removeAll();

        layeredPane.add(backLabel, cons  ,0);
        backLabel.setLocation(0,0);

//        try {
//            array_labels[0] = new JLabel(new ImageIcon(read(new File("src/Assets/cat1W.png"))));
//            array_labels[1] = new JLabel(new ImageIcon(read(new File("src/Assets/cat1E.png"))));
//            array_labels[2] = new JLabel(new ImageIcon(read(new File("src/Assets/cat1S.png"))));
//            array_labels[3] = new JLabel(new ImageIcon(read(new File("src/Assets/cat1N.png"))));
//            count = 4;
//        }
//        catch (IOException e) { System.out.println("Cannot load image #2"); }



        ++count;
        this.array_labels[count]  = animal_label;

        for(int i = 0 ; i < count+1; ++i){
            layeredPane.add(array_labels[i], cons, 0);
            array_labels[i].setLocation(110*(i+1),50*(i+1));
            //array_labels[i].setPreferredSize(new Dimension(64, 64));
        }
        layeredPane.add(this.array_labels[count], cons, 0);


        this.add(layeredPane, cons, 0);


        competitionFrame.pack(); //IMPORTANT !!!!


//        layeredPane.add(array_labels[0], cons, 0);
//        array_labels[0].setLocation(11,11);
//
//        layeredPane.add(array_labels[1], cons, 0);
//        array_labels[1].setLocation(50,50);
//
//        layeredPane.add(array_labels[2], cons, 0);
//        array_labels[2].setLocation(-50,-50);

//        layeredPane.add(array_labels[3], cons, 0);
//        array_labels[3].setLocation(110,50);








        //competitionFrame.repaint();


////        layeredPane.remove(backLabel);
//
////        ++bl_index;
//
//        layeredPane.add(backLabel, cons, count);
//        add(layeredPane);
//
//        //layeredPane.setComponentZOrder(backLabel, ++bl_index);
//
//
////        layeredPane.setPreferredSize(new Dimension(1190, 840));
////        animal_label.setLocation(50,50);
////        competitionFrame.setPreferredSize(new Dimension( 1206, 930));
//        competitionFrame.setBounds(280, 30, 1206, 930);
//        animal_label.setLocation(50,50);
//        competitionFrame.pack();
//
////        layeredPane.add(backLabel, cons  ,31);
//        add(layeredPane, cons, 0);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

    }
}

