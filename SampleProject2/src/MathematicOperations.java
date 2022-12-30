
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MathematicOperations {


    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //Clase especial: Math

        System.out.println(Math.ceil(x)); //aproximación entera hacia arriba (ceiling).
        System.out.println(Math.floor(x)); //aproximacion entera hacia abajo

        System.out.println(Math.pow(x, y)); //La potencia: x elevado a la y
        System.out.println(Math.max(x, y)); //El numero maximo entre a y b.
        System.out.println(Math.sqrt(x)); //La raiz cuadrada de x
        System.out.println(Math.sqrt(x)); //La raiz cuadrada de x

        //For example: to calculate the area of a circle:
        // A = PI*r^2
        System.out.println(Math.PI * Math.pow(x, 2)); //x is the radius

        //Sphere area
        // A = 4*PI*r^2
        System.out.println("Area of a sphere with radius "+ x + " is = " + Math.PI * 4 * Math.pow(x, 2) + " superficial units.");

        //Sphere volume
        // V = 4/3 * PI * r^3
        System.out.println("Volume of a sphere with radius "+ x + " is = " + Math.PI * (4/3) * Math.pow(x, 3) + " volumetric units.");


        //IMC calculator

        DecimalFormat df =new DecimalFormat("#.##");

        String user = "Rorro";
        double weight = 64; //in kg
        double height = 1.73; //in cm

        double IMC = weight/(Math.pow(height, 2));

        String IMCs = df.format(IMC);

        System.out.println("El IMC de " + user + " cuya altura es " + height + " metros y peso es " + weight + " kilogramos es de: " + IMCs);
    }
}
