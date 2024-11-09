
public class Main {
    public static void main(String[] args) {

        int number = 0;
        int sumofMatches = 0;

        for (int i = 1; i <= 1000; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                number++;
                sumofMatches += i;
                System.out.println("Found a match = " + i);
            }
            if (number == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sumofMatches);
    }
}