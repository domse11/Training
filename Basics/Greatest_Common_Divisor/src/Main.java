//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25, 15)); // should returns 5
        System.out.println(getGreatestCommonDivisor(12, 30)); // should returns 6
        System.out.println(getGreatestCommonDivisor(9, 18)); // should returns -1
        System.out.println(getGreatestCommonDivisor(81, 153)); // should returns 9
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        int min;

        if (first < 10 || second < 10) {
            return -1;
        }


        if (first < second) {
            min = first;
        } else {
            min = second;
        }


        for (int i = min; i >= 1; i--) {
            if (first % i == 0 && second % i == 0) {
                return i;
            }
        }

        return 1;

    }


}