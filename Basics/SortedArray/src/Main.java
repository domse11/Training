import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] unsortedArray = {106, 26, 81, 5, 15};
        int[] sortedArray = getIntegers(unsortedArray);
        System.out.println("_".repeat(50));
        int[] descsortedarray = sortIntegers(sortedArray);
        printArray(descsortedarray);
    }

    public static void printArray(int[] sortedArray) {

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println("Element " + i + " contents " + sortedArray[i]);
        }
    }

    public static int[] getIntegers(int[] unsortedArray) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            // why 5 ? array starts at 0, we want 5 numbers which means 0 -> 4 = 5
            System.out.println("Enter a Number");
            unsortedArray[i] = scanner.nextInt();
        }
        System.out.println("Numbers entered for Array -> " + Arrays.toString(unsortedArray));
        scanner.close();
        return unsortedArray;
    }

    public static int[] sortIntegers(int[] unsortedArray) {
        System.out.println("Array before sorting " + Arrays.toString(unsortedArray));
        int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        System.out.println("Arrays after sorting " + Arrays.toString(sortedArray) + "\n");
        return sortedArray;
    }
}