//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int start, int end) {

        int startappearsinboth;
        int startlast;
        int endappearsinboth;
        int endlast;

        if (start < 10 || start > 99 || end < 10 || end > 99) {
            System.out.println("invalid input");
            return false;
        }

        System.out.println("Start = " + start);
        System.out.println("End = " + end);

        startlast = start % 10;
        startappearsinboth = start / 10;

        endlast = end % 10;
        endappearsinboth = end / 10;

        if (startappearsinboth == endappearsinboth || startappearsinboth == endlast ||
                startlast == endappearsinboth || startlast == endlast) {
            return true;
        } else {
            return false;
        }
    }
}