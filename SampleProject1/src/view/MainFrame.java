package view;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        this.setSize(900,900);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Prueba con contador de clicks sobre boton");

        //Panel instance
        MainPanel mainPanel = new MainPanel();

        //Addition of panel to frame
        this.add(mainPanel);



        this.setVisible(true);
    }



}
