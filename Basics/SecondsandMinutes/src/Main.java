
public class Main {
    public static void main(String[] args) {

        System.out.println(getDurationString(-3945)); // 1 parameter
        System.out.println(getDurationString(-65, 45)); // 2 parameters
        System.out.println(getDurationString(65, 145)); // 2 parameters
        System.out.println(getDurationString(65, 45)); // 2 parameters
        System.out.println(getDurationString(3945)); // 1 parameters

    }


    public static String getDurationString(int seconds) {

        int minutes = seconds / 60;
        if (seconds < 0) {
            return "invalid data for seconds (" + seconds + "), must be a positive integer value";
        }
        return getDurationString(minutes % 60, seconds % 60);
    }


    public static String getDurationString(int minutes, int seconds) {

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;

        if (minutes < 0) {
            return "invalid data for seconds (" + minutes + "), must be a positive integer value";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds(" + seconds + "), must be between 0 and 59";
        }

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

}