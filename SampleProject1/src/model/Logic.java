package model;

public class Logic {

    public boolean atribute1;
    public int atribute2;
    public float atribute3;
    public String atribute4;

    private static byte oneByte = -128;

    private char variable1 = 'a';


    public Logic() {
        atribute1 = true;
        atribute2 = 5;
        atribute3 = 4.5f;
        atribute4 = "Ave";

    }


    //methods:

    public char getVariable1() {

        var variable1 = this.variable1;

        return variable1;
    }

    public static void main(String[] args) {

        Logic logicInstance = new Logic();
        System.out.println(logicInstance.variable1);

    }


}
