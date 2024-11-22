import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Timezones {

    private ZonedDateTime austriatime;

    public void printTimeForCity() {
        Scanner scanner = new Scanner(System.in);

        // Get the current time in Austria
        austriatime = ZonedDateTime.now(ZoneId.of("Europe/Vienna"));
        DateTimeFormatter austriaFormatter = DateTimeFormatter.ofPattern("HH:mm, EEEE");


        System.out.println("Enter the city name (e.g., Los Angeles, Tokyo, London): ");
        String city = scanner.nextLine().toLowerCase();
        System.out.println("Time in Austria: " + austriatime.format(austriaFormatter));
        String timeZone;

        // Map city names to time zones
        switch (city) {
            case "los angeles":
                timeZone = "America/Los_Angeles";
                break;
            case "new york":
                timeZone = "America/New_York";
                break;
            case "london":
                timeZone = "Europe/London";
                break;
            case "berlin":
                timeZone = "Europe/Berlin";
                break;
            case "tokyo":
                timeZone = "Asia/Tokyo";
                break;
            case "sydney":
                timeZone = "Australia/Sydney";
                break;
            case "dubai":
                timeZone = "Asia/Dubai";
                break;
            default:
                System.out.println("Sorry, I don't recognize that city or its time zone.");
                return;
        }

        // Get the current time in the selected time zone
        ZonedDateTime cityTime = ZonedDateTime.now(ZoneId.of(timeZone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm, EEEE");
        System.out.println("Time in " + city + ": " + cityTime.format(formatter));

        // Calculate the time difference using UTC offsets
        int austriaOffset = austriatime.getOffset().getTotalSeconds() / 3600; // Offset in hours
        int cityOffset = cityTime.getOffset().getTotalSeconds() / 3600;       // Offset in hours
        int timeDifference = cityOffset - austriaOffset;

        // Print the time difference
        System.out.printf("Time difference between austria and %s: %d hours", city, timeDifference);
    }
}
