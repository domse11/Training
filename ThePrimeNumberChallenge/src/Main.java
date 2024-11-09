
public class Main {
    public static void main(String[] args) {

        /*System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");

        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number");
        System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime number");*/

        int count = 0;

        for (int i = 10; count < 3 && i < 50; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                count++;
            }
        }
        System.out.println("Total number of prime numbers between 10 and 50 is " + count);

    }

    public static boolean isPrime(int wholenumber) {

        if (wholenumber <= 2) {
            return (wholenumber == 2);
        }

        for (int divisor = 2; divisor <= wholenumber / 2; divisor++) {
            if (wholenumber % divisor == 0) {
                return false;
            }

        }
        return true;
    }

}