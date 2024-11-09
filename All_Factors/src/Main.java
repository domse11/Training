//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        printFactors(6);
        System.out.println("______________");
        printFactors(32);
        System.out.println("______________");
        printFactors(10);
        System.out.println("______________");
        printFactors(-1);

    }

    public static void printFactors(int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}