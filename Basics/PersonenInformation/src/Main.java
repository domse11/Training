import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte Namen eingeben");
        String Namen = scanner.nextLine();

        System.out.println("Bitte Alter eingeben");
        int Alter = scanner.nextInt();

        System.out.println("Bitte Körpergröße eingeben");
        double Körpergröße = scanner.nextDouble();

        System.out.println("Programmierer true oder false?");
        boolean Programmierer = scanner.nextBoolean();

        System.out.println("Der Name lautet: " + Namen + ", dein Alter ist " + Alter + ", deine Körpergröße ist " + Körpergröße + " und du bist Programmierer? " + Programmierer);
    }

}