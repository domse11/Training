//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.1756));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, -3.123));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(1.2345, 1.2344));
    }

    public static boolean areEqualByThreeDecimalPlaces (double param1, double param2){

        long param1rounded = (long) (param1 * 1000);
        long param2rounded = (long) (param2 * 1000);

        return param1rounded == param2rounded;
    }

}