package view;
import model.logic;

import java.util.stream.IntStream;

public class MainRunner {

    public static void main(String[] args) {

        //Initialize Frame and interface
        new MainFrame();


        //Logic instructions
        logic instance = new logic();

        IntStream.range(1, 5).forEachOrdered(n -> {

            String numToStr = Integer.toString(n);

            String atributeName = "atribute" + numToStr;

            System.out.println(atributeName);

            switch (atributeName) {

                case "atribute1":
                    System.out.println(instance.atribute1);
                    break;
                case "atribute2":
                    System.out.println(instance.atribute2);
                    break;
                case "atribute3":
                    System.out.println(instance.atribute3);
                    break;
                case "atribute4":
                    System.out.println(instance.atribute4);
                    break;
                default:
                    System.out.println("No atribute found");
                    break;

            }

        });

    }

}