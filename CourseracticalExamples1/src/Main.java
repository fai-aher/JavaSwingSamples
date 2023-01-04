public class Main {

    /* Atributos */

    //Ejercicio 1

    String miNombre = "Fai";
    String hermana = "Yurieth";
    String hermano = "Brayan";
    String padre = "Alonso";
    String madre = "paola";
    String perrito = "scooby";
    String ave = "cuquito";
    char edadAve = '4';
    char edadPerrito = '5';
    byte edadMadre = 42;
    byte edadPadre = 48;
    byte edadHermano = 17;
    byte edadHermana = 13;
    byte edadMia = 19;

    //Ejercicio 2

    char c = 'z';
    int i1 = 250;
    double d = 301.067;
    int i2 = 100;
    int i3 = 737;
    double d2 = 298.638;


    /* Metodos */

    //Ejercicio 1: Presentar a mi familia
    private void presentarFamilia() {
        System.out.println("\nHola!, quisiera presentarte a mi familia :)... \nMi nombre es " + miNombre + "\nMis padres se llaman: " + madre + " y " + padre + ". Ellos tienen respectivamente " +
                edadMadre + " y " + edadPadre + " años de edad." + "\nMi hermano menor se llama " + hermano + " y tiene " + edadHermano + " años." + "\nMi hermana se llama " + hermana + " y tiene "
        + edadHermana + " años." + "\nTenemos dos bonitas mascotas, ellos son:" + "\nNuestro perrito" + perrito + " que tiene " + edadPerrito + " años y nuestro ave " + ave + " que tiene " + edadAve + "años viviendo con nostoros."
        + "\n\nEso ha sido todo.");
    }

    //Ejercicio 2:

    //Usando los dos tipos de casting que aprendiste (implícito y explícito), resuelve los siguientes casteos indicando qué tipo es y si se está calculando estimación o exactitud.
    //
    //char c = ‘z’; conviertelo a int
    //int i = 250; conviertelo a long y luego de long a short
    //double d = 301.067; conviertelo a long
    //int i = 100; súmale 5000.66 y conviertelo a float
    //int i = 737; multiplícalo por 100 y conviertelo a byte
    //double d = 298.638; divídelo entre 25 y conviertelo a long

    private void conversionTiposVariables() {

        int newChar = c;
        long longI1 = i1;
        short shortI1 = (short) longI1;
        long sumD = (long) (d + 301.067);
        float ni2 = (float) (i2 + 5000.66);
        long nd2 = (long) (d2 / 25);


        //print
        System.out.println("Las nuevas variables son las siguientes:\n" +
                "c: " + newChar + "\n" +
                "i1: " + "Forma long: " + longI1 +  ", forma short: " + shortI1  + "\n" +
                "d:" + " Suma y conversion a long como estimacion: " + sumD + "\n" +
                "i2: " + "Suma y conversion a float como calculo con exactitud: " + ni2 + "\n" +
                "d2: " + "Division y conversion a long como estimacion: " + nd2

                );

    }

    //Finished

    public Main() {
        //empty constructor specification, just for using atributes and methods of Main in the main method.
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");

        Main mainInstance = new Main();

        /* Prints */
        //Ejercicio 1
        mainInstance.presentarFamilia();
        //Ejercicio 2
        mainInstance.conversionTiposVariables();

        //Finished
        
    }


}