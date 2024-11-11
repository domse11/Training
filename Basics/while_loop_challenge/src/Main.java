
public class Main {
    public static void main(String[] args) {

        int startnumber = 4;
        int endnumber = 20;
        int countevennumbers = 0;
        int countoddnumberes = 0;

        System.out.println("Startnumber = " + startnumber + "\n");

        while (startnumber <= endnumber && countoddnumberes < 5) {

            if (!isEvenNumber(startnumber)) {
                countoddnumberes++;
            } else {
                System.out.println("Even number " + startnumber);
                countevennumbers++;
            }
            startnumber++;
        }
        System.out.println("\n" + "Counted evennumbers: " + countevennumbers);
        System.out.println("Counted oddnumbers: " + countoddnumberes);
    }


    public static boolean isEvenNumber(int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}