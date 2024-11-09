

public class Main {
    public static void main(String[] args) {

        sumFirstAndLastDigit(252);
        sumFirstAndLastDigit(257);
        sumFirstAndLastDigit(0);
        sumFirstAndLastDigit(5);
        sumFirstAndLastDigit(-10);

    }

    public static void sumFirstAndLastDigit(int number) {
        int firstnumber = 0;
        int lastnumber = 0;
        int sum = 0;

        if (number < 0) {
            System.out.println("number must be positive = -1");
            return;
        }


        lastnumber = number % 10;
        System.out.println("lastnumber = " + lastnumber);

        // Berechnung der ersten Ziffer
        firstnumber = number;
        while (firstnumber >= 10) {
            firstnumber = firstnumber / 10;
        }
        System.out.println("firstnumber = " + firstnumber);

        sum = firstnumber + lastnumber;
        System.out.println("sum = " + sum + "\n");
    }
}