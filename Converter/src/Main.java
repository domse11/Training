import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte wählen Sie eine Kategorie (1: kg zu lbs, 2: lbs zu kg):");
        String category = scanner.nextLine();

        System.out.println("Bitte geben Sie den Wert ein:");
        double value = scanner.nextDouble();

        choice(category, value);
    }

    public static String choice(String category, double value) {

        boolean playagain = true;
        Scanner scanner = new Scanner(System.in);

        while (playagain) {

            switch (category) {

                case "1":
                    double resultKgToLbs = kgtolbs(value);
                    System.out.println(value + " Kilogramm sind " + resultKgToLbs + " Pfund.");
                    break;

                case "2":
                    double resultLbsToKg = lbstokg(value);
                    System.out.println(value + " Pfund sind " + resultLbsToKg + " Kilogramm.");
                    break;

                default:
                    System.out.println("Ungültige Kategorie gewählt. Bitte wählen Sie 1 oder 2.");
            }


            System.out.println("\nWollen Sie erneut Starten? \n 1 für Ja \n 2 für Nein");
            String erneut = scanner.next().toString();

            switch (erneut) {
                case "1":
                    scanner.nextLine();
                    System.out.println("Bitte wählen Sie eine Kategorie (1: kg zu lbs, 2: lbs zu kg):");
                    category = scanner.nextLine();

                    System.out.println("Bitte geben Sie den Wert ein:");
                    value = scanner.nextDouble();
                    break;
                case "2":
                    playagain = false;
                    System.out.println("Programm beendet. Auf Wiedersehen!");
                    break;
                default:
                    System.out.println("Ungültige Eingabe. Bitte 1 oder 2 wählen.");
                    break;
            }
        }
        return category;
    }


    public static double kgtolbs(double value) {

        System.out.println("1 Kilogram = 2,20 Pound");

        return value * 2.2046226218;
    }

    public static double lbstokg(double value) {

        System.out.println("1 Pound = 0,45 Kilogram");
        return value * 0.453592;
    }
}