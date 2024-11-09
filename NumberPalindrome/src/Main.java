//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }


    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int lastdigit = 0;
        int original = number;

        while (number != 0) {
            System.out.println("Initial number = " + number);

            lastdigit = number % 10;
            System.out.println("lastdigit = " + lastdigit);

            reverse = reverse * 10 + lastdigit;
            System.out.println("reverse = " + reverse);

            number = number / 10;
            System.out.println("number = " + number);

            System.out.println("__________");

            if (original == reverse) {
                System.out.println(reverse + " is a palindrome.");
            }
        }
        return original == reverse;
    }
}