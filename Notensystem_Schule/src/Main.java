import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie die Punkteanzahl des Schülers ein");
        int pktsystem = scanner.nextInt();

        punktezahl(pktsystem);
    }

    public static int punktezahl(int pktsystem) {

        if (pktsystem >= 90 && pktsystem <= 100) {
            System.out.println("Note A");
        } else if (pktsystem >= 80 && pktsystem <= 89)
            System.out.println("Note B");

        else if (pktsystem >= 70 && pktsystem <= 79)
            System.out.println("Note C");

        else if (pktsystem >= 60 && pktsystem <= 69)
            System.out.println("Note D");

        else if (pktsystem <= 59) {
            System.out.println("Note F");

        } else if (pktsystem >= 101) {
            System.out.println("Über 100 = Note A");
        }
        return pktsystem;
    }


}