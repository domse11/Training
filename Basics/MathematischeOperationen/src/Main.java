import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte erste Nummer eingeben");
        int number1 = scanner.nextInt();

        System.out.println("Bitte zweite Nummer eingeben");
        int number2 = scanner.nextInt();

        int result = multiplizieren(number1, number2);
        istGerade(result);
    }

    public static int multiplizieren(int number1, int number2) {

        int result = number1 * number2;
        System.out.println("Das Ergebnis von " + number1 + " * " + number2 + " = " + result + "\n");
        return result;
    }

    public static int istGerade(int result) {

        if (result % 2 == 0) {
            System.out.println("Das Resultat" + result + " ist gerade");
        } else {
            System.out.println("Das Resultat " + result + " ist ungerade");
        }

        return result;
    }
}