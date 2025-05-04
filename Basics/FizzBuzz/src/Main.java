public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            // if i is divisible by 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");

                // if i is divisible by 3
            } else if (i % 3 == 0) {
                System.out.println("Fizz");

                // if i is divisible by 5
            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else {
                // print every other digit
                System.out.println(i);
            }
        }
    }
}

