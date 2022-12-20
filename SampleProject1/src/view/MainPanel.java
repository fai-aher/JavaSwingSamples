package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel implements ActionListener {

    //Atributes
    JLabel title = new JLabel("Bienvenido/a a la prueba de contador de clicks", SwingConstants.CENTER);

    JButton clickButton = new JButton("Clickea aqui");

    JLabel counter = new JLabel("Se ha clickeado 0 veces el boton", SwingConstants.CENTER);

    int clickCounter = 0;



    //Modificacion atributos


    public MainPanel(){

        this.setLayout(new BorderLayout());

        //Font
        Font newFont = new Font("Verdana", Font.PLAIN, 32);

        //North
        title.setFont(newFont); //Modificacion JLabel title
        title.setBounds(400, 100, 600, 300 );
        title.setPreferredSize(new Dimension(900, 250));

        this.add(title, BorderLayout.NORTH);

        //Center
        clickButton.setSize(300, 300);
        clickButton.setFont(newFont);
        clickButton.addActionListener(this);
        clickButton.setPreferredSize(new Dimension(500, 300));

        this.add(clickButton, BorderLayout.CENTER);

        //South
        counter.setSize(600, 300);
        counter.setFont(newFont);
        counter.setPreferredSize(new Dimension(900, 250));

        this.add(counter, BorderLayout.SOUTH);

        //West
        JPanel westPanel = new JPanel();
        westPanel.setPreferredSize(new Dimension(250,300));
        this.add(westPanel, BorderLayout.WEST);

        //East
        JPanel eastPanel = new JPanel();
        eastPanel.setPreferredSize(new Dimension(250,300));
        this.add(eastPanel, BorderLayout.EAST);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if (source == clickButton){
            clickCounter += 1;
            String part1 = "Se ha clickeado ";
            String part2 = " veces el boton";
            String finalLabel = part1+clickCounter+part2;

            this.counter.setText(finalLabel);
        }

    }
}
