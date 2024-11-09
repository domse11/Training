//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));

    }

    public static int getLargestPrime(int number) {

        if (number <= 1) {
            return -1;
        }

        int factor = 2;

        while (number > 1) {

            if (number % factor == 0) {
                number = factor / factor;
            } else {
                factor++;
            }
        }

        return factor;
    }


}