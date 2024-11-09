import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Enter number: ");
        int number = scanner.nextInt();

        boolean result = isODD(number);*/

        System.out.println("Enter start number");
        int startnumber = scanner.nextInt();
        System.out.println("Enter end number");
        int endnumber = scanner.nextInt();

        System.out.println(sumOdd(startnumber, endnumber));
    }


    public static boolean isODD(int it) {

        if (it > 0 && it % 2 != 0) {
            System.out.println("The number " + it + " is odd");
            return true;
        } else {
            if (it < 0) {
                System.out.println("Invalid input ! Entered number is not positive");
                return false;
            } else {
                System.out.println("The number " + it + " is even");
                return false;
            }
        }
    }

    public static int sumOdd(int start, int end) {

        int oddnumberssum = 0;

        for (int i = start; i <= end; i++) {

            if (start > 0 && end > 0 && start <= end) {
                isODD(i);
                if (i % 2 != 0) {
                    oddnumberssum += i;
                }
            } else
                return -1;
        }
        System.out.println("Sum of odd numbers: " + oddnumberssum);
        return oddnumberssum;
    }
}
