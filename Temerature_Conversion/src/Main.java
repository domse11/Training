import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner CelsiusScanner = new Scanner(System.in);

        System.out.println("\n Bitte geben Sie den grad Celsius um zum umrechnen in Fahrenheit");
        int celsius = CelsiusScanner.nextInt();

        int fahrenheit = temperature_conversion(celsius);

        System.out.println(celsius +" Grad Celsius" + " sind " + fahrenheit + " Fahrenheit ");
    }


    public static int temperature_conversion(int celsius) {

        int fahrenheit = (int) ((celsius * 9.0 / 5) + 32);

        return fahrenheit;
    }
}