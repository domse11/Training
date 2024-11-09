//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(canPack(1, 0, 4));  // Erwartet: false
        System.out.println(canPack(1, 0, 5));  // Erwartet: true
        System.out.println(canPack(0, 5, 4));  // Erwartet: true
        System.out.println(canPack(2, 2, 11)); // Erwartet: true
        System.out.println(canPack(-3, 2, 12)); // Erwartet: false
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int maxBigBagsUsed = Math.min(goal / 5, bigCount);
        int remainingGoal = goal - (maxBigBagsUsed * 5);

        return remainingGoal <= smallCount;
    }
}