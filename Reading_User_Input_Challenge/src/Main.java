import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        validnumbers();
    }

    public static void validnumbers() {

        Scanner scanner = new Scanner(System.in);
        int numbersto5 = 1;
        double sum = 0;

        while (numbersto5 <= 5) {

            System.out.println("Please enter a number: " + numbersto5 + ":");
            String nextNumber = scanner.nextLine();

            try {
                //int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                numbersto5++;
                sum = sum + number;

            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
            System.out.println("The sum of the 5 numbers = " + sum);

        }


    }


}