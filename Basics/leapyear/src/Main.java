import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nGeben Sie eine Jahreszahl an");
        int year = scanner.nextInt();
        isLeapYear(year);

    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {

            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("\n" + year + " ist ein Schaltjahr");
                return true;
            } else {
                System.out.println("\n" + year + " ist kein Schaltjahr");
                return false;
            }
        } else {
            System.out.println("\nJahr außerhalb des gültigen Bereichs");
            return false;
        }
    }


}