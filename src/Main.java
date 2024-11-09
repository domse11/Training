// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

       int newValue = 50;
       if (newValue == 50) {
           System.out.println("This is an error");
       }


       boolean isCar = false;
       if(isCar) {
           System.out.println("This is not supposed to happen");
       } else {
           System.out.println("This should happen");
       }

       String makeofCar = "Volkswagen";
       boolean isDomesetic = makeofCar != "Volkswagen" ? true : false;

       if (!isDomesetic) {
           System.out.println("This car is domestic to our country");
       }

       int ageOfClient = 20;

       String ageText = ageOfClient >= 18 ? "Over Eighteen" : "Still a kid";

        System.out.println("Our client is "+ ageText);

        System.out.println("__________________________");



       double first = 20.00;

        double second = 80.00;

        double together = (first + second) * 100;

        System.out.println(together);

        double remainder = together % 40;

        System.out.println(remainder);

        boolean a = (remainder == 0) ? true : false;

        System.out.println(a);

        if(!a){
            System.out.println("got some remainder");
        }
        else {
            System.out.println("got no remainder");
        }

    }
}