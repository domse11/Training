import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] numbers = readIntegers();
        findMin(numbers);
    }

    private static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        String input = scanner.nextLine();
        System.out.println("You entered : " + input);

        String[] StringArray = input.split(",");

        int[] numbers = new int[StringArray.length];

        for (int i = 0; i < StringArray.length; i++) {
            numbers[i] = Integer.parseInt(StringArray[i].trim());
        }

        System.out.println("The Array is: " + Arrays.toString(numbers));

        scanner.close();
        return numbers;
    }

    private static void findMin(int numbers[]) {

        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number in Array : " + smallest);
    }
}