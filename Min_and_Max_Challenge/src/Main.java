import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double newnumber;
        double loop = 1;

        Scanner scanner = new Scanner(System.in);

        double minnumber = 0;
        double maxnumber = 0;

        while (true) {

            System.out.println("Please enter a number: " + loop + ":");
            String number = scanner.nextLine();

            switch (number.toLowerCase()) {
                case "exit":
                    System.out.println("Exiting program.");
                    System.out.println("Final min number: " + minnumber);
                    System.out.println("Final max number: " + maxnumber);
                    System.exit(0); // Beendet das Programm
                    break;
                default:
                    break;
            }

            try {
                newnumber = Double.parseDouble(number);

                if (minnumber == 0 || loop == 0) {
                    minnumber = newnumber = Double.parseDouble(number);
                }
                if (maxnumber == 0 || loop == 0) {
                    maxnumber = newnumber = Double.parseDouble(number);
                }


                if (newnumber < minnumber) {
                    minnumber = newnumber;
                }

                if (newnumber > maxnumber) {
                    maxnumber = newnumber;
                }

                loop++;

            } catch (NumberFormatException e) {
                System.out.println("Not a number");
                break;
            }
            System.out.println("newnumber = " + newnumber + "\n");
            System.out.println("minnumber = " + minnumber + "\n");
            System.out.println("maxnumber = " + maxnumber + "\n");


        }

    }
}


