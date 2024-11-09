//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Test der Methode getDigitCount
        System.out.println("Digit Count of 0: " + getDigitCount(0));        // Erwartet: 1
        System.out.println("Digit Count of 123: " + getDigitCount(123));    // Erwartet: 3
        System.out.println("Digit Count of -12: " + getDigitCount(-12));    // Erwartet: -1
        System.out.println("Digit Count of 5200: " + getDigitCount(5200));  // Erwartet: 4

        System.out.println();

        // Test der Methode reverse
        System.out.println("Reverse of -121: " + reverse(-121));            // Erwartet: -121
        System.out.println("Reverse of 1212: " + reverse(1212));            // Erwartet: 2121
        System.out.println("Reverse of 1234: " + reverse(1234));            // Erwartet: 4321
        System.out.println("Reverse of 100: " + reverse(100));              // Erwartet: 1

        System.out.println();

        // Test der Methode numberToWords
        System.out.println("Number to words for 123:");
        numberToWords(123); // Erwartet: "One Two Three"

        System.out.println("\nNumber to words for 1010:");
        numberToWords(1010); // Erwartet: "One Zero One Zero"

        System.out.println("\nNumber to words for 1000:");
        numberToWords(1000); // Erwartet: "One Zero Zero Zero"

        System.out.println("\nNumber to words for -12:");
        numberToWords(-12); // Erwartet: "Invalid Value"
    }


    // Methode zur Ausgabe der Zahl als Wörter
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversedNumber = reverse(number); // Umgekehrte Zahl erhalten
        int originalDigitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reversedNumber);

        // Drucke die Wörter für jede Ziffer in der umgekehrten Zahl
        while (reversedNumber > 0) {
            int lastDigit = reversedNumber % 10;
            printWord(lastDigit);
            reversedNumber /= 10;
        }

        // Füge führende Nullen hinzu, wenn nötig
        for (int i = 0; i < originalDigitCount - reversedDigitCount; i++) {
            System.out.println("Zero");
        }
    }


    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }


    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1; // 0 hat eine Ziffer
        }
        int counter = 0;
        while (number > 0) {
            counter++;
            number /= 10;
        }
        return counter;
    }


    private static void printWord(int digit) {
        switch (digit) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
        }
    }
}