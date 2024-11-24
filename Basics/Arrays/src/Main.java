import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] unsortedArray = getRandomArray(5);

        System.out.println("Original Array -> " + Arrays.toString(unsortedArray));

        int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        Arrays.sort(sortedArray);
        System.out.println("Sorted Array -> " + Arrays.toString(sortedArray));

        System.out.println("_".repeat(50));
        int[] descsortedarray = sortIntegers(new int[]{7, 30, 35});
        System.out.println("Descending Sorted Array -> " + Arrays.toString(descsortedarray));

        /*int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));*/

        /*int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));

        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));
        System.out.println(Arrays.toString(thirdArray));*/

    }

    private static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] newInt = new int[len];

        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(1000);
        }
        return newInt;
    }

    private static int[] sortIntegers(int[] unsortedArray) {
        System.out.println("Array before sorting "+Arrays.toString(unsortedArray));
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
                    System.out.println("----->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("-->" + Arrays.toString(sortedArray));
        }

        return sortedArray;
    }
}