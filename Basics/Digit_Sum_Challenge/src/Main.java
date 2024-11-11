public class Main {
    public static void main(String[] args) {
        System.out.println("The sum of the Digits is " + sumDigits(125));
        System.out.println("The sum of the Digits is " + sumDigits(1000));
        System.out.println("The sum of the Digits is " + sumDigits(9));
        System.out.println("The sum of the Digits is " + sumDigits(-5));
        System.out.println("The sum of the Digits is " + sumDigits(1234));
        System.out.println("The sum of the Digits is " + sumDigits(-125));
        System.out.println("The sum of the Digits is " + sumDigits(4));
        System.out.println("The sum of the Digits is " + sumDigits(32123));
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
