//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(42, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    public static boolean isValid(int isinrage) {

        if (isinrage >= 10 && isinrage <= 1000) {
            return true;
        }
        return false;
    }


    public static boolean hasSameLastDigit(int first, int second, int third) {

        if (first <= 10 || second <= 10 || third <= 10 || first >= 1000 || second >= 1000 || third >= 1000) {
            return false;
        }

        first = first % 10;

        second = second % 10;

        third = third % 10;

        if (first == second || first == third || second == third) {
            return true;
        } else {
            return false;
        }
    }
}

