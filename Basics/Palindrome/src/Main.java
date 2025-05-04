public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(1337));
        System.out.println(isPalindrome(404));


    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit = 0;
        int originalnumber = number;

        while (number != 0) {

            System.out.println("Original number = " + originalnumber);

            lastDigit = number % 10;
            System.out.println("lastDigit = " + lastDigit);

            reverse = reverse * 10 + lastDigit;
            System.out.println("reverse = " + reverse);

            number = number / 10;
            System.out.println("number = " + number);

            System.out.println("__________\n");

        }

        if (originalnumber == reverse) {
            System.out.println(reverse + " is a palindrome.");
        } else {
            System.out.println(reverse + " is not a palindrome.");
        }

        return originalnumber == reverse;
    }
}