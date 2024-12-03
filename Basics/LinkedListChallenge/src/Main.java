import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class Main {


    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();

        addPlace(placesToVisit, new Place("adelaide", 1374));
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Perth", 3923));
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Melbourne", 877));

        placesToVisit.addFirst(new Place("Sydney", 0));

        System.out.println(placesToVisit);

        Scanner scanner = new Scanner(System.in);
        var iterator = placesToVisit.listIterator();
        boolean menu = false;
        boolean forward = true;

        while (!menu) {

            if (!iterator.hasPrevious()) {
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }

            if (!iterator.hasNext()) {
                System.out.println("Final : " + iterator.previous());
                forward = false;
            }

            System.out.println("Available actions (select word or letter)" + "\n" +
                    "(F)orward" + "\n" +
                    "(B)ackward" + "\n" +
                    "(L)ist Places" + "\n" +
                    "(M)enu" + "\n" +
                    "(Q)uit"
            );

            switch (scanner.nextLine().toUpperCase()) {
                case "F":
                    System.out.println("User wants to go forward");
                    if (!forward) {           // Reversing Direction
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next();  // Adjust position forward
                        }
                    }

                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;

                case "B":
                    System.out.println("User wants to go backwards");
                    if (forward) {           // Reversing Direction
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();  // Adjust position backwards
                        }
                    }

                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;

                case "L":
                    System.out.println(placesToVisit);
                    break;
                case "M":
                    break;
                case "Q":
                    System.out.println("Thanks and goodbye!");
                    menu = true;
                    break;
                default:
                    menu = true;
                    break;
            }

        }

    }


    private static void addPlace(LinkedList<Place> list, Place place) {

        if (list.contains(place)) {
            System.out.println("Found duplicate: " + place);
            return;
        }

        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate: " + place);
                return;
            }
        }

        int matchIndex = 0;
        for (var listPlace : list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchIndex, place);
                return;
            }
            matchIndex++;
        }
        list.add(place);
    }


}