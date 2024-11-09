//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        hasTeen(9, 99, 19);
        hasTeen(23, 15, 42);
        hasTeen(22, 23, 34);
        System.out.println("______");
        isTeen(9);
        isTeen(13);
    }

    public static boolean hasTeen(int number1, int number2, int number3) {
        boolean isTeen1 = number1 >= 13 && number1 <= 19;
        boolean isTeen2 = number2 >= 13 && number2 <= 19;
        boolean isTeen3 = number3 >= 13 && number3 <= 19;

        if (isTeen1) {
            System.out.println("Number " + number1 + " is true");
        }
        if (isTeen2) {
            System.out.println("Number " + number2 + " is true");
        }
        if (isTeen3) {
            System.out.println("Number " + number3 + " is true");
        }

        return isTeen1 || isTeen2 || isTeen3;
    }

    public static boolean isTeen(int number) {
        if (number >= 13 && number <= 19) {
            System.out.println("Number " + number + " is true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}