import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner Zahlenberechnung = new Scanner(System.in);
        boolean Playagain = true;

        while (Playagain) {

            System.out.println("Bitte geben Sie die Erste Zahl ein");

            double Erstezahl = Zahlenberechnung.nextDouble();

            System.out.println("Bitte geben Sie die Zweite Zahl ein");

            double Zweitezahl = Zahlenberechnung.nextDouble();

            System.out.println("Sie haben die Zahl " + Erstezahl + " und " + Zweitezahl + " gewählt");
            System.out.println("Wählen sie eine Operation (+, -, *, /)");
            char auswahl = Zahlenberechnung.next().charAt(0);

            double result;

            switch (auswahl) {
                case '+':
                    result = Addition(Erstezahl, Zweitezahl);
                    System.out.println("Ergebnis: " + Erstezahl + " + " + Zweitezahl + " = " + result);
                    break;

                case '-':
                    result = Subtraction(Erstezahl, Zweitezahl);
                    System.out.println("Ergebnis: " + Erstezahl + " - " + Zweitezahl + " = " + result);
                    break;

                case '*':
                    result = Multiplikation(Erstezahl, Zweitezahl);
                    System.out.println("Ergebnis: " + Erstezahl + " * " + Zweitezahl + " = " + result);
                    break;

                case '/':
                    result = Division(Erstezahl, Zweitezahl);
                    System.out.println("Ergebnis: " + Erstezahl + " / " + Zweitezahl + " = " + result);
                    break;
            }
            System.out.println("\nMöchten Sie nochmal von vorne beginnen?");
            System.out.println("1 für Ja \n2 für Nein");
            String erneut = Zahlenberechnung.next().toString();

            switch (erneut) {
                case "1":
                    Playagain = true;
                    break;
                case "2":
                    Playagain = false;
                    System.out.println("Danke, bis bald!");
                    break;
            }
        }

    }

    public static double Addition(double Erstezahl, double Zweitezahl) {

        double Ergebnis = Erstezahl + Zweitezahl;

        return Ergebnis;
    }

    public static double Subtraction(double Erstezahl, double Zweitezahl) {

        double Ergebnis = Erstezahl - Zweitezahl;

        return Ergebnis;
    }


    public static double Multiplikation(double Erstezahl, double Zweitezahl) {
        double Ergebnis = Erstezahl * Zweitezahl;

        return Ergebnis;
    }

    public static double Division(double Erstezahl, double Zweitezahl) {
        double Ergebnis = Erstezahl / Zweitezahl;

        return Ergebnis;
    }
}