//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6)); // should return true
        System.out.println(isPerfectNumber(28)); // should return true
        System.out.println(isPerfectNumber(5)); // should return false
        System.out.println(isPerfectNumber(-1)); // should return false
    }

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }
        System.out.println("number = " + number);

        int SumofDivisor = 0;
        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                SumofDivisor = SumofDivisor + i;
                System.out.println("i = " + i);
            }

        }

        return SumofDivisor == number;
    }

}