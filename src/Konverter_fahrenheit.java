import java.util.Scanner;
public class Konverter_fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fahrenheit: ");

        double fahrenheit = input.nextDouble();

      /*  double celcius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " er tilsvarende " + celcius + " i Celsius");
    */

        konverter(fahrenheit);
    }
    public static void konverter(double fahrenheit){
        double celcius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println(fahrenheit + " Fahrenheit" + " er tilsvarende " + celcius + " i Celsius");
    }

}
