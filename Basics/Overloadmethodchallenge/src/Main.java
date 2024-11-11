
public class Main {
    public static void main(String[] args) {

        System.out.println("5ft, 8in = " + convertToCentimers(5, 8) + "cm");
        System.out.println("68 in = " + convertToCentimers(68) + "cm");
    }

    public static double convertToCentimers(int inches) {

        return inches * 2.54;
    }

    public static double convertToCentimers(int feet, int inches) {

        return convertToCentimers((feet * 12) + inches);

    }

}