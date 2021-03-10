package pl.michal;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    Graphic grafika = new Graphic();

    public MyFrame(){

//        this.getContentPane().setPreferredSize(new Dimension(500,500));
        this.setTitle("Solar System");
        grafika.setPreferredSize(new Dimension(1680,720));
        this.add(grafika);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
    }

}
