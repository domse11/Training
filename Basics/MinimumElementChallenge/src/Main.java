import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers for the array: ");
        String input = sc.nextLine();

        String[] StringArray = input.split(",");

        int[] numbers = new int[StringArray.length];

        for (int i = 0; i < StringArray.length; i++) {
            numbers[i] = Integer.parseInt(StringArray[i].trim());
        }

        System.out.println("The Array is: " + Arrays.toString(numbers));
        reverse(numbers);
        System.out.println("Final: " + Arrays.toString(numbers));
    }

    public static void reverse(int[] array) {

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println("--> " + Arrays.toString(array));
        }
    }

}