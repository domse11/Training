import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);


        int SUM = 0;
        int AVG = 0;

        try {


            while (true) {
                System.out.println("Enter an integer: ");
                String notanint = scanner.nextLine();

                int number = Integer.parseInt(notanint);

                SUM = SUM + number;
                AVG = Math.round(SUM / number);
            }
        } catch (Exception e) {
            System.out.println("SUM = " + SUM);
            System.out.println("AVG = " + AVG);
        }
    }
}