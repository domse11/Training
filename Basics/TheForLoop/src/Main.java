//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at " + rate + " % interest = " + interestAmount);
        }
        System.out.println("\n" + "___________________" + "\n");

        for (double i = 7.5; i <= 10.0; i = i + 0.25) {
            double interestAmount = calculateInterest(100.0, i);
            System.out.println("10,000 at " + i + " % interest = " + "$ " + interestAmount);

            if (interestAmount > 8.5) {
                break;
            }
        }

        // better
        /*for (double i = 7.5; i <= 10.0; i += 0.25) {
            double interestAmount = calculateInterest(10000.0, i);
            System.out.println("10,000 at " + i + " % interest = " + interestAmount);
        }*/
    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }
}