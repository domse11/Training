public class Main {
    public static void main(String[] args) {


        double x = 20;

        double y = 80;

        double z = (x + y) * 100;
        System.out.println(z);

        double remainder = z % 40;
        System.out.println("the remainder of z is " + remainder);

        boolean variable;

        if (remainder == 0.00) {
            System.out.println("The remainder is " + remainder);
            variable = true;
            System.out.println(variable);

        } else {
            System.out.println("The remainder is " + remainder);
            variable = false;
            System.out.println(variable);
            System.out.println("got some remainder");
        }


    }
}