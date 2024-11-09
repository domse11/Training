
public class Main {
    public static void main(String[] args) {
        System.out.println();
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("James", highScorePosition);

    }

    public static void displayHighScorePosition(String playername, int highScorePosition) {

        System.out.println(playername + " managed to get into position " + highScorePosition + " on the high score list");

    }


    public static int calculateHighScorePosition(int playerscore) {

        int position = 0;

        if (playerscore >= 1000) {
            position = 1;
        } else if (playerscore >= 500) {
            position = 2;
        } else if (playerscore >= 100) {
            position = 3;
        } else {
            position = 4;
        }

        return position;
    }
}