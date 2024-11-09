import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte Nummer eingeben");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println(number + " ist Negativ");
        } else if (number > 0) {
            System.out.println(number + " ist Positiv");
        } else if (number == 0) {
            System.out.println(number + " ist Null");
        }

    }


}
